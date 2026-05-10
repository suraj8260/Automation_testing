package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;
import java.util.List;

public class WebTablePractice {
    public static void main(String[] args) {
        // Initialize WebDriver
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        try {
            // 1. Navigate to a clean practice page
            driver.get("https://the-internet.herokuapp.com/challenging_dom");

            // 2. Locate the table element using a generic tag-based approach
            WebElement table = driver.findElement(By.xpath("//table"));

            // 3. Capture Rows (including header) and Columns
            List<WebElement> allRows = table.findElements(By.tagName("tr"));
            List<WebElement> allHeaders = table.findElements(By.tagName("th"));

            System.out.println("Total Rows: " + allRows.size());
            System.out.println("Total Columns: " + allHeaders.size());

            // 4. Extract data using a 'for-each' loop for better readability
            System.out.println("\n--- Data Extraction ---");
            for (WebElement row : allRows) {
                // Find all cells (td) within the current row
                List<WebElement> cells = row.findElements(By.tagName("td"));
                
                for (WebElement cell : cells) {
                    System.out.print(cell.getText() + " | ");
                }
                // Only print a new line if the row actually had data
                if (!cells.isEmpty()) { 
                    System.out.println(); 
                }
            }

            // 5. Advanced Search: Find a row by text and interact with a link in that row
            String targetText = "Iuvaret2"; 
            System.out.println("\nAction: Searching for '" + targetText + "' to click 'edit'...");

            // Logic: Find the row that contains our target text, then find the 'edit' link within it
            String actionXpath = "//table//tr[contains(., '" + targetText + "')]//a[text()='edit']";
            
            WebElement editLink = driver.findElement(By.xpath(actionXpath));
            editLink.click();
            
            System.out.println("Success: Edit link clicked for row containing: " + targetText);

        } catch (Exception e) {
            System.out.println("Error encountered: " + e.getMessage());
        } finally {
            // Close the session
            driver.quit();
        }
    }
}