package package1;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HowToTakeScreenShot {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
        driver.get("https://demo.nopcommerce.com/");
        
        driver.manage().window().maximize();
        
        TakesScreenshot take_st = (TakesScreenshot)driver;
        
        File sourcefile = take_st.getScreenshotAs(OutputType.FILE); //---> taken the screenshot
        
        File locationfile = new File("C:/Users/Suraj kumar meher/OneDrive/Pictures/Screenshots/ABC.png");
        
        sourcefile.renameTo(locationfile);
        
//        driver.quit();
        
    }

}