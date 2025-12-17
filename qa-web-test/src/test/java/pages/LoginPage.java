package pages;

import org.openqa.selenium.By;

public class LoginPage extends BasePage{

    private By signupLoginLink = By.cssSelector("a[href='/login']");
    private By signupName = By.cssSelector("input[data-qa='signup-name']");
    private By signupEmail = By.cssSelector("input[data-qa='signup-email']");
    private By signupBtn = By.cssSelector("input[data-qa='signup-button']");

    public LoginPage() {
        super(driver);
    }

    public void navigateToWeb() {
        navigateTo("https://automationexercise.com");
    }

    public void clickLogin() {
        clickElement(signupLoginLink);
    }
}
