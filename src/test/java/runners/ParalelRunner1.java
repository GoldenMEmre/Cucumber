package runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin={"html:target/cucumber-reports1.html",//Rapor almak için bu classtan çalıştırmalıyız.
                "json:target/json-reports/cucumber1.json",//(devam)cucumber-reports kısmı isteğe
                "junit:target/xml-report/cucumber1.xml" // göre isimlendirilebilir
        },
        features = "src/test/resources/features",
        glue = "stepdefinitions",
        tags = "@ss",

        dryRun = false//Testlerimizi çalıştırmak istediğimizde buradaki değer false olacak.
)       //Eğer eksik adımları tespit etmek istiyorsak true değeri alacak
public class ParalelRunner1 {
}
