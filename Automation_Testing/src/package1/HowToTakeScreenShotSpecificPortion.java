package package1;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HowToTakeScreenShotSpecificPortion {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
        driver.get("https://demo.nopcommerce.com/");
        
        driver.manage().window().maximize();
        
//        TakesScreenshot take_st = (TakesScreenshot)driver;
        WebElement element = driver.findElement(By.xpath("//section[@class='product-grid home-page-product-grid']//div[@class='item-grid']"));
        File sourcefile = element.getScreenshotAs(OutputType.FILE); //---> taken the screenshot
        
        File locationfile = new File("C:/Users/Suraj kumar meher/OneDrive/Pictures/Screenshots/ss.png");
        
        sourcefile.renameTo(locationfile);
        
        driver.quit();
        
    }

}