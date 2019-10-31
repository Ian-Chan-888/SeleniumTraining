

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class S14_Lesson111_112_Descending_order_Validataion_strategy_using_Collections_framework {

	
	
	

	public static void main(String[] args) throws InterruptedException, IOException {

	
	
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\eclipse\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();//max browser window
		driver.manage().deleteAllCookies();//deletes all the cookies in the browser

		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		
		/*
		 *How to verify if the data in colums are sorted properly or not. 
		 *
		 *1. retrive all values of veg/fruit name coloumn
		 * - create:
		 *  A. originalList-
		 *    :3124
		 *  B. copiedList- 3124 sort
		 *    :1234
		 *    
		 *  C. ArrayList2- sorted
		 *  ________________________________________
		 *  | # | Veg/fruit name | Price| Discount |
		 *  |---|----------------|------|----------|
		 *  | 1 | Apple          | 230  |  200     |
		 *  | 2 | Carrot         | 36   |  25      |
		 *  | 3 | Orange         | 43   |  40      |
		 *  | 4 | Potato         | 20   |  10      |
		 *  | 5 | Tomato         | 30   |  15      |
		 *  | 6 | Mango          | 95   |  66      |
		 *  ----------------------------------------
		 *     
		 */  
	
	//click on the sort button twice to sort by asscending order
		driver.findElement(By.cssSelector("tr th:nth-child(2)")).click();//first click makes it desc
		driver.findElement(By.cssSelector("tr th:nth-child(2)")).click();//send click makes it asc
		
		
	//identify the 2nd column  table "Veg/fruit name"
		List<WebElement> nameColumn = driver.findElements(By.cssSelector("tr td:nth-child(2)"));
		
		
	// A. originalList is created
		ArrayList <String> originalList=new ArrayList<String>();
		
		for (int i=0;i<nameColumn.size() ;i++)
		{
			originalList.add(nameColumn.get(i).getText()); 
		}
		System.out.println("-------------------Original List----------------------");		
		//PRINTING: ehanced for loop  to print out the sorted list
		for(String s: originalList) //alternatively you can use : "for (int i=0; i<copiedList.size() ;i++)"
		{
			System.out.println(s); //cntrl + space will auto populate syntax when you start it. 
			
		}		
	//B. copy the original list and sort
		ArrayList<String> copiedList = new ArrayList<String>();
		
		for (int i=0;i<originalList.size() ;i++)
		{
			copiedList.add(originalList.get(i)); //copy each value from the original list and place it into the copiedList
						
		}
		
						
		Collections.sort(copiedList); // sorts the copiedList (asc)
		//Collections.reverse(copiedList); // sorts the copiedList (desc)
		
		
		System.out.println("-------------------Copied List (sorted)----------------------");
		//PRINTING: ehanced for loop  to print out the sorted list
		for(String s: copiedList) //alternatively you can use : "for (int i=0; i<copiedList.size() ;i++)"
		{
			System.out.println(s); //cntrl + space will auto populate syntax when you start it. 
			
		}
		
		
		Thread.sleep(2000);
		if (originalList==copiedList)
		{
			System.out.println("The above tables are NOT the same");
		}
		else {
			System.out.println("The above tables are the same");
		}
		
		Assert.assertTrue(originalList.equals(copiedList));  // Throws exception if originalList is not equal to the copiedList
		

		
	//C. 
		

		
		
				
				
			System.out.println("End Program");
			
}

}