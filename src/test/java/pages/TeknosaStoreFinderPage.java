package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import utilities.Action;
import utilities.Driver;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import static utilities.Driver.driver;

public class TeknosaStoreFinderPage {

    public TeknosaStoreFinderPage() { PageFactory.initElements(Driver.getDriver() , this);}


    public final By teknosaCity = By.xpath("//select[@title='cities']");

    public final By ankara = By.xpath("//*[@id=\"cities1\"]/option[6]");
    public final By teknosaTown = By.xpath("//select[@title='towns']");
    public final By cankaya = By.xpath("//*[@id=\"towns\"]/option[7]");
    public final By storeone = By.xpath("(//div[@class='str-title'])[1]");
    public final By storetwo = By.xpath("(//div[@class='str-title'])[2]");
    public final By storethree = By.xpath("(//div[@class='str-title'])[3]");
    public final By storefour = By.xpath("(//div[@class='str-title'])[4]");

    public final By searchresult = By.xpath("//div[@class=\"stp-list-items\"]//div[@class=\"str\"][4]/div[@class=\"str-header\"]");



    public void selectCity() throws InterruptedException {
        Action.clickElement(teknosaCity);
        Thread.sleep(1000);
        Action.clickElement(ankara);
        Thread.sleep(1000);
    }

    public void selectTown() throws InterruptedException {
        Action.clickElement(teknosaTown);
        Thread.sleep(1000);
        Action.clickElement(cankaya);
        Thread.sleep(1000);
        Action.scrollIntoView(searchresult);
        Thread.sleep(5000);
    }

    public void writestoreTxt() throws InterruptedException, IOException {
        String firststoretext = Action.getTextElement(storeone);
        String secondstoretext = Action.getTextElement(storetwo);
        String thirdstoretext = Action.getTextElement(storethree);
        String fourthstoretext = Action.getTextElement(storefour);
    //    File f = new File("C:\\Users\\tr1b3218\\Desktop\\Selenium\\ICTerra-Cucumber 13 Aralık_ver_son\\ICTerra-Cucumber\\target\\teknosa-stores\\cankayastores.txt");
    //    f.createNewFile();
        FileWriter w = new FileWriter("C:\\Users\\tr1b3218\\Desktop\\Selenium\\ICTerra-Cucumber 13 Aralık_ver_son\\ICTerra-Cucumber\\src\\test\\resources\\testproof\\cankayastores.txt");
        BufferedWriter out = new BufferedWriter(w);
        out.write(firststoretext); out.newLine();
        out.write(secondstoretext); out.newLine();
        out.write(thirdstoretext); out.newLine();
        out.write(fourthstoretext); out.newLine();
        out.flush();

        System.out.println(firststoretext);
        System.out.println(secondstoretext);
        System.out.println(thirdstoretext);
        System.out.println(fourthstoretext);
    }




}
