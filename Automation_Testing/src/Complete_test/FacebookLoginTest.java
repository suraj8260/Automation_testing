package Complete_test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLoginTest {
    public static void main(String[] args) {
        // 1. Set the path to your chromedriver if not in System Path
        // System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        // 2. Initialize the Chrome Driver
        WebDriver driver = new ChromeDriver();

        try {
            // 3. Navigate to Facebook
            driver.get("https://www.facebook.com/");
            driver.manage().window().maximize();

            // 4. Locate the email and password fields
            WebElement emailField = driver.findElement(By.xpath("//input[@id='_R_64mkqsr9pb6amH1_']"));
            emailField.sendKeys("email@example.com");
            Thread.sleep(2000);
            WebElement passwordField = driver.findElement(By.xpath("//input[@id='_R_66mkqsr9pb6amH1_']"));
            passwordField.sendKeys("password_123");
            Thread.sleep(2000);
            // 6. Locate and click the Login button
            // Using name="login" as it is standard for the FB login button
            WebElement loginButton = driver.findElement(By.xpath("//span[@class='x1lliihq x193iq5w x6ikm8r x10wlt62 xlyipyv xuxw1ft'][normalize-space()='Log in']"));
            loginButton.click();

            // 7. Wait briefly to observe result (Not recommended for production)
            Thread.sleep(000);
            
            WebElement forgotPassword = driver.findElement(By.xpath("//span[contains(text(),'Forgotten password?')]"));
            forgotPassword.click();

            // 7. Wait briefly to observe result (Not recommended for production)
            Thread.sleep(5000);

            WebElement numberField = driver.findElement(By.xpath("//input[@id='_r_2_']"));
            numberField.sendKeys("9937490633");
            Thread.sleep(5000);
            
            WebElement continuePasswordForgot = driver.findElement(By.xpath("//span[@class='x1lliihq x193iq5w x6ikm8r x10wlt62 xlyipyv xuxw1ft']"));
            continuePasswordForgot.click();
            Thread.sleep(5000);
            
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // 8. Quit the browser
            driver.quit();
        }
    }
}