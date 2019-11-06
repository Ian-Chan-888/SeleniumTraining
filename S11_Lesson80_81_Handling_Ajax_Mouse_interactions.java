import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class S11_Lesson80_81_Handling_Ajax_Mouse_interactions {

	public static void main(String[] args) throws InterruptedException, IOException {

		WebDriver driver;

		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\eclipse\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://amazon.com");
		driver.manage().window().maximize();// max browser window
		driver.manage().deleteAllCookies();

		/*
		 * Actions: How to Mouse-Over on object with Selenium? Performing Mouse and
		 * keyboard interations with Selenium Context click on element Double click on
		 * element Drag and ropping the element
		 * 
		 *
		 * 
		 * Lession 80 = intro lession 81 - Action class - real time example (composite
		 * actions)
		 * 
		 *
		 * 
		 */
		Actions a = new Actions(driver); // defining new Actions class (you will need to import it as part of the
											// Selenium libraries.

		WebElement move = driver.findElement(By.cssSelector("a[id='nav-link-accountList']"));// variablizing web element

		// Enter in "HELLO" into the searchbox by holding down the SHIFT key.
		a.moveToElement(driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']"))).click()
				.keyDown(Keys.SHIFT) // hold down the SHIFT key
				.sendKeys("hello") // sends keys 'hello'
				.doubleClick()// Now to select the entire text we just entered.
				.build().perform();
		// Now to select the entire text we just entered.

		// moving mouse cursor to specific element
		a.moveToElement(move).contextClick() // right clicks on element
				.build().perform();// dont forget to add '.build().perform()' otherwise this step will not execute.

		System.out.println("END PROGRAM");

		// driver.close();

	}

}