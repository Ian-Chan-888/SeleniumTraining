import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class S11_Lesson85_86_How_to_handle_Frames {

	public static void main(String[] args) throws InterruptedException, IOException {

		WebDriver driver;

		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\eclipse\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable");
		driver.manage().window().maximize();// max browser window
		driver.manage().deleteAllCookies();

		/*
		 * In this lession we talk about Frames. As well as use the drag and drop
		 * methods.
		 * 
		 * Frames: What are Frames? -In the context of a web browser, a frame is a part
		 * of a web page or browser window which displays content independent of its
		 * container, with the ability to load content independently. The HTML or media
		 * elements that go in a frame may or may not come from the same web site as the
		 * other elements of content on display.
		 * 
		 * -Selenium does not know right away that an element is within a frame.
		 * Therefore we need to identify a frame first
		 * 
		 * How to Identify Frames in application? - While inspecting a box that is
		 * suspected to have a frame you can see the html code to identify a frame with
		 * "iframe' or "frame" i.e: <iframe
		 * src="/resources/demos/droppable/default.html" class="demo-frame" xpath="1"
		 * style=""></iframe>
		 * 
		 * How to handle frames?
		 * 
		 * Best Practices when working with Frames application.
		 * 
		 * 1. use the .switchTo().frame() to move to the specific frame uses: Frame id:
		 * .frame(int arg) Frame string: .frame(int arg) Frame WebElement:
		 * .frame(WebElement arg) 2. Use Actions method to click and drag 3. Swich back
		 * to the main page by switching back by: driver.switchTo().defaultContent();
		 * info@clickacademy.com - for email questions.
		 * 
		 */

		// lets find all elements that have a tag 'iframe'
		System.out
				.println("The number of iframes on this page is : " + driver.findElements(By.tagName("iframe")).size());
		/*
		 * the size number can help you determine the index of a frame. As such a site
		 * with 2 frames will have index 0 and 1. in this example since there is only 1
		 * frame the index = 0 and therefore you can use the following to switch to the
		 * frame: driver.switchTo().frame(0);
		 */

		// Switching to 'demo-frame' using .frame(WebElemnt arg)

		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[class='demo-frame']")));
		/*
		 * OR alternatively you can use:
		 * driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		 */
		Actions a = new Actions(driver); // defining new Actions class. You will need to import it as part of the
											// Selenium libraries.
		WebElement source = driver.findElement(By.cssSelector("#draggable")); // Asigning variable 'source' to
																				// 'draggable' element
		WebElement target = driver.findElement(By.cssSelector("#droppable")); // Asigning variable 'target' to
																				// 'droppable' element
		a.dragAndDrop(source, target).build().perform();
		/*
		 * Note that any subsequent actions will only relate to the frame you switched
		 * to to. To Switch back to main page you need to run another switchTo() command
		 */

		driver.switchTo().defaultContent(); // switching back to main content page.

		System.out.println("END PROGRAM");

		// driver.close();

	}

}