package PageObjects;

import AbstractComponents.AbstractComponent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ProductCatePage extends AbstractComponent{
    public WebDriver driver;
    public ProductCatePage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath="//div/h5/b")
    List<WebElement> productNames;

    @FindBy(xpath = "//button[text()=' Add To Cart']")
    WebElement addToCartButton;

    By toast = By.id("toast-container");

    @FindBy(css="..ng-animating")
    WebElement spinner;


    public void getProduct(String pName){
        WebElement product = productNames.stream().filter(prduct->prduct.getText().equalsIgnoreCase(pName)).findFirst().orElse(null);
        addToCartButton.click();
        //waitForEleLocated(toast);
        //waitForDisapper(spinner);
    }



}
