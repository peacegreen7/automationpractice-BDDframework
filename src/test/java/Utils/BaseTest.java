package Utils;

import Pages.HomePage;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BaseTest {

    private static WebDriver driver;
    protected static HomePage homePage;

    public static void launchApplication() {
        setChromeDriverProperty();
        driver = new ChromeDriver();
        driver.get(Links.HOME);
        homePage = new HomePage(driver);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public static void closeBrowser() {
        driver.quit();
    }

    private static void setChromeDriverProperty() {
        if (System.getProperty("os.name").contains("Windows")) {
            System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        } else {
            System.setProperty("webdriver.chrome.driver", "resources/chromedriver");
        }
    }
}
