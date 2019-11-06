import java.io.IOException;
import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class S10_Lesson77_78_79_Fluid_Wait {

	public static void main(String[] args) throws InterruptedException, IOException {

		WebDriver driver;

		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\eclipse\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
		driver.manage().window().maximize();// max browser window

		/*
		 * There is another explicit wait mechanism type called "Fluent Wait".
		 * 
		 * Explicit wait can be acheved in 2 ways: 1. WebDriverWait (from lesson 73-74)
		 * - can be defined with x seconds - will check up to x seconds before throwing
		 * exception. - 2. FluentWait - can be defined with x seconds but will also have
		 * a Polling x second time. - Polling can be useful when elements have different
		 * results based on time passed
		 * 
		 * e.g
		 * 
		 * Ecommerce site that has different messages that share the same element
		 * locator.
		 * 
		 * message 1 - "Your card is accepted" (appears in the first 3 seconds) message
		 * 2 - "Your order is being proccessed" (appears after aproximately 7 seconds)
		 * 
		 * Fluent wait will allow you to poll after the 3 seconds (4th second) for
		 * message 2 rather than being "tripped" on message 1.
		 *
		 * HOW DIFFERENT IS FLUENT WAIT VS WebDriver Wait? Fluent wait finds the web
		 * element repeatedly at a regular intervals of time until the timeout or till
		 * the object is found.
		 * 
		 * Unlike WebDriver wait, we need to build Customized wait methods based on
		 * condition
		 * 
		 * Both WebDriverWait and FluentWait classes implement Wait Interface
		 * 
		 * Reference:
		 * https://seleniumhq.github.io/selenium/docs/api/java/org/openqa/selenium/
		 * support/ui/FluentWait.html
		 * 
		 * 
		 */

		// click on the "Start" button
		driver.findElement(By.cssSelector("[id='start'] button")).click();

		// define fluent wait 30 seconds before exception and Pollig duration of every 3
		// seconds.
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(3)).ignoring(NoSuchElementException.class);

		// creating a method to confirm when element is displayed (overcomes invisible
		// elmements)
		wait.until(new Function<WebDriver, WebElement>() {
			public WebElement apply(WebDriver driver) {
				if (driver.findElement(By.cssSelector("[id='finish'] h4")).isDisplayed()) {
					return driver.findElement(By.cssSelector("[id='finish'] h4"));
				} else
					return null;
			}
		});

		System.out.println(driver.findElement(By.cssSelector("[id='finish'] h4")).getText());

		System.out.println("END PROGRAM");
	}

}
