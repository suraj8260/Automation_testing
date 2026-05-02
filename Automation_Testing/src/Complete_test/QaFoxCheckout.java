package Complete_test;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class QaFoxCheckout {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        try {
            driver.get("https://tutorialsninja.com/demo/");
            driver.manage().window().maximize();
            
            Thread.sleep(1000);
         // 1. Initialize the Wait object
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));

            // 2. Click the 'My Account' dropdown to expand it
            WebElement myAccount = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//span[text()='My Account']")));
            myAccount.click();

            Thread.sleep(1000);
            // 3. Click the 'Login' option from the visible list
            WebElement loginOption = wait.until(ExpectedConditions.elementToBeClickable(
                By.linkText("Login")));
            loginOption.click();
            Thread.sleep(1000);
            
            WebElement emailField = driver.findElement(By.id("input-email"));
            WebElement passwordField = driver.findElement(By.id("input-password"));
            
            emailField.sendKeys("john@kod.com");
            passwordField.sendKeys("qwertyuiop");
            Thread.sleep(1000);
            WebElement loginButton = driver.findElement(By.xpath("//input[@value='Login']"));
            loginButton.click();

            Thread.sleep(5000);
            
            WebElement tab = driver.findElement(By.xpath("//a[normalize-space()='Tablets']"));
            tab.click();

            Thread.sleep(5000);

            WebElement tab_select = driver.findElement(By.xpath("//span[normalize-space()='Add to Cart']"));
            tab_select.click();
            tab_select.click();
            Thread.sleep(1000);

            WebElement phone = driver.findElement(By.xpath("//ul[@class='nav navbar-nav']//a[contains(text(),'Phones & PDAs')]"));
            phone.click();
            Thread.sleep(1000);
            WebElement phone_select = driver.findElement(By.xpath("//div[@id='content']//div[1]//div[1]//div[2]//div[2]//button[1]//span[1]"));
            phone_select.click();
            phone_select.click();
            Thread.sleep(1000);
            
            WebElement cart = driver.findElement(By.id("cart"));
            cart.click();
            Thread.sleep(3000);
            WebElement showCart = driver.findElement(By.xpath("//strong[normalize-space()='View Cart']"));
            showCart.click();
            Thread.sleep(3000);
            WebElement updateProduct = driver.findElement(By.xpath("//input[@name='quantity[353634]']"));
            Thread.sleep(3000);
            updateProduct.clear();
            updateProduct.sendKeys("5");
            Thread.sleep(5000);            
            WebElement update1 = driver.findElement(By.xpath("//input[@name='quantity[353634]']/ancestor::tr//button[@data-original-title='Update']"));
            update1.click();
            WebElement updateProduct2 = driver.findElement(By.xpath("//input[@name='quantity[353645]']"));
            Thread.sleep(3000);
            updateProduct2.clear();
            updateProduct2.sendKeys("5");
            Thread.sleep(5000);            
            WebElement update2 = driver.findElement(By.xpath("//input[@name='quantity[353645]']/ancestor::tr//button[@data-original-title='Update']"));
            update2.click();
            Thread.sleep(5000);
            WebElement checkout = driver.findElement(By.linkText("Checkout"));
            checkout.click();
            Thread.sleep(5000);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }
}