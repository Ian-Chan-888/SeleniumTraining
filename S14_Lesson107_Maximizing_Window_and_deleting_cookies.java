
import static org.junit.Assert.assertFalse;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.SendKeysAction;


public class S14_Lesson107_Maximizing_Window_and_deleting_cookies {

	
	
	
	public static void main(String[] args) throws InterruptedException {

	
	
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\eclipse\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();//max browser window
		driver.manage().deleteAllCookies();//deletes all the cookies in the browser
		// driver.manage().addCookie("arg0"); //adding a specific cookie
		driver.manage().deleteCookieNamed("sessionKey");//deletes a specific cookie
		
		
		driver.get("https://www.facebook.com");
		
		/*
		 * 
		 *  using the driver.manage will set browser configurations  
		 *    
		 *    
		 *     
		 */  
		
					
		
		
				
				
				
		
		

		
		
				
				
			System.out.println("End Program");
			
}

}