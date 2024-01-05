package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import pages.TeknosaHomePage;
import pages.TeknosaSearchPage;

public class TeknosaSearchSteps {

    TeknosaSearchPage teknosasearchPage = new TeknosaSearchPage();

    @And("Alt Kategorilerden “Bluetooth Kulaklık” seçilir")
    public void altKategorilerdenBluetoothKulaklıkSeçilir() throws InterruptedException {
        teknosasearchPage.clickSubCategory();
    }


    @And("En Çok Satanlar filtresi tıklanır")
    public void enÇokSatanlarFiltresiTıklanır() throws InterruptedException {
        teknosasearchPage.clickBestSellers();
    }

    @And("Ilk sayfadaki birinci ürün tıklanır")
    public void ılkSayfadakiBirinciÜrünTıklanır() {
        teknosasearchPage.clickFirstProduct();
    }

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


    @And("Ilk sayfadaki sonuncu ürün tıklanır")
    public void ılkSayfadakiSonuncuÜrünTıklanır() throws InterruptedException {
        teknosasearchPage.clickLastProduct();
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
