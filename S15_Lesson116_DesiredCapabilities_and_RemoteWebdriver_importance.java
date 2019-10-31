

import java.io.IOException;
import java.net.URL;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;


public class S15_Lesson116_DesiredCapabilities_and_RemoteWebdriver_importance {

	
	
	

	public static void main(String[] args) throws InterruptedException, IOException {

	
	

		
		/*
		 * Lets write some code to remote test: 
		 * 
		 * import org.openqa.selenium.remote.DesiredCapabilities;
		 * - helps set the environment and parameters
		 *        
		 *        
		 *        
		 *        
		 *     
		 *     
		 */  
	
	
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setBrowserName("chrome"); // set Chrome Browser
		dc.setPlatform(Platform.WIN10); //set to windows 10 OS
		
		/*where you would use Webdriver driver = new Chromedriver(); you use: 
		 * WebDriver driver = new RemoteWebDriver(new URL (<address>),dc);
		 * 
		 * you need to add: 
		 * import org.openqa.selenium.remote.RemoteWebDriver;
		 * import java.net.URL
		 * 
		 */
		
		WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),dc);

		
		
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\eclipse\\chromedriver.exe");
		driver.manage().window().maximize();//max browser window
		driver.manage().deleteAllCookies();//deletes all the cookies in the browser
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		
				
				
			System.out.println("End Program");
			
}

}