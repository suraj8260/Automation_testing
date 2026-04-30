package package1;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelDemoPartthree {

    public static void main(String[] args) {

        // If chromedriver is NOT in PATH, uncomment and set this
        // System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        ChromeDriver driver = new ChromeDriver(); // opening browser

        driver.get("https://iamsandesh23.github.io/selenium.github.io/");
        driver.manage().window().maximize();

        List<WebElement> elements = driver.findElements(By.tagName("a"));

        // Print all link texts and URLs
//        for (WebElement element : elements) {
//            System.out.println(element.getText() + " --> " + element.getAttribute("href"));
//        }
        
        for (int i = 0; i < elements.size(); i++) {
			if (elements.get(i).getText().length()>0)
				System.out.println(elements.get(i).getText());
		}

        driver.quit(); // close browser
    }
}
