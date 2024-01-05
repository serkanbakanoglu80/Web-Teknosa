package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import utilities.Action;
import utilities.Driver;

public class Page {
    public Page(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    public final By acceptCookies = By.xpath("//button[contains (., 'Tümünü kabul et')]");


    public void kabulEdilir(){
        Action.clickElement(acceptCookies);
    }

}
