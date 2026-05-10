package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

public class CalendarAutomation {

    public static void main(String[] args) {
        // 1. Setup Driver
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        // 2. Navigate to a site with a standard jQuery DatePicker
        driver.get("https://jqueryui.com/datepicker/");
        
        // jQuery UI examples are often inside an iframe
        driver.switchTo().frame(0);

        // 3. Define target date
        String targetDay = "25";
        String targetMonth = "December";
        String targetYear = "2027";

        // 4. Click to open the calendar
        driver.findElement(By.id("datepicker")).click();

        // 5. SMART LOOP: Navigate to the correct Month and Year
        while (true) {
            String currentMonthYear = driver.findElement(By.className("ui-datepicker-title")).getText();
            
            // Break the loop if we find our target Month and Year
            if (currentMonthYear.contains(targetMonth) && currentMonthYear.contains(targetYear)) {
                break;
            }

            // Click the 'Next' button to move forward in time
            driver.findElement(By.xpath("//span[text()='Next']")).click();
        }

        // 6. Select the specific Day
        // Dynamic XPath targets the link text within the table cell
        driver.findElement(By.xpath("//td/a[text()='" + targetDay + "']")).click();

        // Optional: Verify selection
        String selectedDate = driver.findElement(By.id("datepicker")).getAttribute("value");
        System.out.println("Date Selected Successfully: " + selectedDate);

        // driver.quit();
    }
}