package package1;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingWindows {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver(); // opening empty browser

        driver.get("https://iamsandesh23.github.io/selenium.github.io/");
        driver.manage().window().maximize();

        driver.findElement(By.linkText("Open a popup window")).click();

        Set<String> windowIds = driver.getWindowHandles();
        Iterator<String> iterator = windowIds.iterator();

        String mainWindow = iterator.next();   // first window
        String childWindow = iterator.next();  // second window

        // Switch to child window
        driver.switchTo().window(childWindow);

        String textInOtherWindow = driver
                .findElement(By.tagName("body"))
                .getText();

        System.out.println(textInOtherWindow);

        Thread.sleep(3000);

        driver.quit(); // better than close()
    }
}
