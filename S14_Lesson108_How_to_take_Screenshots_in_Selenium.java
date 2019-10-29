
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class S14_Lesson108_How_to_take_Screenshots_in_Selenium {

	
	
	

	public static void main(String[] args) throws InterruptedException, IOException {

	
	
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\eclipse\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();//max browser window
		driver.manage().deleteAllCookies();//deletes all the cookies in the browser
		// driver.manage().addCookie("arg0"); //adding a specific cookie
		driver.manage().deleteCookieNamed("sessionKey");//deletes a specific cookie
		
		
		driver.get("https://www.facebook.com");
		
		/*
		 * import org.openqa.selenium.TakesScreenshot;
		 * import java.io.File;
		 * import org.apache.commons.io.FileUtils;  - may need to import manually if this does not work right away. 
		 *    
		 *    
		 *     
		 */  
		
		// Takes the screen shot of facebook.com and stores it as src
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);		
		
		FileUtils.copyFile(src,new File("C://Users//ION64-2017//Desktop//screenshot.png")); //implement "Throws IOException" in your Public static void main section.
		// make sure your not using just the C:// drive root. Due to admin rights your access will be denied.
		
				
				
				
		
		

		
		
				
				
			System.out.println("End Program");
			
}

}