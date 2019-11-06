import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2_UI_Dropdowns_editBoses_Error_Validation {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver;

		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\eclipse\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.cleartrip.com"); // URL in the browser
		driver.manage().window().maximize();// max browser window

		/*
		 * 1. Select Adults and Childern elements 2. Select the Deaprt On Calendar and
		 * select todays date.(default date) 3. Click on the
		 * "More Options link and enter any "Perferred Airline values" = IndiGo (6E) 4.
		 * With NO items populated in the "From" or "To" field, Optain an error message
		 * after clicking the "Get Flights" button.
		 */

		// Step 1: Selecting 9 Adults and 7 Childeren

		// 8 Adults
		driver.findElement(By.xpath("//select[@name='adults']//option[contains(text(),'8')]")).click();
		// 1 Childeren
		driver.findElement(By.xpath("//select[@name='childs']//option[contains(text(),'1')]")).click();

		/*
		 * Optionally you can use is the "Select" Class. which is helpful in a drop down
		 * scenario. Select select_Adults = new Select
		 * (driver.findElement(By.id("Adults"))); Select select_Children = new Select
		 * (driver.findElement(By.id("Childrens"))); select_Adults.selectByIndex(1);
		 * select_Children.selectByIndex(1);
		 */

		// Step 2: Select todays date in the Departure Calendar
		driver.findElement(By.xpath("//dl[@class='vertical']//input[@placeholder='Pick a date']")).click();
		driver.findElement(By.cssSelector("a[class='ui-state-default ui-state-highlight ui-state-active ']")).click();

		// Step 3: Entering More Options - Perferred Airline of "Indego"
		// click on the "More Options" link
		driver.findElement(By.xpath("//strong[contains(text(),'More options:')]")).click();

		// Enter "IndiGo (6E)" in the Preferred Airline field
		driver.findElement(By.xpath("//input[@placeholder='Airline name']")).sendKeys("IndiGo (6E)");

		// Step 4. Get error message when clicking on the Search flights.
		driver.findElement(By.cssSelector("#SearchBtn")).click();

		// get error message and print to console.
		System.out.println(driver.findElement(By.cssSelector("#homeErrorMessage")).getText());

		System.out.println("END PROGRAM");

		// driver.close();

	}
}