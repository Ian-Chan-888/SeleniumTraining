import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class Assignment3_Wait {

	public static void main(String[] args) throws InterruptedException, IOException {

		WebDriver driver;

		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\eclipse\\chromedriver.exe");
		driver = new ChromeDriver();
			
		driver.get("http://www.itgeared.com/demo/1506-ajax-loading.html");
		driver.manage().window().maximize();// max browser window
		

		/* In This Assignment using Explicit wait you click on the "Click to load get data via Ajax!" link
		 * Validate the text message that appears when it is displayed.
		 */
		
		//*****Explicit Wait DEFINED *****
		WebDriverWait wait5Seconds = new WebDriverWait(driver,5); //5 seconds. 
		//********************************
		
		
		//click on "Click to load get data via Ajax!"
		driver.findElement(By.cssSelector("a[href=\"javascript: void(0);loadAjax();\"]")).click();
				
		//*****Explicit Wait Called here*****
		//Waiting form message to appear
		wait5Seconds.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='results']")));
		System.out.println(driver.findElement(By.xpath("//div[@id='results']")).getText()); 
		
	}
	
	/*
	 * Instructors Solution: 
	 * 				. 
	 * 				.
	 * 				.
	 * driver.get("http://www.itgeared.com/demo/1506-ajax-loading.html");
	 * 
	 * driver.findElement(By.cssSelector("a[href*='loadAjax']")).click();
	 * 
	 * WebDriverWait d=new WebDriverWait(driver,20);
	 * 
	 * d.until(ExpectedConditions.elementToBeClickable(By.id("results")));
	 * 
	 * 
	 * 
	 * System.out.println(driver.findElement(By.id("results")).getText());
	 * 
	 * // System.out.println(
	 * driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[2]"))
	 * .getText());
	 * 
	 * 
	 * 
	 * 
	 * 
	 * }
	 * 
	 * }
	 */
}


