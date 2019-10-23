
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class S13_Lesson97_98_99_Practical_problems_and_Methods_to_Handle_them_with_Selenium {

	
	
	
	public static void main(String[] args) throws InterruptedException {

	
	
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\eclipse\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cricbuzz.com");
		driver.manage().window().maximize();//max browser window
		/*
		 * Handling HTML5 tables  (cricbuzz.com/live-scores/...Scorecard)
		 * 1. get a list of all the runs scored "R" and match it with the total runs. 
		 * 2. Strategy: utilize loops and decoupling hardcoding concepts 
		 *   - There are common css within the values of the table. 
		 *   - subsequent tables need to be filtered out. as they may also have common css identifiers. 
		 *   - Look at Parent objects to help you landmark the correct identifiers. Then use Parent / child css concepts to isolate your references. 
		 *   		- Parrent css - then Child css.
		 *   Parrent class = cb-col cb-col-100 cb-ltst-wgt-hdr
		 *   	-defined by 'table'
		 *      - 'div:nith-child(3)'  = 3rd child of div tag in question. Using this syntax will further help define the row you are isolating.
		 *      -  'get(i)' is the method for the index of i
		 *     
		 *                  ROW									3rd Col
		 *     div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)
		 *     
		 *     
		 */  
			
		//click on "Live Scores" on top of the page
		driver.findElement(By.xpath("//a[contains(text(),'Live Scores')]")).click();
		
		//click on "scorecard" of the first game in the list
		driver.findElement(By.xpath("//div[contains(@class,'cb-col-67 cb-col cb-left cb-schdl')]//div[1]//div[1]//nav[1]//a[2]")).click();
		    
		
			WebElement table = driver.findElement(By.cssSelector("div[class='cb-col cb-col-100 cb-ltst-wgt-hdr']"));
			// -this will grab all the row elements of the row and give you the count of them
			int rowcount= table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms']")).size();// this statement scope is restriced to only the elements within the "table" defined in the previous line.
			// -this will give you the count of the 3rd column and give you the count of them
			int count=table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).size();
			
			for (int i=0;i<count-2;i++)// the 'count-2' will remove the last 2 loops/lines 
			{
				//Print the text of the each row in the first table in the 3rd coloumn
				System.out.println(table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i).getText());
			}
			
			System.out.println("End Program");
			
}

}