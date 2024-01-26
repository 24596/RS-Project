package PageObjects;

import AbstractComponents.AbstractComponent;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LoginPage extends AbstractComponent {
    public WebDriver driver;

    public LoginPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id="userEmail")
    WebElement wusername;

    @FindBy(id="userPassword")
    WebElement wpassword;

    @FindBy(id="login")
    WebElement loginButton;

    public void goTo(){
        driver.get("https://rahulshettyacademy.com/client");
    }

    public  void login(String username, String password) {
        wusername.sendKeys(username);
        wpassword.sendKeys(password);
        loginButton.click();

    }
}
