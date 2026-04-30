package package1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingMSB_and_DropDown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

        driver.get("https://iamsandesh23.github.io/selenium.github.io/");

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
//        driver.findElement(By.id("drop1")).sendKeys("doc 3");	// This can be used but this is not the right way to use to MSB / dropdown

        // Dropdown
        
        WebElement dropdownelements =  driver.findElement(By.id("drop1"));
        Thread.sleep(5000);
        Select sel = new Select(dropdownelements);
        Thread.sleep(5000);
      sel.selectByVisibleText("doc 3");
      sel.selectByIndex(2);
        
        // Multi selection Box
        
//        WebElement msb =  driver.findElement(By.id("multiselect1"));
//        
//        Select sel = new Select(msb);
//        sel.selectByVisibleText("Volvo");
//        sel.selectByVisibleText("Swift");
//        sel.selectByVisibleText("Audi");
//        
//        Thread.sleep(3000);
//        sel.deselectByVisibleText("Swift");
        
	}

}
