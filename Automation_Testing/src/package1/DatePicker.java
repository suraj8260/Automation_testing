package package1;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();

		//switch to frame  

		driver.switchTo().frame(0);

		//method 1 : by using sendkeys

		driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("04/05/2025");

		// method 2 : handling calenders

		driver.findElement(By.xpath("//input[@id='datepicker']")).click();

		String year = "2026";
		String month = "December";
		String date = "25";

		//month and year

		while (true) {

		    String currentMonth =
		    driver.findElement(By.className("ui-datepicker-month")).getText();

		    String currentYear =
		    driver.findElement(By.className("ui-datepicker-year")).getText();

		    if(currentMonth.equals(month) &&
		       currentYear.equals(year)) {
		        break;
		    }

		    driver.findElement(
		    By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']"))
		    .click();
		}
		//dates	

		 List<WebElement> alldates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr/td//a"));

		 for (WebElement dt:alldates) {
			 if(dt.getText().equals(date)) {
			 dt.click();
			 break;
			 }
		 }
		 driver.quit();
	}
}

