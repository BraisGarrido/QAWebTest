package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class BasePage {
    protected static WebDriver driver;
    protected WebDriverWait wait;

    public BasePage() {
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

     /* ==================== DRIVER ========================== */
     public static void setDriver(WebDriver webDriver) {
        driver = webDriver;
     }

     public static WebDriver getDriver() {
        return driver;
     }

     public static void navigateTo(String url) {
        driver.get(url);
     }

     public static void closeBrowser() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
     }

     /* ======================= ACTIONS ========================= */
     protected void type(By locator, String text) {
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        element.clear();
        element.sendKeys(text);
     }

     protected String getText(By locator) {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator)).getText();
     }

     public void closePopupIfPresent(By popupLocator) {
        try {
            WebElement popupBtn = wait.until(ExpectedConditions.elementToBeClickable(popupLocator));
            popupBtn.click();
            wait.until(ExpectedConditions.invisibilityOf(popupBtn));
        } catch (Exception e) {

        }
     }

    public void clickElement(By locator) {
        WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(locator));
        try {
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
            wait.until(ExpectedConditions.elementToBeClickable(element)).click();
        } catch (Exception e) {
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
        }
    }


}
