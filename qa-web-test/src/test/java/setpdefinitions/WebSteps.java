package setpdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import pages.*;

public class WebSteps {
    LoginPage loginPage = new LoginPage();

    @Given("The user is on the home page")
    public void openPage() {
        loginPage.navigateToWeb();
    }

    @And("The user navigates to the signup page")
    public void navigateLogin() {
        loginPage.clickLogin();
    }
}
