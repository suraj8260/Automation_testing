package package1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://testautomationpractice.blogspot.com/");

        driver.manage().window().maximize();

        WebElement dragElement = driver.findElement(By.xpath("//div[@id='draggable']"));

        Thread.sleep(3000);
        
        WebElement dropElement = driver.findElement(By.xpath("//div[@id='droppable']"));

        Actions act = new Actions(driver);

        act.dragAndDrop(dragElement, dropElement).perform();

        Thread.sleep(3000);

        driver.quit();

    }

}