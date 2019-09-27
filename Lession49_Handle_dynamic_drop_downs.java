import org.openqa.selenium.By;
import org.openqa.selenium.By.ByCssSelector;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Lession49_Handle_dynamic_drop_downs {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\eclipse\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://spicejet.com");//go to url
		driver.manage().window().maximize();//max browser window
		// Note: I was getting element not intractable when the window is a smaller size. I noticed that the drop down menu style changes when it is small in size vs max windows size.
		// by maximizing the window i was able to avoid this error. 
		
		//  //a[@value='MAA']  - Xpath for Chennai 
		
		//	// a[@value='BLR']
		
			driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).clear(); // this will open the first drop-down
			driver.findElement(By.xpath("//a[@value='BLR']")).click(); // this selects the Bengaluru (BLR) in the 'From' field
			Thread.sleep(2000);
			
			/* this xpath element "MAA" has 2 elements and thus you need to define which one you need to use to be accurate. then use 
			
			(xpath)[2]  example --> "(//a[@value='MAA'])[2]"
			
			*/
			
			driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
		
			System.out.println("Passed");
		
			
			//driver.close();
			
		}
}