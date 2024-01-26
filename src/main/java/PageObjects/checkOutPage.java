package PageObjects;

import AbstractComponents.AbstractComponent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class checkOutPage extends AbstractComponent {
    public WebDriver driver;

    public checkOutPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

    @FindBy(css="input[placeholder='Select Country']")
    WebElement countryEditBox;

    @FindBy(xpath = "//button[@type='button'][2]")
    WebElement country;

    By countryBy = By.xpath("//button[@type='button'][2]");
    By countryEditBoxBy = By.cssSelector("input[placeholder='Select Country']");

    @FindBy(css = "a[class='btnn action__submit ng-star-inserted']")
    WebElement placeOrderButton;

    public void enterCountry(String cName){
        waitForEleLocated(countryEditBoxBy);
        countryEditBox.sendKeys(cName);
        waitForEleLocated(countryBy);
        country.click();
        placeOrderButton.click();

    }
}
