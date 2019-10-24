import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import javax.xml.crypto.dsig.keyinfo.KeyInfo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;



public class Assignment6_Practicce_Excercise {

	public static void main(String[] args) throws InterruptedException, IOException {

		WebDriver driver;

		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\eclipse\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://qaclickacademy.com/practice.php");
		driver.manage().window().maximize();// max browser window
		driver.manage().deleteAllCookies();
		WebDriverWait w = new WebDriverWait(driver,5);
		Actions a = new Actions(driver); //defining new Actions class (you will need to import it as part of the Selenium libraries.
		/*
		 * In this Assignment : 
		 * Navigate to QAclickAcademy / practice
		 * 1. Go to the Web Table Example 
		 *    - Print the number of rows present  (Expected Result = 11 rows)
		 *    - Print the number of columns (Expected Result = 3 columns)
		 * 2. Print the second row of data. (Expected Result = Rahul Shetty, Learn SQL in Practical + Database Testing from Scratch, 25)
		 * 
		 * 
		 * 
		 * Note: you should not hard code any parts during this assignment. 
		 * 		 * 
		 * info@clickacademy.com -  for email questions. 
		 * 
		 */
		
		
		//1
		//number of rows
		int rows = driver.findElements(By.cssSelector("table[class='table-display'] tr")).size();
		System.out.println("There are " + rows + " rows");
		
		//number of coloumns
		int columns = driver.findElements(By.cssSelector("table[class='table-display'] tr th")).size();
		System.out.println("There are " + columns + " columns");
		
		//2.
	
		// Print the Second row of values; minus the title row
		String rowname = driver.findElement(By.cssSelector("table[class='table-display'] tr:nth-child(3)")).getText();
		System.out.println(rowname);
		
		System.out.println("\n" + "BONUS Printing all the rows of the table:" + "\n");
		
		// BONUS section: lets print the whole table
				
		int count = rows;
		
		for (int i=0;i<count;i++)
		{
			String rowValues = driver.findElements(By.cssSelector("table[class='table-display'] tr")).get(i).getText();
			System.out.println("Row " + i + " = " + rowValues);
		}
		
		System.out.println("\n" + "Instructor Solution Below:" + "\n");
		
		//* Instructor Solution: 
		 WebElement table=driver.findElement(By.id("product"));


			System.out.println(table.findElements(By.tagName("tr")).size());
			
			
			System.out.println(table.findElements(By.tagName("tr")).get(0).findElements(By.tagName("th")).size());
			
			
			List<WebElement> secondrow=table.findElements(By.tagName("tr")).get(2).findElements(By.tagName("td"));
			
			
			System.out.println(secondrow.get(0).getText());
			
			
			System.out.println(secondrow.get(1).getText());
			
			
			System.out.println(secondrow.get(2).getText());
			
			}
			
{}
			
			
{
		
		
		
		
		
		System.out.println("END PROGRAM");	
		}


	
}
		
		
	
	
	
