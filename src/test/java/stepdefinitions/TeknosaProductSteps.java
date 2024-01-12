package stepdefinitions;

import io.cucumber.java.en.And;
import pages.TeknosaProductPage;

public class TeknosaProductSteps {

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




}
