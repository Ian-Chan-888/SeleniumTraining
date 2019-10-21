import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


public class S08_Lesson57_Validating_if_UI_Element_are_disabled_or_enabled_with_Attributes {

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
			 
			
			
			
			
			
			
			// ***************************  NEW  *******************************************************
			//select round trip 
			System.out.println(driver.findElement(By.id("Div1")).getAttribute("style")); // get attribute values before we click on the round trip button
			driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();// click on the round trip button.
			/*
			System.out.println(driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled()); Note Should retrun True. This may not allways work depending on some websites. In this example
			spicejet.com maskes this calander to look like it is dissabled(gryed out) however the elment is actually enabled. You can see this by clicking on the calander. So we can use the workaround in
			The next command.
			*/
			//Confirm calendar is greyd out. We will identify the ATTRIBUTE that showes the 'fake' greyed out calendar. That attribute is "style". therefore: 
			System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
			if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1"))  // this will look at the opacity value where 0.5 displays dissabled where 1 is enabled.
			{
				System.out.println("RETRUN DATE calendar is not greyed out aka Enabled.");
					Assert.assertTrue(true);
			}
			else
			{
				System.out.println("RETRUN DATE calendar is greyed out aka Disabled.");
				Assert.assertTrue(false);
				
			}
			
			
			
			
			//Count the number of checkboxes: 
			
			
			
			System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
			
			
			
			
			
			
			System.out.println("END PROGRAM");
		
			
			//driver.close();
			
		}
}