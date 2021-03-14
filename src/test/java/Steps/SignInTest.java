package Steps;

import Pages.MyAccount;
import Pages.SignInPage;
import Utils.BaseTest;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class SignInTest extends BaseTest {

    SignInPage signInPage;
    MyAccount myAccountPage;
    String homePageText = "Automation Practice Website";
    String emailText = "test00@mailinator.com";
    String pwdText = "123456";
    String expectedText = "Welcome to your account. Here you can manage all of your personal information and orders.";

    @Given("^I am on home page$")
    public void isHomePage() {
        assertEquals(homePageText, homePage.getHomePageText());
    }

    @Then("^I click on sign in link$")
    public void clickOnSignInLink() {
        signInPage = homePage.clickMyAccount();
    }

    @Then("^I enter email$")
    public void enterEmail() {
        signInPage.enterEmail(emailText);
    }

    @Then("^I enter password$")
    public void enterPassword() {
        signInPage.enterPassword(pwdText);
    }

    @Then("^I click on login button$")
    public void clickOnLoginBtn() {
        myAccountPage = signInPage.submit();
    }

    @Then("^I should be in my account page$")
    public void validateWelcomeText() {
        assertTrue(myAccountPage.isInitialized());
        assertEquals(expectedText, myAccountPage.getWelComeText());
    }

}
