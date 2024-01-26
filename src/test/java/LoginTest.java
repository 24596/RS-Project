import PageObjects.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class LoginTest extends BaseClass{

    @Test
    public void loginTest() throws IOException, InterruptedException {
//        driver = initiateBrowser();
        LoginPage loginP = new LoginPage(this.driver);
        loginP.goTo();
        loginP.login("mansijukariya24@gmail.com","Mansi@123");
        ProductCatePage pct = new ProductCatePage(this.driver);
        pct.getProduct("ZARA COAT 3");
        HeadersPage hp = new HeadersPage(this.driver);
        Thread.sleep(6000);
        hp.goToCart();
        CartPage cP = new CartPage(this.driver);
        cP.validateCartProducts("ZARA COAT 3");
        cP.pressCheckOut();
        checkOutPage checkOut = new checkOutPage(this.driver);
        checkOut.enterCountry("India");
        System.out.println("Hello");


    }



}
