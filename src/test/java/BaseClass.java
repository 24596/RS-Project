import PageObjects.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class BaseClass {
    public WebDriver driver;
    
    @BeforeClass
    public void initiateBrowser() throws IOException, InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mansi\\OneDrive - Mobisy Technologies\\Documents\\chromedriver-win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        Thread.sleep(3000);
        this.driver =  driver;

    }


}
