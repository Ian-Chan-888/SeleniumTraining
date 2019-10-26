
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class S13_Lesson101_Handling_Auto_suggestive_dropdowns_options {

	
	
	
	public static void main(String[] args) throws InterruptedException {

	
	
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\eclipse\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.ksrtc.in/oprs-web");
		driver.manage().window().maximize();//max browser window
		/*
		 * Based on Keywords how to validate that certain relavant suggstion is present?
		 *  - because we are Validating the results this makes it difficult as the results of the elements do not show up. 
		 *  eg. Type 'BEN' in the From location and then confirm that one of the options that show up is "BENGALURU INTERNATION AIRPORT"
		 * 
		 * One way to confirm the relevant value then what we can do is preload all the values withing the main 'From' field and evaluate it. 
		 *  Algorithum we can use : 
		 *   1. Enter "BEN" in the From Field
		 *   2. Use the Down arrow using the Actions calss. ONCE and enter to load the first value into the "From Field and get its output
		 *   3. Confirm if that value is the correct one. 
		 *   4. If Value is not the matching one then repeat step 2 with +1 down arrow and then enter
		 *   5.  
		 * 
		 *     
		 */  
			
		driver.findElement(By.id("fromPlaceName")).sendKeys("BEN");
		
				
				
			System.out.println("End Program");
			
}

}