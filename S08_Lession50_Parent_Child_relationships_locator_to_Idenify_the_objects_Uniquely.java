import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class S08_Lession50_Parent_Child_relationships_locator_to_Idenify_the_objects_Uniquely {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\eclipse\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://spicejet.com");// go to url
		driver.manage().window().maximize();// max browser window
		// Note: I was getting element not interactable when the window is a smaller
		// size. I noticed that the drop down menu style changes when it is small in
		// size vs max windows size.
		// by maximizing the window i was able to avoid this error.

		// //a[@value='MAA'] - Xpath for Chennai

		// // a[@value='BLR']

		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).clear(); // this will open the first
																						// drop-down
		driver.findElement(By.xpath("//a[@value='BLR']")).click(); // this selects the Bengaluru (BLR) in the 'From'
																	// field
		Thread.sleep(2000);

		/*
		 * this xpath element "MAA" has 2 elements and thus you need to define which one
		 * you need to use to be accurate. then use
		 * 
		 * (xpath)[2] example --> "(//a[@value='MAA'])[2]"
		 * 
		 */

		// Before we used this with "indexes" to define the element ---->
		// driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
		/*
		 * below is another way of looking at this without using indexes "[2]"
		 * 
		 * //div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] --- is parent
		 * xpath
		 * 
		 * so then append the child xpath element at the end : //a[@value='MAA']
		 * 
		 * Therefore:
		 * //div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR']//a[@value='MAA
		 * '] ^ ^ Parent xpath Child xpath below (line 47) you will see a example of
		 * syntax for finding elements using the Parent child relationships.
		 */

		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']"))
				.click();

		System.out.println("Passed");

		// driver.close();

	}
}