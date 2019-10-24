import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class S12_Lesson88_89_90_91_Practice_Exercise_print_the_links_count_in_the_page {

	public static void main(String[] args) throws InterruptedException, IOException {

		WebDriver driver;

		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\eclipse\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://qaclickacademy.com/practice.php");
		driver.manage().window().maximize();// max browser window
		driver.manage().deleteAllCookies();

		/*
		 * 1. Give me the count of the links on the page.
		 *  usually links will have a tag of 'a' which stands for anchor
		 *  
		 * 2. Give me the count of links in the footer section (bottom 'section' of the page). This is Limiting Webdriver scope.
		 *  - create a 'footer' driver or driver subset of the global driver webage. eg : for this page it is the section that starts with "Discount Coupons... etc"
		 *
		 * 3. Give me the links count of the first column of the footer section. This will give us a furtrer sub sub driver scope.
		 * 
		 * 4. Click on each link in the coloumn and check if the pages are opening. knowing that the links are dynamic(constantly changing in size).
		 *  - keep in mind we want to optimally account for future changes. For instance, what if the number of links increase or decrease.
		 *  -Avoid hard coding the commands. 
		 * 
		 * info@clickacademy.com -  for email questions. 
		 * 
		 */
		
		//1.
		System.out.println(driver.findElements(By.tagName("a")).size());  //gives the amount of links on the page.
		
		//2. 
		WebElement footerdriver=driver.findElement(By.id("gf-BIG")); // defining the driver for the footer section
		System.out.println(footerdriver.findElements(By.tagName("a")).size()); //gives the amount of links in the subsection of the page defined by the "footerdriver"			
				
		//3. 
		WebElement columndriver=footerdriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul")); /*since we already defined a sub driver we can use it to further
		create a sub sub driver called columndriver. */
		System.out.println(columndriver.findElements(By.tagName("a")).size());
		
		//4. 
		for (int i=1;i<columndriver.findElements(By.tagName("a")).size();i++)
		{
			//now navigate to each child window and get the title of each tab.
			String clickonlinkTab=Keys.chord(Keys.CONTROL,Keys.ENTER); //open all the links in a separate tab by using the control + enter
			columndriver.findElements(By.tagName("a")).get(i).sendKeys(clickonlinkTab);  //for each value of i click on the link within the columdriver.
			Thread.sleep(5000L);
		}
			Set<String>abc=driver.getWindowHandles();//4
			Iterator<String>it=abc.iterator();
			
			while(it.hasNext()) //hasNext tells us if the next index is present or not. 
			{
				driver.switchTo().window(it.next()); //switch to next window
				System.out.println(driver.getTitle()); //print title. 
			}
		}
		
		/*
		 * This is my Best guess, and it did the same thing as above.
		 * now navigate to each child window and get the title of each tab.
		Set<String>ids=driver.getWindowHandles();
		int idnum=driver.getWindowHandles().size(); //find out how many windows are open
		Iterator<String> it=ids.iterator(); //import Iterator method to help navigate to specific id's.
		
		
		for (int i=1;i<idnum;i++)
		{
			String window = it.next(); //comes to the first row and grabs the id and stores it into the variable "window"
			driver.switchTo().window(window); //now we can switch to the next window
			System.out.println(driver.getTitle()); 

		}
		
		*/
	
	
}
		
		
	
	
	
