package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin={"html:target/cucumber-reports2.html",//Rapor almak için bu classtan çalıştırmalıyız.
                "json:target/json-reports/cucumber2.json",//(devam)cucumber-reports kısmı isteğe
                "junit:target/xml-report/cucumber2.xml" // göre isimlendirilebilir
        },
        features = "src/test/resources/features",
        glue = "stepdefinitions",
        tags = "@regression",

        dryRun = false//Testlerimizi çalıştırmak istediğimizde buradaki değer false olacak.
)       //Eğer eksik adımları tespit etmek istiyorsak true değeri alacak

public class ParalelRunner2 {
}
