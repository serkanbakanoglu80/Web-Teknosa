package utilities;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.openqa.selenium.Keys.END;
import static utilities.Driver.driver;

public class Action {

    public static void clickElement(By xpath){
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(xpath));
        wait.until(ExpectedConditions.visibilityOfElementLocated(xpath));
        WebElement element = Driver.getDriver().findElement(xpath);
        element.click();
    }


    public static void sendKeysElement(By xpath, String key){
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(xpath));
        WebElement element = Driver.getDriver().findElement(xpath);
        element.sendKeys(key);
    }

    public static String getTextElement(By xpath){
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(xpath));
        WebElement element = Driver.getDriver().findElement(xpath);
        return element.getText();
    }

    public static void pressEnter(By xpath){
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(xpath));
        WebElement element=Driver.getDriver().findElement(xpath);
        element.sendKeys(Keys.ENTER);
    }

    public static void  checkElementText(By xpath, String text){
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(xpath));
        WebElement element=Driver.getDriver().findElement(xpath);
        Assert.assertEquals(element.getText(),text);
    }

    public static void elementPresent(By xpath){
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(xpath));
        WebElement element=Driver.getDriver().findElement(xpath);
    }
    public static void elementNotPresent(By xpath){
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(20));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(xpath));
        WebElement element=Driver.getDriver().findElement(xpath);
    }

    public static void scrollIntoView(By xpath) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(xpath));
        WebElement element=Driver.getDriver().findElement(xpath);
        JavascriptExecutor je = (JavascriptExecutor) driver;
        je.executeScript("arguments[0].scrollIntoView(false);", element);
    }

    public static void focusElement(By xpath) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(xpath));
        WebElement element=Driver.getDriver().findElement(xpath);
        JavascriptExecutor je = (JavascriptExecutor) driver;
        je.executeScript("arguments[0].focus();", element);
    }


    public static void  checkElementValue(By xpath, String text){
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(xpath));
        WebElement element=Driver.getDriver().findElement(xpath);
        Assert.assertEquals(element.getAttribute("value"),text);
    }

    public static void clearText(By xpath){
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(xpath));
        WebElement element=Driver.getDriver().findElement(xpath);
        element.clear();
    }
}
