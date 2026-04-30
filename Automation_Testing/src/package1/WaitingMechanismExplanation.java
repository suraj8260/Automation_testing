package package1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WaitingMechanismExplanation {

public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();	// Open empty browser
		driver.get("https://iamsandesh23.github.io/selenium.github.io/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.className("dropbtn")).click();
		
		driver.findElement(By.linkText("Facebook")).click();

	}

}
