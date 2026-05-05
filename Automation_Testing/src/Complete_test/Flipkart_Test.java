package Complete_test;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Flipkart_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		try {
			driver.get("https://www.flipkart.com/");
			driver.manage().window().maximize();
			
			String mainWindow = driver.getWindowHandle();
			
			Thread.sleep(3000);
			driver.findElement(By.xpath("//span[@role='button']")).click();
			
			Thread.sleep(3000);
			driver.findElement(By.xpath("//form[@class='lilxh_ header-form-search']//input[@placeholder='Search for Products, Brands and More']")).sendKeys("mobiles" + Keys.ENTER);
			
			Thread.sleep(3000);
			driver.findElement(By.xpath("//div[normalize-space()='POCO C85x (Elite Black, 64 GB)']")).click();
						
			Set<String> allWindowHandles = driver.getWindowHandles();
			
			for(String handle : allWindowHandles) {
				if(!handle.equals(mainWindow)) {
					driver.switchTo().window(handle);
					
					Thread.sleep(3000);
					WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
					wait1.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("div[class='_1psv1zeb9 _1psv1ze0 _1psv1ze90 _1psv1ze6r _1psv1ze2u _1psv1ze4r _1psv1zefr'] div:nth-child(2) div:nth-child(1) div:nth-child(1) div:nth-child(1) a:nth-child(1) div:nth-child(1) div:nth-child(2)"))).click();				

					Thread.sleep(3000);
					WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(10));
					wait2.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[1]/div/div[1]/div/div/div/div/div/div/div/div/div/div/div[2]/div/div[2]/div/div/div/div/div/div[2]/div/div[1]/div/div/div/div/div/div/div/div[2]/div/div/div/div/div[2]/div/div/div/a/div/div[2]"))).click();				

					
					Thread.sleep(3000);
					WebDriverWait wait3 = new WebDriverWait(driver, Duration.ofSeconds(10));
					wait3.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[1]/div/div[1]/div/div/div/div/div/div/div/div/div/div/div[2]/div/div[2]/div/div/div/div/div/div[2]/div/div[1]/div/div/div/div/div/div/div/div[2]/div/div/div/div/div[3]/div"))).click();		

					Thread.sleep(3000);
					WebDriverWait wait4 = new WebDriverWait(driver, Duration.ofSeconds(10));
					wait4.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[1]/div/div[1]/div/div/div/div/div/div/div/div/div/div/div[2]/div/div[2]/div/div/div/div[1]/div/div[2]/div/div[2]/div/div/div/div/div/div/div/div[2]/div/div/div/div/div[1]/div/div"))).click();				

					Thread.sleep(3000);
					WebDriverWait wait5 = new WebDriverWait(driver, Duration.ofSeconds(10));
					wait5.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[1]/div/div[1]/div/div/div/div/div/div/div/div/div/div/div[2]/div/div[2]/div/div/div/div[1]/div/div[2]/div/div[18]/div/div/div/div/div/div/div/div/div/div[1]/div/svg/path[4]"))).click();				
					
					Thread.sleep(3000);
					driver.close();
				}
			}
			
			Thread.sleep(3000);
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

			WebElement input = wait.until(
			    ExpectedConditions.elementToBeClickable(
			        By.xpath("/html/body/div/div/div[1]/div[1]/div[2]/div[2]/form/div/div/input")));

			input.clear();
			Thread.sleep(2000);
			input.sendKeys("poco 8x pro max 5g");

			Thread.sleep(2000);
			WebDriverWait waiting = new WebDriverWait(driver, Duration.ofSeconds(10));
			waiting.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div/div/div[3]/div[1]/div[2]/div[2]/div/div/div/a/div[2]/div[1]/div[1]"))).click();

			
			for(String handle : allWindowHandles) {
				if(!handle.equals(mainWindow)) {
					driver.switchTo().window(handle);
					
					Thread.sleep(2000);
					WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
					wait1.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[1]/div/div[1]/div/div/div/div/div/div/div/div/div/div/div[2]/div/div[2]/div/div/div/div[1]/div/div[2]/div/div[1]/div/div/div/div/div/div/div/div[2]/div/div/div/div/div[2]/div/div"))).click();

					Thread.sleep(2000);
					WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(10));
					wait2.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[1]/div/div[1]/div/div/div/div/div/div/div/div/div/div/div[2]/div/div[2]/div/div/div/div[1]/div/div[2]/div/div[1]/div/div/div/div/div/div/div/div[2]/div/div/div/div/div[3]"))).click();

					Thread.sleep(2000);
					WebDriverWait wait3 = new WebDriverWait(driver, Duration.ofSeconds(10));
					wait3.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[1]/div/div[1]/div/div/div/div/div/div/div/div/div/div/div[2]/div/div[2]/div/div/div/div[1]/div/div[2]/div/div[2]/div/div/div/div/div/div/div/div[2]/div/div/div/div/div[1]/div/div/div/a/div[5]"))).click();

					Thread.sleep(2000);
					WebDriverWait wait4 = new WebDriverWait(driver, Duration.ofSeconds(10));
					wait4.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[1]/div/div[1]/div/div/div/div/div/div/div/div/div/div/div[2]/div/div[2]/div/div/div/div[1]/div/div[2]/div/div[19]/div/div/div/div/div/div/div/div/div/div[1]/div/svg"))).click();			
					Thread.sleep(2000);
					driver.close();
				}
			}
			Thread.sleep(2000);
			driver.quit();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			
		}
	}

}
