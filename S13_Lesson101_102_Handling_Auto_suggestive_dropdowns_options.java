
import static org.junit.Assert.assertFalse;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.SendKeysAction;


public class S13_Lesson101_102_Handling_Auto_suggestive_dropdowns_options {

	
	
	
	public static void main(String[] args) throws InterruptedException {

	
	
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\eclipse\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.ksrtc.in/oprs-web");
		driver.manage().window().maximize();//max browser window
		
		/*
		 * Type 'BEN' in the From location, select and then confirm that one of the options selected is "BENGALURU INTERNATION AIRPORT"
		 * 
		 * 
		 *  Algorithum we can use : 
		 *   1. Enter "BEN" in the From Field
		 *   2. Arrow down and get the text in the From field. 
		 *   3. If the text does not match then repeat step 2
		 *   4. If the value does match then stop and print the result value in the console
		 *   
		 *   PROBLEM: when trying to extract the text in the From field you will find that the information is not visible in Selenium
		 *      - Solution: Use the JavaScript HTML DOM(Document Object Model) to extract the hidden elements that Selenium cannot see. 
		 *        - Reference : https://www.w3schools.com/js/js_htmldom_document.asp
		 *        - This is becuause there is a form of Ajax implentation that makes information invisible to Selenium 
		 *  
		 *    Solution: There is a JavascriptExecutor that will allow you to do this and it is called the JavascriptExecutor.
		 *    HOW to use JavascriptExecutor
		 *     a. in developer tools of the browser select the "Console" 
		 *     b. knowing your element id you can write within the Console
		 *        "document.getElementById("fromPlaceName").value" 
		 *     c. Notice notice that this will yield the value of the field based on the "From" fields current state. 
		 *     d. Therefor we can write the following syntax within Selenium to access the value and return it. 
		 *     'retrun document.getElementById(\"fromPlaceName\").value'
		 *       - Note the '\' characters are added to help with denoting the double quotation specifier.
		 *       
		 *    
		 *    
		 *     
		 */  
		
		WebElement fromPlaceName = driver.findElement(By.id("fromPlaceName"));
		fromPlaceName.sendKeys("BEN");
		Thread.sleep(2000);
		
		
		/*
		 * Javascript DOM can extract hidden elements
		 * Because slenium cannot identify hidden elements - (Ajax implementation)
		 * investigate the properties of object if it have any hidden text
		 * 
		*/
		
		//Define and import the JavascriptExecutor 
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
	    String targetResult = "BENGALURU INTERNATION AIRPORT";
		
		//Start a loop to look for "BENGALURU INTERNATION AIRPORT"
			String text="";
			
			
			
			//declaring the variable script to get the value using the JavascriptExecutor method and then returning it.
			String script = "return document.getElementById(\"fromPlaceName\").value;";
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
			 

			
			
		
		
				
				
				
		
		

		
		
				
				
			System.out.println("End Program");
			
}

}