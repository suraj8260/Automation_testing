package Complete_test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FullText {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://en.wikipedia.org/wiki/Politics/");

		// Get all visible text from the page
		String pageText = driver.findElement(By.tagName("body")).getText();

		System.out.println(pageText);

		driver.quit();

	}

}
