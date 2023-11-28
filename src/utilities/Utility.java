package utilities;

import browserfactory.BaseTest;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Utility extends BaseTest {
    // click on the element method
    public void clickOnElement(By by){
        driver.findElement(by).click();
    }
    //select method
    public void selectByVisibleTextFromDropDown(By by,String text){
        WebElement element = driver.findElement(by);
        Select select = new Select(element);//make instance of class
        select.selectByVisibleText(text);
    }
    // text from element method
    public String getTextElement(By by){
        return driver.findElement(by).getText();
    }
    //mouseHover action method
    public void mouseHoverOnElements(By by){
        WebElement element = driver.findElement(by);
        Actions actions = new Actions(driver);// make instance of class
        actions.moveToElement(element).build().perform();
    }
    // click action on mouse hover element
    public void clickMouseHoverOnElements(By by) {
        WebElement element = driver.findElement(by);
        Actions actions = new Actions(driver);
        actions.moveToElement(element).click().build().perform();
    }
    //send text to element method
    public void sendTextToElement(By by, String text){
        driver.findElement(by).sendKeys(text);
    }
    //verify text method
    public void verifyText(String displayMessage, String expectedText, String actualText){
        Assert.assertEquals(displayMessage,expectedText,actualText);
    }
}

