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
    public final By underTeknosaStores = By.xpath("//div[@class='fmi-menu']//a[@title=\"Pazaryeri Satıcısı Olun\"]");
    public final By searchField = By.xpath("//div[@class=\"sbx-input\"]/input[@id=\"search-input\"]");
    public final By bestSellers = By.xpath("//label[@for=\"bestSellerPoint-desc\"]");
    public final By subCategory = By.xpath("//div[@class=\"input checkbox\"]/input[@id=\"category0\"]");
    public final By firstProduct = By.xpath("(//div[@id=\"product-item\"])[1]");
    public final By lastProduct = By.xpath("(//div[@id=\"product-item\"])[20]");
    public final By afterLastProduct = By.xpath("//button[@class=\"btn btn-extra plp-paging-load-more\"]");


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
        Action.scrollIntoView(underTeknosaStores);
        Thread.sleep(400);
        Action.clickElement(teknosaStores);
    }

    public void sendKeysToSearchArea() throws InterruptedException {
            Action.sendKeysElement(searchField,"Kulaklık");
            Thread.sleep(1000);
            Action.pressEnter(searchField);
    }

    public void clickSubCategory() throws InterruptedException {
        Action.checkBoxClick(subCategory);
        Thread.sleep(1000);
    }

    public void clickBestSellers() throws InterruptedException {
        Action.clickElement(bestSellers);
        Thread.sleep(1000);
    }


    public void clickFirstProduct() {
        Action.clickElement(firstProduct);
    }

    public void clickLastProduct() throws InterruptedException {
        Action.scrollIntoView(lastProduct);
        Thread.sleep(500);
        Action.scrollIntoView(afterLastProduct);
        Action.clickElement(lastProduct);
    }

}
