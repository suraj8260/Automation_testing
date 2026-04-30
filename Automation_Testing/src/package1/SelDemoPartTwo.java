package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelDemoPartTwo {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();	// Open empty browser
		driver.get("https://iamsandesh23.github.io/selenium.github.io/");
		
		driver.manage().window().maximize();
		driver.navigate().to("https://fruits.karnataka.gov.in/FRUITSBANK/login.aspx");	// It will nevigate to the respective URL
		Thread.sleep(3000);
		driver.navigate().back();	// It will navigate backword
		Thread.sleep(3000);
		driver.navigate().forward();	// It will navigate forword
		Thread.sleep(3000);
		driver.navigate().refresh();	// refresh the page
		Thread.sleep(3000);
		String sourcecode = driver.getPageSource();	// It will retrive the sourcecode of the page
		System.out.println(sourcecode);
		driver.findElement(By.id("txtUserName")).sendKeys("sandesh@kodnest.com");
		Thread.sleep(3000);
		driver.findElement(By.id("txtpassword")).sendKeys("12345678");
		Thread.sleep(3000);
		driver.findElement(By.id("butlogin")).click();
		Thread.sleep(3000);
		driver.quit();

	}

}
