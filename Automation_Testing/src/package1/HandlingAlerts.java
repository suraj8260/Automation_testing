package package1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAlerts {

    public static void main(String[] args) throws InterruptedException {
        // TODO Auto-generated method stub

        WebDriver driver = new ChromeDriver();

        driver.get("https://iamsandesh23.github.io/selenium.github.io/");

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.findElement(By.id("alert1")).click();

        Thread.sleep(3000);

        Alert alert = driver.switchTo().alert();

        String textonAlert = alert.getText();

        Thread.sleep(3000);

        System.out.println(textonAlert);

        alert.accept();

        Thread.sleep(3000);

        driver.close();
    }
}