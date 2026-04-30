package package1;

import java.time.Duration;
import org.openqa.selenium.By; // Added this import
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

    public static void main(String[] args) throws InterruptedException {
        // 1. Initialize the Chrome Driver
        WebDriver driver = new ChromeDriver();

        // 2. Configure Wait and Window
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        // 3. Navigate to the URL
        driver.get("https://testautomationpractice.blogspot.com/");

        // 4. Locate the element
        WebElement clickElement = driver.findElement(By.xpath("//button[text()='Copy Text']"));

        // 5. Use Actions class to perform a Double Click
        Actions act = new Actions(driver);
        act.doubleClick(clickElement).perform();

        // 6. Pause to see the result before closing
        Thread.sleep(5000);
        driver.quit();
    }
}