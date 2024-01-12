package stepdefinitions;

import io.cucumber.java.en.And;
import pages.TeknosaCartPage;

public class TeknosaCartSteps {

    TeknosaCartPage teknosacartPage = new TeknosaCartPage();

    @And("En ucuzunun adedi artırılır")
    public void enUcuzununAdediArtirilir() throws InterruptedException {
        teknosacartPage.incCheapest();
    }

    @And("Alışverişi Tamamla tıklanır")
    public void alışverişiTamamlaTıklanır() {
        teknosacartPage.clickCartSum();

    }

}
