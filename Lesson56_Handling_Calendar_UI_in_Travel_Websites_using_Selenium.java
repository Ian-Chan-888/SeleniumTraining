import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


public class Lesson56_Handling_Calendar_UI_in_Travel_Websites_using_Selenium {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver;
	
			System.setProperty("webdriver.chrome.driver","C:\\Program Files\\eclipse\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("http://spicejet.com"); //URL in the browser
			driver.manage().window().maximize();//max browser window
			Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
			//Assert.assertFalse(true);System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
			driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
			System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
			Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
			
			//choosing destinations first
			driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).clear(); // this will open the first drop-down
			driver.findElement(By.xpath("//a[@value='BLR']")).click(); // this selects the Bengaluru (BLR) in the 'From' field
			Thread.sleep(2000);
			
			/* this xpath element "MAA" has 2 elements and thus you need to define which one you need to use to be accurate. then use 
			(xpath)[2]  example --> "(//a[@value='MAA'])[2]"
			*/
			
			/*driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
			or can use the code below instead 
			driver.findElement(By.xpath("//div[@id='glsct100_mainContent_ddl_destinationStation1_CTNR']//a[@value='MAA']")).click();
			*/
			driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();	
			
			//select the active Calendar date (todays date); There is a class that specifically defines the active date. 
			driver.findElement(By.cssSelector("a[class='ui-state-default ui-state-active']")).click();  
			
				/* NOTE: you can use '.' to state css patterns with a space between the statements. For instance:
				class="ui-state-default ui-state-highlight ui-state-active" can be written as ".ui-state-default.ui-state-highlight.ui-state-active"
				 */
			
			
			
			
			//Count the number of checkboxes: 
			
			System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
			
			
			
			
			
			
			System.out.println("END PROGRAM");
		
			
			//driver.close();
			
		}
}