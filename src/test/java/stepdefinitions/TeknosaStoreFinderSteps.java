package stepdefinitions;

import io.cucumber.java.en.And;
import pages.TeknosaStoreFinderPage;

import java.io.IOException;


public class TeknosaStoreFinderSteps {

    TeknosaStoreFinderPage teknosastorefinderPage = new TeknosaStoreFinderPage();

    @And("Il alaninda Ankara secilir")
    public void ilAlanindaAnkaraSecilir() throws InterruptedException {
        teknosastorefinderPage.selectCity();

    }

    @And("Ilce alaninda Cankaya secilir")
    public void ılceAlanindaCankayaSecilir() throws InterruptedException {
        teknosastorefinderPage.selectTown();
    }


    @And("Magazalar txt dosyasına yazdırılır")
    public void magazalarTxtDosyasınaYazdırılır() throws InterruptedException, IOException {
        teknosastorefinderPage.writestoreTxt();

    }
}
