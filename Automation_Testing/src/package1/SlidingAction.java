package package1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SlidingAction {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://testautomationpractice.blogspot.com/");

        driver.manage().window().maximize();

//      Point loc = driver.findElement(By.xpath("//div[@id='HTML7']//span[1]")).getLocation();
//
//      System.out.println(loc);

        WebElement slider1 = driver.findElement(By.xpath("//div[@id='HTML7']//span[1]"));

        Thread.sleep(5000);
        
        WebElement slider2 = driver.findElement(By.xpath("//div[@id='HTML7']//span[2]"));

        Actions act = new Actions(driver);

        act.dragAndDropBy(slider2, -100, 0).perform();

        Thread.sleep(5000);
        driver.quit();
    }
}