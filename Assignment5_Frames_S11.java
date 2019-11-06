import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment5_Frames_S11 {

	public static void main(String[] args) throws InterruptedException, IOException {

		WebDriver driver;

		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\eclipse\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com");
		driver.manage().window().maximize();// max browser window
		driver.manage().deleteAllCookies();

		/*
		 * from Lesson 87: Interview Questions: Working with Iframe and page content
		 * IFrame Is another web element and you can not locate Its element directly In
		 * selenium webdriver. To work with IFrame element In selenium webdriver, first
		 * of all you need to select that IFrame using syntax like bellow.
		 * 
		 * //switch to frame1. frame1 Is ID of frame. driver.switchTo().frame("frame1");
		 * 
		 * Now you can work with any element which Is Inside frame1. Now supposing you
		 * wants to switch back to page content then you need to use syntax like bellow.
		 * //Switch back to page content. driver.switchTo().defaultContent();
		 * 
		 * After above syntax execution, You can work with page elements.
		 * 
		 * Working with multiple frames on same page If there are multiple Iframes on
		 * single page then you can not directly navigate from Iframe1 to IFrame2. For
		 * that, You need to select page In between as bellow. //switch to frame1
		 * driver.switchTo().frame("frame1"); driver.findElement(By.xpath(
		 * "//td[contains(text(),'Cow')]/preceding-sibling::td/input[@type='checkbox']")
		 * ).click();
		 * 
		 * //Switch back to page content. driver.switchTo().defaultContent();
		 * 
		 * //switch to frame2 driver.switchTo().frame("frame2");
		 * driver.findElement(By.xpath("//input[@value='Boat']")).click();
		 * 
		 * 
		 * Assignment : 1. Navigate to https://the-internet.herokuapp.com 2. click on
		 * "Nested Frames" 3. Print the Middle text in nested frame with the next window
		 * 
		 * 
		 * 
		 */

		// navigate to nested frames
		driver.findElement(By.linkText("Nested Frames")).click();

		// switching to '/frame top' using .frame(WebElemnt arg)
		driver.switchTo().frame(driver.findElement(By.cssSelector("frame[src='/frame_top']")));

		// Switching to '/frame_middle' using .frame(WebElemnt arg)

		driver.switchTo().frame(driver.findElement(By.cssSelector("frame[src='/frame_middle']")));
		System.out.println(
				"The text in the Middle frame is '" + driver.findElement(By.cssSelector("#content")).getText() + "'");

		driver.switchTo().defaultContent(); // switching back to main content page.

		System.out.println("END PROGRAM");

		/*
		 * Instructors example:
		 * 
		 * driver.findElement(By.linkText("Nested Frames")).click();
		 * 
		 * 
		 * driver.switchTo().frame("frame-top");
		 * 
		 * 
		 * driver.switchTo().frame("frame-middle");
		 * 
		 * 
		 * System.out.println(driver.findElement(By.id("content")).getText());
		 * 
		 * 
		 * }
		 * 
		 * }
		 */
	}

}