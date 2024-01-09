package pages;

import io.github.sukgu.Shadow;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import utilities.Action;
import utilities.Driver;

import java.util.regex.Pattern;

import static utilities.Driver.driver;
import static utilities.Driver.getDriver;

public class TeknosaSearchPage {

    public TeknosaSearchPage() { PageFactory.initElements(Driver.getDriver() , this);}


    public final By bestSellers = By.xpath("//label[@for=\"bestSellerPoint-desc\"]");

    public final By subCategory = By.xpath("//div[@class=\"input checkbox\"]/input[@id=\"category0\"]");

    public final By firstProduct = By.xpath("(//div[@id=\"product-item\"])[1]");

    public final By pdpAddtoCart = By.xpath("//button[@id=\"addToCartButton\"]");
    public final By pdpAfterAddtoCart = By.xpath("//button[@class=\"btn-compare\"]");

    public final By goOnShopping = By.xpath("//div[@class=\"pac-buttons\"]/a[contains(.,'Alışverişe Devam Et')]");

    public final By lastProduct = By.xpath("(//div[@id=\"product-item\"])[20]");
    public final By afterLastProduct = By.xpath("//button[@class=\"btn btn-extra plp-paging-load-more\"]");

    public final By goToCart = By.xpath("//a[@href=\"/sepet\"]/span");

    public final By firstProdPrice = By.xpath("(//div[@class=\"cart-row\"])[1]//div[@class='prd-row-block1']//b");

    public final By secondProdPrice = By.xpath("(//div[@class=\"cart-row\"])[2]//div[@class='prd-row-block1']//b");

    public final By incFirstProd = By.xpath("(//div[@class=\"cart-row\"])[1]//div[@class='crp-footer']//button[@class=\"plus  quantity-right-plus\"]");

    public final By incSecondProd = By.xpath("(//div[@class=\"cart-row\"])[2]//div[@class='crp-footer']//button[@class=\"plus  quantity-right-plus\"]");
    public final By cartSum = By.xpath("//div[@class=\"cart-sum-cta\"]/a/span");

    public final By guestButton = By.xpath("//a[@title=\"Üye Olmadan Devam Et\"]/span");

    public final By guestEmail = By.xpath("//input[@id=\"guest.email\"]");




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

    public void clickLastProduct() throws InterruptedException {
        Action.scrollIntoView(lastProduct);
        Thread.sleep(500);
        Action.scrollIntoView(afterLastProduct);
        Action.clickElement(lastProduct);
    }

    public void clickGoToCart() {
        Action.clickElement(goToCart);
    }

    public void incCheapest() throws InterruptedException {
        double firstprice =  Double.parseDouble(Action.getTextElement(firstProdPrice).replace(" TL","").replace(".","").replace(",","."));
        double secondprice =  Double.parseDouble(Action.getTextElement(secondProdPrice).replace(" TL","").replace(".","").replace(",","."));
        System.out.println("1. ürün: " + firstprice);
        System.out.println("2. ürün: " + secondprice);
        if (firstprice<=secondprice){
            Action.scrollIntoView(incFirstProd);
            Action.clickElement(incFirstProd);
            System.out.println("1. ürün artırıldı");
        }
        else{
            Action.scrollIntoView(incSecondProd);
            Action.clickElement(incSecondProd);
            System.out.println("2. ürün artırıldı");
        }
        Thread.sleep(5000);
    }

    public void clickCartSum() {
        Action.clickElement(cartSum);
    }
    public void clickGuestButton() {
        Action.clickElement(guestButton);
    }

    public void enterEmail() throws InterruptedException {
        Action.clickElement(guestEmail);
        Action.sendKeysElement(guestEmail, "testbitti@eriklabs.com");
        Thread.sleep(2000);
    }
}
