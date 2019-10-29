
import static org.junit.Assert.assertFalse;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.SendKeysAction;


public class Assignment8_Autocomplete_Dropdown_Assignment_S13 {

	
	
	
	public static void main(String[] args) throws InterruptedException {

	
	
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\eclipse\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://qaclickacademy.com/practice.php");
		driver.manage().window().maximize();//max browser window
		
		/*
		 * Type 'BEN' in the From location, select and then confirm that one of the options selected is "BENGALURU INTERNATION AIRPORT"
		 * 
		 * 1. in the 'Suggession Class Example', Enter 3 letters of a desired country 
		 * 2. Verify that the desired country shows up in the edit box
		 * 
		 * 
		 *  
		 *       
		 *    
		 *    
		 *     
		 */  
		
		WebElement fromPlaceName = driver.findElement(By.id("autocomplete"));
		fromPlaceName.sendKeys("can");
		Thread.sleep(2000);
		
		
		/*
		 * Javascript DOM can extract hidden elements
		 * Because slenium cannot identify hidden elements - (Ajax implementation)
		 * investigate the properties of object if it have any hidden text
		 * 
		*/
		
		//Define and import the JavascriptExecutor 
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
	    String targetResult = "Canada";
		
		//Start a loop to look for "Canada"
			String text="";
			
			
			
			//declaring the variable script to get the value using the JavascriptExecutor method and then returning it.
			String script = "return document.getElementById(\"autocomplete\").value;";
			
			System.out.println("Looking for: ----------------->  "+ targetResult);
			int i=0;
			
			while(!text.equalsIgnoreCase(targetResult)) //while NOT '!' 
			{
					i++;		 
				 	 fromPlaceName.sendKeys(Keys.ARROW_DOWN);
						
					//executing the js script and print to run console
					 text = (String) js.executeScript(script); //remember to "add cast to string" to remove any errors. 
						 System.out.println("Searching.. " + text);		
					if(i>10) { // run loop for a max of 10 iterations and if element not found then break.
						break;
					}	 

				 }
				 

				
			fromPlaceName.sendKeys(Keys.ENTER);
			 if (i>10)
			 {
				 System.out.println("Element not Found" );
			 }
			 else {
				 System.out.println("Found: " + text);
			 }
			 

			
			// Instructor Solution:
			 driver.findElement(By.id("autocomplete")).sendKeys("ind");

			    Thread.sleep(2000);

			    driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);

			    driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);

			   System.out.println(driver.findElement(By.id("autocomplete")).getAttribute("value")); 

			       

			       

					
				
		
		

		
		
				
				
			System.out.println("End Program");
			
}

}