package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInPage extends PageObject {

    @FindBy(id = "email")
    private WebElement email;

    @FindBy(id = "passwd")
    private WebElement password;

    @FindBy(id = "SubmitLogin")
    private WebElement submitBtn;

    public SignInPage(WebDriver driver) {
        super(driver);
    }

    public void enterEmail(String emailText) {
        this.email.clear();
        this.email.sendKeys(emailText);
    }

    public void enterPassword(String pwdText) {
        this.password.clear();
        this.password.sendKeys(pwdText);
    }

    public MyAccount submit() {
        this.submitBtn.click();
        return new MyAccount(driver);
    }
}
