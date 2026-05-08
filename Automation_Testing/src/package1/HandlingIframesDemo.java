package package1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class HandlingIframesDemo {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://ui.vision/demo/webtest/frames/");
		driver.manage().window().maximize();

		//		Frame1 

		 WebElement frame1 = driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
		 driver.switchTo().frame(frame1);
		driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("Kodnest");
		driver.switchTo().defaultContent();//--->This will change the focus of selenium to the main page 

		//frame 2

		 WebElement frame2 = driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
		 driver.switchTo().frame(frame2);
		 driver.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("Selenium");
		 driver.switchTo().defaultContent();
	 
		 //frame3
 
		 WebElement frame3 = driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
		 driver.switchTo().frame(frame3);
		 driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("Java");

		 // swithching the focus to the innerframe / childframe 
		 
		 driver.switchTo().frame(0);		// swiching the focus to inner frame 
		driver.findElement(By.xpath("//div[@id='i9']//div[@class='AB7Lab Id5V1']")).click();
		driver.findElement(By.xpath("//*[@id=\"i24\"]/div[2]")).click();	
		driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div[2]/div[1]/div[3]/div[1]/div[2]")).click();	
		driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div[2]/div[1]/div[3]/div[1]/div[1]/div/span/span")).click();
		driver.findElement(By.xpath("//input[@type='text']")).click();
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Hello world!");
		driver.findElement(By.xpath("//textarea[@aria-label='Your answer']")).click();
		driver.findElement(By.xpath("//textarea[@aria-label='Your answer']")).sendKeys("Welcome to the testing world!");
		driver.findElement(By.xpath("//span[contains(text(),'Submit')]")).click();
		driver.switchTo().parentFrame();
		Thread.sleep(3000);
		 WebElement frame3box = driver.findElement(By.xpath("//input[@name='mytext3']")); 
		 frame3box.clear();
		 }
	}

