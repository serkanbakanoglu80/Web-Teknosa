package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import utilities.Action;
import utilities.Driver;

public class TeknosaCartPage {

    public TeknosaCartPage() { PageFactory.initElements(Driver.getDriver() , this);}


    public final By firstProdPrice = By.xpath("(//div[@class=\"cart-row\"])[1]//div[@class='prd-row-block1']//b");
    public final By secondProdPrice = By.xpath("(//div[@class=\"cart-row\"])[2]//div[@class='prd-row-block1']//b");
    public final By incFirstProd = By.xpath("(//div[@class=\"cart-row\"])[1]//div[@class='crp-footer']//button[@class=\"plus  quantity-right-plus\"]");
    public final By incSecondProd = By.xpath("(//div[@class=\"cart-row\"])[2]//div[@class='crp-footer']//button[@class=\"plus  quantity-right-plus\"]");

    //    public final By afterIncSecondProd = By.xpath("(//div[@class=\"cart-row\"])[2]//div[@class='crp-footer']//div[@id=\"crp-delivery-145070325\"]");
    public final By cartSum = By.xpath("//div[@class=\"cart-sum-cta\"]/a/span");


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
            Thread.sleep(500);
//            Action.scrollIntoView(afterIncSecondProd);
            Action.clickElement(incSecondProd);
            System.out.println("2. ürün artırıldı");
        }
        Thread.sleep(5000);
    }

    public void clickCartSum() {
        Action.clickElement(cartSum);
    }

}
