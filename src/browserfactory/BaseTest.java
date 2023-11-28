package browserfactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class BaseTest {
    static String browser = "chrome";
    public static WebDriver driver;

    public void openBrowser(String baseUrl) throws InterruptedException {

        if (browser.equalsIgnoreCase("Chrome")){
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("Edge")) {
            driver = new EdgeDriver();
        } else if (browser.equalsIgnoreCase("Firefox")) {
            driver = new FirefoxDriver();
        } else {
            System.out.println("Wrong Browser");
        }
        //browser launch
        driver.get(baseUrl);
        //max the window
        driver.manage().window().maximize();
        //wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

    }

    public void closeBrowser() {
        driver.quit();
    }

}
