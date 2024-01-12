package stepdefinitions;

import io.cucumber.java.en.And;
import pages.TeknosaProductPage;

public class TeknosaSearchSteps {

    TeknosaProductPage teknosasearchPage = new TeknosaProductPage();





    @And("Sepete Ekle tıklanır")
    public void sepeteEkleTıklanır() throws InterruptedException {
        teknosasearchPage.clickAddToCart();
    }

    @And("Alışverişe devam et tıklanır")
    public void alışverişeDevamEtTıklanır() {
        teknosasearchPage.clickGoOnShopping();
    }


    @And("Onceki sayfaya geri dönülür")
    public void oncekiSayfayaGeriDönülür() {
        teknosasearchPage.backToPreviousPage();
    }




    @And("Sepetime Git e tıklanır")
    public void sepetimeGitETıklanır() {
        teknosasearchPage.clickGoToCart();
    }

    @And("En ucuzunun adedi artırılır")
    public void enUcuzununAdediArtirilir() throws InterruptedException {
        teknosasearchPage.incCheapest();
    }

    @And("Alışverişi Tamamla tıklanır")
    public void alışverişiTamamlaTıklanır() {
        teknosasearchPage.clickCartSum();

    }

    @And("Üye Olmadan Devam Et butonuna tıklanarak")
    public void üyeOlmadanDevamEtButonunaTıklanarak() {
        teknosasearchPage.clickGuestButton();
    }

    @And("e-posta adresi girilir")
    public void ePostaAdresiGirilir() throws InterruptedException {
        teknosasearchPage.enterEmail();
    }
}
