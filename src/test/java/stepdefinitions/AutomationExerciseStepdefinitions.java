package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.AutoExerPage;

public class AutomationExerciseStepdefinitions {

    AutoExerPage autoExerPage = new AutoExerPage();
    Faker faker = new Faker();
    String emailAdress;//Eğer aşağıdaki fakerden gelen email adresini kaydetmek istediğimiz için oluşturduk

    @Given("user sign up linkine tiklar")
    public void user_sign_up_linkine_tiklar() {
        autoExerPage.signUpLinki.click();

    }
    @Given("user Create an account bolumune name ve email adresi girer")
    public void user_create_an_account_bolumune_name_ve_email_adresi_girer() {
        autoExerPage.signUpNameKutusu.sendKeys(faker.name().firstName());
        emailAdress= faker.internet().emailAddress();//Böylece hem kaydettik
        autoExerPage.signUpEmailKutusu.sendKeys(emailAdress);//hem de yolladık

    }

    @Given("signUp butonuna basar")
    public void sign_up_butonuna_basar() {
        autoExerPage.signUpButonu.click();

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
