package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import utilities.Action;
import utilities.Driver;

import static utilities.Driver.getDriver;

public class TeknosaProductPage {

    public TeknosaProductPage() { PageFactory.initElements(Driver.getDriver() , this);}


    public final By pdpAddtoCart = By.xpath("//button[@id=\"addToCartButton\"]");
    public final By pdpAfterAddtoCart = By.xpath("//button[@class=\"btn-compare\"]");
    public final By goOnShopping = By.xpath("//div[@class=\"pac-buttons\"]/a[contains(.,'Alışverişe Devam Et')]");
    public final By goToCart = By.xpath("//a[@href=\"/sepet\"]/span");



    public void clickAddToCart() throws InterruptedException {
        Action.scrollIntoView(pdpAddtoCart);
        Thread.sleep(500);
        Action.scrollIntoView(pdpAfterAddtoCart);
        Action.clickElement(pdpAddtoCart);
    }

    public void clickGoOnShopping() {
        Action.clickElement(goOnShopping);
    }

    public void backToPreviousPage() {
        getDriver().navigate().back();
    }

    public void clickGoToCart() {
        Action.clickElement(goToCart);
    }

}
