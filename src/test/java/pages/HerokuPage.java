package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;


public class HerokuPage {

    @FindBy(
            xpath = "//*[text()='Add Element']"
    )
    public WebElement addElementButonu;
    @FindBy(
            xpath = "//*[text()='Delete']"
    )
    public WebElement deleteButonu;

    public HerokuPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
}

