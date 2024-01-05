package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import pages.Page;

public class Steps {

    Page page = new Page();

    @Given("Cerezler kabul edilir")
    public void cerezlerKabulEdilir(){
        page.kabulEdilir();
    }


}
