import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


public class S08_Lesson61_Handling_Java_alerts_using_Selenium_Webdriver {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver;
	
			System.setProperty("webdriver.chrome.driver","C:\\Program Files\\eclipse\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("http://rahulshettyacademy.com/AutomationPractice/"); //URL in the browser
			driver.manage().window().maximize();//max browser window
	
		/*
		 * Handling Popup messages on web sites: 
		 * Sometimes popup messages will appear and will have no HTML properties. Instead it is a part of Java GUI
		 * This lesson will show how to deal with this. Using the "Switch to Alert Example" in the web site"
		 * rahulshettyacademy.com/AutomationPractice
		 *  
		 *  NOTE: this procedure will not work with Network ID and password scenarios that are java based.
		 */
			
			
			
			
			/* "Switch to Alert Example" : Alert button. 
			 * 1. Enter the Name in the text box
			 * 2. Click on Alert Button
			 * 3. A popup will appear with a OK button. The question becomes, 
			 * how to handle this box when there is no HTML element associated with it? 
			 * 4. Answer: 'switchTo()' context to the Alert and use the 'getText()' to retrieve the text.
			 * 5. By using the '.accept()' you can click on the OK button.
			 * 
			 */
			String text = "Ian"; //variablizing the 'text'
			driver.findElement(By.id("name")).sendKeys(text);
			driver.findElement(By.cssSelector("[id=alertbtn]")).click();
			//4.
			System.out.println(driver.switchTo().alert().getText());
			//5.
			driver.switchTo().alert().accept();
			
			
			/* "Switch to Alert Example" : Confirm button. 
			 * 1. Enter the Name in the text box
			 * 2. Click on Alert Button
			 * 3. A popup will appear with a OK and a Cancel button. The question becomes, 
			 * how to handle this box when there is no HTML element associated with it? 
			 * 4. Answer: 'switchTo()' context to the Alert and use the 'getText()' to retrieve the text.
			 * 5. By using the '.dismiss()' you can click on the Cancel button. "Which is a 'negative' button request 
			 * i.e : 'Cancel'
			 * Conversley the possitive button request associated with 'accept()'.
			 * 
			 * 
			 */
			String text1 = "Ian"; //variablizing the 'text'
			driver.findElement(By.id("name")).sendKeys(text1);
			driver.findElement(By.cssSelector("[id=confirmbtn]")).click();
			//4.
			System.out.println(driver.switchTo().alert().getText());
			//5.
			driver.switchTo().alert().dismiss();
			
			
			System.out.println("END PROGRAM");
		
			
			//driver.close();
			
		}
}