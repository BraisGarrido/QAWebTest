package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.*;

public class WebSteps {
    LoginPage loginPage = new LoginPage();

    @Given("The user is on the home page")
    public void openPage() {
        loginPage.openHomePage();
    }

    @And("The user navigates to the signup page")
    public void navigateLogin() {
        loginPage.closeCookiePopup();
        loginPage.clickSignupLogin();
    }

    @When("The user registers with {string} and {string}")
    public void signupUser(String name, String email) {
        loginPage.enterSignupName(name);
        loginPage.enterSignupEmail(email);
        loginPage.submitSignup();
    }
}
