package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import utilities.Action;
import utilities.Driver;

public class TeknosaLoginPage {

    public TeknosaLoginPage() { PageFactory.initElements(Driver.getDriver() , this);}


    public final By guestButton = By.xpath("//a[@title=\"Üye Olmadan Devam Et\"]/span");
    public final By guestEmail = By.xpath("//input[@id=\"guest.email\"]");



    public void clickGuestButton() {
        Action.clickElement(guestButton);
    }

    public void enterEmail() throws InterruptedException {
        Action.clickElement(guestEmail);
        Action.sendKeysElement(guestEmail, "testbitti@eriklabs.com");
        Thread.sleep(2000);
    }

}
