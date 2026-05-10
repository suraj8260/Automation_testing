package package1;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class JSDatePickerInjection {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        try {
            driver.get("https://jqueryui.com/datepicker/");
            driver.manage().window().maximize();

            // 1. Handle Iframes (Specific to jQuery UI demo)
            wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.className("demo-frame")));

            // 2. Identify the target element
            WebElement dateElement = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("datepicker")));

            // 3. Inject Date with 'Change' Event triggering
            String myDate = "12/25/2026";
            injectDateAdvanced(driver, dateElement, myDate);

            System.out.println("Injection complete for date: " + myDate);

        } finally {
            // driver.quit();
        }
    }

    /**
     * Advanced Injection: Sets value AND triggers DOM events 
     * to ensure the web app registers the change.
     */
    public static void injectDateAdvanced(WebDriver driver, WebElement element, String date) {
        JavascriptExecutor js = (JavascriptExecutor) driver;

        // Script breakdown:
        // a. Set the attribute value
        // b. Create a new 'change' event
        // c. Dispatch that event so the app's listeners (React/Angular) react to it
        String script = "arguments[0].setAttribute('value', '" + date + "');" +
                        "arguments[0].dispatchEvent(new Event('change'));" +
                        "arguments[0].dispatchEvent(new Event('input'));";

        js.executeScript(script, element);
    }
}