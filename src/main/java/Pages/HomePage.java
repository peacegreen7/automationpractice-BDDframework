package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends PageObject {

    @FindBy(className = "login")
    private WebElement loginLink;

    @FindBy(css = "#editorial_block_center h1")
    private WebElement homePageText;


    public HomePage(WebDriver driver) {
        super(driver);
    }

    public SignInPage clickMyAccount() {
        loginLink.click();
        return new SignInPage(driver);
    }

    public SignUpPage clickMyAccountLink() {
        loginLink.click();
        return new SignUpPage(driver);
    }

    public String getHomePageText() {
        return homePageText.getText();
    }
}
