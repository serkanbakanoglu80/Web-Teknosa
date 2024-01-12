package stepdefinitions;

import io.cucumber.java.en.And;
import pages.TeknosaLoginPage;
import pages.TeknosaLoginPage;

public class TeknosaLoginSteps {

    TeknosaLoginPage teknosaloginPage = new TeknosaLoginPage();

    @And("Üye Olmadan Devam Et butonuna tıklanarak")
    public void üyeOlmadanDevamEtButonunaTıklanarak() {

        teknosaloginPage.clickGuestButton();
    }

    @And("e-posta adresi girilir")
    public void ePostaAdresiGirilir() throws InterruptedException {

        teknosaloginPage.enterEmail();
    }
}
