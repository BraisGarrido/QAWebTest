package pages;

import org.openqa.selenium.By;

public class LoginPage extends BasePage{

    private By signupLoginLink = By.cssSelector("a[href='/login']");
    private By signupName = By.cssSelector("input[data-qa='signup-name']");
    private By signupEmail = By.cssSelector("input[data-qa='signup-email']");
    private By signupBtn = By.cssSelector("button[data-qa='signup-button']");
    private By cookieCloseBtn = By.cssSelector("#cookieConsentClose");

    public LoginPage() {
        super();
    }

    public void openHomePage() {
        navigateTo("https://automationexercise.com");
    }

    public void clickSignupLogin() {
        clickElement(signupLoginLink);
    }

    public void enterSignupName(String name) {
        type(signupName, name);
    }

    public void enterSignupEmail(String email) {
        type(signupEmail, email);
    }

    public void submitSignup() {
        clickElement(signupBtn);
    }

    public void closeCookiePopup() {
        closePopupIfPresent(cookieCloseBtn);
    }
}
