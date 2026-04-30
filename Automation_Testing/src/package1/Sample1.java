package package1;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		WebDriver driver = new ChromeDriver();
		driver.get("https://iamsandesh23.github.io/selenium.github.io/");
		driver.manage().window().maximize(); 	// Maximize the browser
//		WebElement searchBox = driver.findElement(By.name("q")); // Locate the element in the webpage
//		searchBox.sendKeys("kodnest"); // perform the typing action in the respective field
		
//		driver.findElement(By.id("prompt")).click(); // This line will perform only one action on the web element
//		WebElement searchBox = driver.findElement(By.name("q")); // locate the element in the webpage
//
//		searchBox.sendKeys("kodnest"); // perform the typing action in the respective field
//
//		Thread.sleep(3000); // this will halt the flow for specific time frame
//
//		//driver.findElement(By.id("alert1")).click(); // this statement will perform only one action on the web element
//
//		searchBox.clear(); // clear any text/ statement
		
//		String retrievedText = driver.findElement(By.id("pah")).getText(); // used to retrieved the text in the webpage.
//		System.out.println(retrievedText);
		
//		String title_of_page = driver.getTitle();
//		System.out.println(title_of_page);
		
//		String url_of_page = driver.getCurrentUrl();
//		System.out.println(url_of_page);
//		
//		driver.quit();
		

//		boolean elementDisplayed = driver.findElement(By.id("but2")).isDisplayed(); //Whether the element displayed in the browser or not
//		System.out.println(elementDisplayed);
//		
//		boolean elementEnabled = driver.findElement(By.id("but1")).isEnabled(); // Whether we can do any action or not in the element
//		System.out.println(elementEnabled);		
		
		boolean elementSelected = driver.findElement(By.id("checkbox2")).isSelected();	// whether the element is in select state or not
		System.out.println(elementSelected);
		
		sc.close();
	}

}
