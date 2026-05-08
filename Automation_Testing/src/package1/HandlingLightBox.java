package package1;

import java.time.Duration;



import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
public class HandlingLightBox {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://in.pinterest.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//div[@class='ADXRXN MQHiAK']//button[@type='button']")).click();	

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.findElement(By.xpath("//div[@class='VHreRh cLlqFI XjRT60']//*[name()='svg']")).click();
		WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.findElement(By.xpath("//div[contains(text(),'Explore')]")).click();
		WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.quit();
		}
	}

