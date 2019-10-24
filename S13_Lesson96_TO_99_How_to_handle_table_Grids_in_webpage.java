
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class S13_Lesson96_TO_99_How_to_handle_table_Grids_in_webpage {

	
	
	
	public static void main(String[] args) throws InterruptedException {

	
	
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\eclipse\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cricbuzz.com");
		driver.manage().window().maximize();//max browser window
		/*
		 * Includes: 
		 * 97. Techniues used for table grid_real time example. 
		 * 98. Practise exercises on Tables - 1 
		 * 99. Practise excercises on Tables - 2
		 * 
		 * Handling HTML5 tables  (cricbuzz.com/live-scores/...Scorecard)
		 * 1. get a list of all the runs scored "R" and match it with the total runs. Problem is that there are several tables using the same identifiers.
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
		 * 3. Tables - 1 : 
		 *  - output the "Extras" and Total at the end of the tables. 
		 *  - Strategy : reference from Section 6 Lesson 37 - Traversing back to parent node from siblings.   
		 *     
		 * 4. Tables - 2 : 
		 *  - Summing up all the values.     
		 *     
		 */  
			
		
		//1 and 2
		//click on "Live Scores" on top of the page
		driver.findElement(By.xpath("//a[contains(text(),'Live Scores')]")).click();
		
		//Print out the team names on the first table. 
		WebElement teamNames= driver.findElement(By.cssSelector("div[class='cb-mtch-lst cb-col cb-col-100 cb-tms-itm'] "
				+ "[class='cb-col-100 cb-col cb-schdl'] [class='cb-lv-scr-mtch-hdr inline-block']"));
		System.out.println("The Teams = " + teamNames.getText());
		
		//click on "scorecard" of the first game in the list
		driver.findElement(By.xpath("//div[contains(@class,'cb-col-67 cb-col cb-left cb-schdl')]//div[1]//div[1]//nav[1]//a[2]")).click();
		    
		Thread.sleep(2000);
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
		
			//3
			//Get the value associated with "Extras" within its row
			//                                                                                    |    Parent="Extras"  | Sibling = <value>    |           
			System.out.println("The UI representation of Extras= "+ driver.findElement(By.xpath("//div[text()='Extras']/following-sibling::div")).getText());
			//Get the value associated with "Total" within its row
			//                                                                                    |    Parent="Total"  | Sibling = <value>    | 
			System.out.println("The UI representation of Total= "+ driver.findElement(By.xpath("//div[text()='Total']/following-sibling::div")).getText());
			
			//4
			/* Get sum of all the values.
			 * We declare a sum variable and count the rows in the table.  
			 */
			int sum=0;
			int countsum=table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).size();
			
			for (int i=0;i<countsum-2;i++)// the 'count-2' will remove the last 2 loops/lines 
			{
				//sum up numbers in each row of the first table in the 3rd coloumn "R"
				String value = table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i).getText();
				int valueinteger= Integer.parseInt(value);// converting the string 'Value' into an integer
				
				sum=sum+valueinteger; //adding up each row of the 3rd column and store it into sum
				
				
			}
			
			String Extras = driver.findElement(By.xpath("//div[text()='Extras']/following-sibling::div")).getText();
			int valueExtras = Integer.parseInt(Extras);// converting the string 'Extras' into an integer
			int TotalSumValue= sum + valueExtras;
			
			System.out.println("The total calculated sum = " + sum);
			System.out.println("The total calculated sum + Extras = " + TotalSumValue + "\n" );
			
			//now lets confirm the Actual total Value = the UI represented Total Value.
			String ActualTotal = driver.findElement(By.xpath("//div[text()='Total']/following-sibling::div")).getText();
			int ActualTotalValue = Integer.parseInt(ActualTotal);	// converting the string 'ActualTotal' into an integer
			
			if (ActualTotalValue == TotalSumValue) // '==' rerpesents the boolean equals
			{
				System.out.println("PASS: 'The UI representation of Total' = The total calculated sum");
			}
			else
			{
				System.out.println("Fail: 'The UI representation of Total' != The total calculated sum");
			}
				
				
				
			System.out.println("End Program");
			
}

}