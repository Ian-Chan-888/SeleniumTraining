import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment4_Window_Handling_S11 {

	public static void main(String[] args) throws InterruptedException, IOException {

		WebDriver driver;

		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\eclipse\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com");

		/*
		 * Handling Windows assignment 1. Click on Multiple windows 2. Click on the
		 * "Click Here" to start a new window. 3. Capture the text in the new window.
		 * Expected results = "New Window" 4. Switch back to Parent window and capture
		 * the text in that window. Expected results = "Opening a new window"
		 * 
		 */

		// click on the "Multiple Windows"
		driver.findElement(By.linkText("Multiple Windows")).click();

		// click on the "Click here" link
		driver.findElement(By.linkText("Click Here")).click();

		// this will get all the window id's "titles" using the "Set<String>" function
		// which will store a series of rows where row 1 will be the Parent id.
		Set<String> ids = driver.getWindowHandles();

		Iterator<String> it = ids.iterator(); // import Iterator method to help navigate to specific id's.
		String parentid = it.next(); // comes to the first row and grabs the id and stores it into the variable
										// "parentid".
		String firstChildid = it.next(); // traverses down one next id and stores it into the variable "fristChildid'

		driver.switchTo().window(firstChildid); // now we can switch to the first child window.
		System.out.println("The Text in the Child window is: "
				+ driver.findElement(By.cssSelector("body:nth-child(2) div.example > h3:nth-child(1)")).getText());

		driver.switchTo().window(parentid); // switching back to parent window
		System.out.println("The Text in the Parent window is: " + driver.findElement(By.cssSelector(
				"body:nth-child(2) div.row:nth-child(2) div.large-12.columns:nth-child(2) div.example > h3:nth-child(1)"))
				.getText());

	}

}