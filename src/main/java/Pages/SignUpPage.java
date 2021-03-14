package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class SignUpPage extends PageObject{

    @FindBy(css = "#create_account_error li")
    private WebElement alertText;

    @FindBy(id = "SubmitCreate")
    private WebElement signUpBtn;

    @FindBy(id = "email_create")
    private WebElement email;

    @FindBy(id = "uniform-id_gender1")
    private WebElement gender;

    @FindBy(id = "customer_firstname")
    private WebElement cFirstName;

    @FindBy(id = "customer_lastname")
    private  WebElement cLastName;

    @FindBy(id = "passwd")
    private  WebElement password;

    @FindBy(id = "uniform-days")
    private WebElement day;

    @FindBy(id = "uniform-months")
    private WebElement month;

    @FindBy(id = "uniform-years")
    private WebElement year;

    @FindBy(id = "firstname")
    private WebElement aFirstName;

    @FindBy(id = "lastname")
    private  WebElement aLastName;

    @FindBy(id = "address1")
    private  WebElement address;

    @FindBy(id = "city")
    private  WebElement city;

    @FindBy(id = "id_state")
    private  WebElement state;

    @FindBy(id = "postcode")
    private  WebElement zipcode;

    @FindBy(id = "phone_mobile")
    private  WebElement phoneNumber;

    @FindBy(id = "alias")
    private  WebElement aliasAddress;

    @FindBy(id = "submitAccount")
    private  WebElement registerBtn;

    public SignUpPage(WebDriver driver) {
        super(driver);
    }

    public boolean isExistEmail() {
        return alertText.isDisplayed();
    }

    public void createAccount(String emailText) {
        email.sendKeys(emailText);
        signUpBtn.click();
    }

    public void selectGender() {
        if (!gender.isSelected()) {
            gender.click();
        }
    }

    public void enterFirstName(String fnameText) {
        this.cFirstName.clear();
        this.cFirstName.sendKeys(fnameText);
    }

    public void enterLastName(String lnameText) {
        this.cLastName.clear();
        this.cLastName.sendKeys(lnameText);
    }

    public void enteraFirstName(String fnameText) {
        this.aFirstName.clear();
        this.aFirstName.sendKeys(fnameText);
    }

    public void enteraLastName(String lnameText) {
        this.aLastName.clear();
        this.aLastName.sendKeys(lnameText);
    }

    public void enterPassword(String pwdText) {
        this.password.clear();
        this.password.sendKeys(pwdText);
    }

    public void enterAddress(String addressText) {
        this.address.clear();
        this.address.sendKeys(addressText);
    }

    public void enterCity(String cityText) {
        this.city.clear();
        this.city.sendKeys(cityText);
    }

    public void selectState() {
        Select dropdownState = new Select(this.state);
        dropdownState.selectByIndex(3);
    }

    public void enterZipcode(String zipcodeText) {
        this.zipcode.clear();
        this.zipcode.sendKeys(zipcodeText);
    }

    public void enterPhone(String phoneText) {
        this.phoneNumber.clear();
        this.phoneNumber.sendKeys(phoneText);
    }


    public MyAccount registerAccount() {
        this.registerBtn.click();
        return new MyAccount(driver);
    }
}
