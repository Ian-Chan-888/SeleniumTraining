import java.io.IOException;
import java.util.Scanner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

// NOTE: NOT SURE IF THIS IS COMPLETELY WORKING ... STILL A WORK IN PROGRESS ... OCT 2019

/*
 * I wanted to create a meathod where it will seach thru the whole web page and identify the frames and to show its src and any other information assigned 
 * i.e : id, location
 * 
 */

public class Listing_Multiple_iframes {

	public static void main(String[] args) throws InterruptedException, IOException {

		WebDriver driver;

		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\eclipse\\chromedriver.exe");
		driver = new ChromeDriver();
		@SuppressWarnings("resource")
		Scanner reader = new Scanner(System.in);
		System.out.print("Enter a url https://");
		String url = reader.nextLine();
		driver.get("https://" + url);
		driver.manage().window().maximize();// max browser window
		driver.manage().deleteAllCookies();

		// lets find all elements that have a tag 'iframe'
		int iframesize = driver.findElements(By.tagName("iframe")).size();
		System.out
				.println("The number of iframes on this page is : " + driver.findElements(By.tagName("iframe")).size());

		if (iframesize != 0)
			;
		{

			int countiFrames = driver.findElements(By.tagName("iframe")).size();

			for (int i = 0; i < countiFrames; i++) // there is a problem here as it is not parsing to the next iframe.
			{

				System.out.println(
						"iFrame " + i + " src is - " + driver.findElement(By.tagName("iframe")).getAttribute("src"));
				System.out.println(
						"iFrame " + i + " id is - " + driver.findElement(By.tagName("iframe")).getAttribute("id"));
				System.out.println(
						"iFrame " + i + " location is - " + driver.findElement(By.tagName("iframe")).getLocation());
			}

		}

		// 'Frame'

		System.out.println("The number of frames on this page is : " + driver.findElements(By.tagName("frame")).size());

		int countFrames = driver.findElements(By.tagName("frame")).size();

		for (int i = 0; i < countFrames; i++) // there is a problem here as it is not parsing to the next iframe.
		{

			System.out
					.println("Frame " + i + " src is - " + driver.findElement(By.tagName("frame")).getAttribute("src"));
			System.out.println("Frame " + i + " id is - " + driver.findElement(By.tagName("frame")).getAttribute("id"));
			System.out
					.println("Frame " + i + " location is - " + driver.findElement(By.tagName("frame")).getLocation());
		}

		System.out.println("END PROGRAM");

		// driver.close();

	}

}