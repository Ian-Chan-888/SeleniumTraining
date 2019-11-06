import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class S08_Lession46_and_47_dropdown_and_looping {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\eclipse\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://spicejet.com");// go to url

		// Example of STATIC drop-down
		Select s = new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"))); // Using the Select
																									// Class
		s.selectByIndex(3);
		; // select the USD currency
		System.out.println(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")).getText());

		/*
		 * Similarly you can use the following: s.selectByIndex(2); //selects the second
		 * entry in the drop-down "AED" s.selectByVisibleText("INR");//selects the INR
		 * currency
		 */

// Example of Dynamic drop-down + use of loops
		// Changing the amount of Adults option
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000L);
		driver.findElement(By.id("hrefIncAdt")).click();// Incrementing adult button

		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());// print out the value chosen in the
																				// "Passengers" field = '2 Adult'

// what if you want to choose 6 adults??.. You could write line 35 several more times but that is not good coding practice. instead you should use a loop structure. 
		int i = 1;
		while (i < 5) {
			driver.findElement(By.id("hrefIncAdt")).click(); // Incrementing adult button
			i++; // this will increment by 1
		}

//Another loop you can use is the for loop, In here you define all the parameters within the loop at the beginning. Example below chooses 5 Adults

		for (int Adults = 1; Adults < 4; Adults++) // the loop stops at 4 clicks = 5 Adults. Note if you run this code
													// you will wind up with 9 adults because the first loop leaves the
													// value set at 6
		{
			driver.findElement(By.id("hrefIncAdt")).click();// Incrementing adult button
		}

		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());// print out the value chosen in the
																				// "Passengers" field = '9 Adult'

		Thread.sleep(1000L);

// Lets reset the passengers to default by using the de-select element. 

		for (int d = 1; d < 9; d++) {
			driver.findElement(By.id("hrefDecAdt")).click();
		}

		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());

// Lets add 3 Child and 2 infants
		for (int Child = 1; Child < 4; Child++) {
			driver.findElement(By.id("hrefIncChd")).click();// Incrementing Child + button
		}

		for (int Infant = 1; Infant < 3; Infant++) {
			driver.findElement(By.id("hrefIncInf")).click();// Incrementing Infant + button
		}

		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		driver.findElement(By.id("btnclosepaxoption")).click();// this presses the "Done" button within the drop-down.

		System.out.println("Passed");

		// driver.close();

	}

}
