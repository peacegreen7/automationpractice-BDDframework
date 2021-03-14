package Steps;

import Pages.MyAccount;
import Pages.SignUpPage;
import Utils.BaseTest;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class SignUpTest extends BaseTest {

    SignUpPage signUpPage;
    MyAccount myAccountPage;
    String homePageText = "Automation Practice Website";
    String emailText = "test00@mailinator.com";
    String pwdText = "123456";
    String fNameText = "Test";
    String lNameText = "New";
    String addressText = "Houston";
    String cityText = "Test";
    String zipcodeText = "12345";
    String phone = "0912345678";
    String expectedText = "Welcome to your account. Here you can manage all of your personal information and orders.";

    @Then("^I click on sign up link$")
    public void clickOnSignInLink() {
        signUpPage = homePage.clickMyAccountLink();
    }

    @Then("^I enter email on the email address box and submit$")
    public void enterEmailAddress() {
        signUpPage.createAccount(emailText);
    }

    @Then("^I select gender is female$")
    public void selectGender() {
        signUpPage.selectGender();
    }

    @Then("^I enter first name in personal information area$")
    public void enterFirstName() {
        signUpPage.enterFirstName(fNameText);
    }

    @Then("^I enter last name in personal information area$")
    public void enterLastName() {
        signUpPage.enterLastName(lNameText);
    }

    @Then("^I enter password in personal information area$")
    public void enterPassword() {
        signUpPage.enterPassword(pwdText);
    }

    @Then("^I enter first name in address area$")
    public void enterFNameAddress() {
        signUpPage.enteraFirstName(fNameText);
    }

    @Then("^I enter last name in address area$")
    public void enterLNameAddress() {
        signUpPage.enteraLastName(lNameText);
    }

    @Then("^I enter address$")
    public void enterAddress() {
        signUpPage.enterAddress(addressText);
    }

    @Then("^I enter city$")
    public void enterCity() {
        signUpPage.enterCity(cityText);
    }

    @Then("^I select state$")
    public void selectState() {
        signUpPage.selectState();
    }

    @Then("^I enter zip code$")
    public void enterZipcode() {
        signUpPage.enterZipcode(zipcodeText);
    }

    @Then("^I enter mobile phone$")
    public void enterPhone() {
        signUpPage.enterPhone(phone);
    }

    @Then("^I click on register button$")
    public void clickOnRegisterBtn() {
        myAccountPage = signUpPage.registerAccount();
    }

    @Then("^I logout page$")
    public void logout() {
        myAccountPage.logout();
    }

    @Then("^I click on page logo$")
    public void clickOnLogoPage() {
        myAccountPage.clickOnLogo();
    }
}
