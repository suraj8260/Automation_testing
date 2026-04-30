package package1;

import java.time.Duration;



import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
public class HandlingLightBox {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://in.pinterest.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//div[@class='ADXRXN MQHiAK']//button[@type='button']")).click();	

		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='VHreRh cLlqFI XjRT60']//*[name()='svg']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[contains(text(),'Explore')]")).click();
		Thread.sleep(3000);
		driver.quit();
		}
	}

