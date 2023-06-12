package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import pages.Guru99Page;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GuruStepdefinitions {

    List<String> sirketListesi = new ArrayList<>();//Sonradan burada (class level'da)oluşturuyoruz.
//Aşağıda da (p.25) buna değer ataması yapıyoruz.
    Guru99Page guru99Page = new Guru99Page();
    @Given("guru99 sayfasinda Cookies kabul eder")
    public void guru99_sayfasinda_cookies_kabul_eder() {//Bizde cookies çıkmıyor.
        Driver.getDriver().switchTo().frame(guru99Page.cookiesIFrame);//orijinalinde IFrame içinde
        guru99Page.acceptCookies.click();//olduğu için böyle yazdık
    }
    @Then("Company listesini consola yazdirir")
    public void company_listesini_consola_yazdirir() {
        //OOP UYGULAMASI
        sirketListesi = ReusableMethods.stringListeCevir(guru99Page.sirketElementList);
        System.out.println(sirketListesi);
//Burada Guru99Page'de web elementlerden oluşan listeyi buraya getiriyoruz.Buradan ReusableMethods'a
    }//(TestNG'den aldık)gönderiyoruz.Oradan da buraya Stringler'den oluşan bir liste dönecek.


    @And("listede {string} oldugunu test eder")
    public void listedeOldugunuTestEder(String istenenSirket) {
        Assert.assertTrue(sirketListesi.contains(istenenSirket));// Buradan şirket listesine ulaşabilmek
    }//için string listi class level da (p.15) oluşturup, p.25'de değer ataması yapıyoruz.

    @Then("tum sayfa Screenshot alir")
    public void tumSayfaScreenshotAlir() throws IOException {
        ReusableMethods.getScreenshot("Guru99");
    }

    @And("{string} Prev.Close degerini yazdirir")
    public void prevCloseDegeriniYazdirir(String istenenSirket) {

        //  //tbody/tr[9]/td[3]
        //  sirket ismi //tbody/tr[?]/td[1] locater'i ile bulunup
        // previous deger  //tbody/tr[?]/td[3] locater'i ile elde edilecek

        // satir sayisini bulalim


        int satirSayisi= guru99Page.satirlarListesi.size();

        for (int i = 1; i < satirSayisi; i++) {
            String dinamikXpath= "//tbody/tr["+ i +"]/td[1]";
            String satirdakiSirketIsmi=
                    Driver.getDriver().findElement(By.xpath(dinamikXpath)).getText();
            if (satirdakiSirketIsmi.equalsIgnoreCase(istenenSirket)){
                dinamikXpath="//tbody/tr["+ i +"]/td[3]";
                String istenenSirketPreValue=
                        Driver.getDriver().findElement(By.xpath(dinamikXpath)).getText();
                System.out.println(istenenSirketPreValue);
            }

        }
    }


    @Then("Prev.Close degerinin {string} oldugunu test eder")
    public void prevCloseDegerininOldugunuTestEder(String prevValue) {
    }
}
