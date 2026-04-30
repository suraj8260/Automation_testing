package package1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingStaticWebTable2 {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();

        // total number of rows
        int rows = driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
        System.out.println("Total rows: " + rows);

        // total number of columns
        int columns = driver.findElements(By.xpath("//table[@name='BookTable']//th")).size();
        System.out.println("Total columns: " + columns);

        // ✅ Print headers
        List<WebElement> headers = driver.findElements(
                By.xpath("//table[@name='BookTable']//tr[1]//th"));

        for (WebElement header : headers) {
            System.out.print(header.getText() + "\t");
            System.out.print("");
            }
        System.out.println();

        // ✅ Print table data
        for (int row = 2; row <= rows; row++) {
            for (int column = 1; column <= columns; column++) {

                String dataText = driver.findElement(
                        By.xpath("//table[@name='BookTable']//tr[" + row + "]//td[" + column + "]")).getText();

                System.out.print(dataText + "\t");
            }
            System.out.println();
        }

        driver.quit();
    }
}