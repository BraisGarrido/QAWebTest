package hooks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.BasePage;

public class Hooks {

    @Before
    public void setUp() {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        BasePage.setDriver(driver);
    }

    @After
    public void tearDown() {
        BasePage.closeBrowser();
    }
    
}
