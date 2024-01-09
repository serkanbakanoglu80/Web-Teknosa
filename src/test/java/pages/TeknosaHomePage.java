package pages;

import io.github.sukgu.Shadow;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import utilities.Action;
import utilities.Driver;

import static utilities.Driver.getDriver;

public class TeknosaHomePage {

    public TeknosaHomePage() { PageFactory.initElements(Driver.getDriver() , this);}


    public final By teknosaNotifAccept = By.xpath("//div[@id='button-1580496494']");

    public final By teknosaStores = By.xpath("//div[@class='fmi-menu']//a[@title=\"Mağazalarımız\"]");

    public final By underteknosaStores = By.xpath("//div[@class='fmi-menu']//a[@title=\"Pazaryeri Satıcısı Olun\"]");

    public final By searchField = By.xpath("//div[@class=\"sbx-input\"]/input[@id=\"search-input\"]");

    public void clickNotifAccept() {
        Action.clickElement(teknosaNotifAccept);
    }

    public void clickCookieAccept() {
        Shadow shadow = new Shadow(getDriver());
        shadow.findElementByXPath(("//*[.='Kabul Et']")).click();
    }

    public void clickStores() throws Exception {
        Action.focusElement(teknosaStores);
        Thread.sleep(400);
        Action.scrollIntoView(underteknosaStores);
        Thread.sleep(400);
        Action.clickElement(teknosaStores);
    }

    public void sendKeysToSearchArea() throws InterruptedException {
            Action.sendKeysElement(searchField,"Kulaklık");
            Thread.sleep(1000);
            Action.pressEnter(searchField);
    }


}
