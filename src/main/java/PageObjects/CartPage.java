package PageObjects;

import AbstractComponents.AbstractComponent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.List;

public class CartPage extends AbstractComponent {
    public WebDriver driver;

    public CartPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[@class='cartSection']/h3")
    List<WebElement> cartProducts;

    @FindBy(xpath = "//li[@class='totalRow']/button")
    WebElement checkoutButton;


    public void validateCartProducts(String cartProductName){
        WebElement cartP = cartProducts.stream().filter(cartProduct->cartProduct.getText().equalsIgnoreCase(cartProductName)).findFirst().orElse(null);
        Assert.assertEquals(cartProductName,cartP.getText());

    }

    public void pressCheckOut(){
        checkoutButton.click();
    }


}
