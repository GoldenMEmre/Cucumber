package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.AutoExerPage;

public class AutomationExerciseStepdefinitions {

    AutoExerPage autoExerPage = new AutoExerPage();
    @Given("user sign up linkine tiklar")
    public void user_sign_up_linkine_tiklar() {
        autoExerPage.signUpLinki.click();

    }
    @Given("user Create an account bölümüne name ve email adresi girer")
    public void user_create_an_account_bölümüne_email_adresi_girer() {

    }
    @Given("signUp butonuna basar")
    public void sign_up_butonuna_basar() {

    }
    @Given("user kisisel bilgilerini ve iletisim bilgilerini girer")
    public void user_kisisel_bilgilerini_ve_iletisim_bilgilerini_girer() {

    }
    @Given("user Create Account butonuna basar")
    public void user_create_account_butonuna_basar() {

    }
    @Then("hesap olustugunu test edin")
    public void hesap_olustugunu_test_edin() {

    }
}
