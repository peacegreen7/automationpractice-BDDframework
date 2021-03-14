package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccount extends PageObject {

    @FindBy(className = "info-account")
    private WebElement welcomeText;

    @FindBy(className = "logout")
    private WebElement logoutLink;

    @FindBy(xpath = "//div[@id='header_logo']/a")
    private WebElement logo;

    public MyAccount(WebDriver driver) {
        super(driver);
    }

    public boolean isInitialized() {
        return welcomeText.isDisplayed();
    }

    public String getWelComeText() {
        return welcomeText.getText();
    }

    public void logout() {
        this.logoutLink.click();
    }

    public void clickOnLogo() {
        this.logo.click();
    }
}
