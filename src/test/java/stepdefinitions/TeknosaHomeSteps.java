package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import pages.TeknosaHomePage;

public class TeknosaHomeSteps {

    TeknosaHomePage teknosahomePage = new TeknosaHomePage();

    @Given("Bildirimler acilir Cerezler kabul edilir")
    public void bildirimlerAçılırCerezlerKabulEdilir() {
        teknosahomePage.clickNotifAccept();
        teknosahomePage.clickCookieAccept();
    }

    @And("Footerdaki Kurumsal Magazalarimiz secilir")
    public void footerdakiKurumsalMagazalarimizSecilir() throws Exception {
        teknosahomePage.clickStores();
    }


    @And("Arama kutusuna Kulaklık yazilir ve enter tusuna basilir")
    public void arama_kutusuna_kulaklık_yazilir_ve_enter_tusuna_basilir() throws InterruptedException {
        teknosahomePage.sendKeysToSearchArea();
     }

}
