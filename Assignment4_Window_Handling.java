import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.commons.io.FileUtils;
import com.google.common.io.Files;


public class Assignment4_Window_Handling {

	public static void main(String[] args) throws InterruptedException, IOException {

		WebDriver driver;

		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\eclipse\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/windows");
		driver.manage().window().maximize();// max browser window
		driver.manage().deleteAllCookies();

		/*Handling Windows assignment
		 * 1. click on Multiple windows
		 * 2. Click on the "Click Here" to start a new window. 
		 * 3. Capture the text in the new window "New Window"
		 * 4. Switch back to Parent window and capture the text in that window "Opening a new window"
		 * 
		 */
		
		//click on the "Click here" link
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/a[1]")).click();
				
		// this will get all the window id's "titles" using the "Set<String>" function which will store a series of rows where row 1 will be the Parent id.
		Set<String>ids=driver.getWindowHandles(); 
		
		
		Iterator<String> it=ids.iterator(); //import Iterator method to help navigate to specific id's.
		String parentid = it.next(); //comes to the first row and grabs the id and stores it into the variable "parentid".
		String firstChildid=it.next(); //traverses down one next id and stores it into the variable "fristChildid'
		
		driver.switchTo().window(firstChildid); //now we can switch to the first child window. 
		System.out.println(driver.getTitle()); // after switching to the child window we can get the title which should be "Google Account Help"

		driver.switchTo().window(parentid); //switching back to parent window 
		System.out.println(driver.getTitle()); // after switching to the parent window we can get the title which should be "Create your Google Account"
		
		System.out.println("END PROGRAM");

		// driver.close();

	}
	
	
	
	
	
}