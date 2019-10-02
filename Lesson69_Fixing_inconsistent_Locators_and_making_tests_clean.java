import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Lesson69_Fixing_inconsistent_Locators_and_making_tests_clean {

	public static void main(String[] args) throws InterruptedException, IOException {

		WebDriver driver;

		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\eclipse\\chromedriver.exe");
		driver = new ChromeDriver();
		String[] itemsNeeded= {"Cucumber","Brocolli","Beetroot"};  // we are defining an array of strings in by listing the items in '{}'. Imprortant to define the array by "String[]"
		int itemNumber=0; //we know how many items in the above String[] array.
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise");
		Thread.sleep(3000);
		driver.manage().window().maximize();// max browser window
		driver.manage().deleteAllCookies();

		/*PROBLEM:
		 *In the Below example we know that the code works, However when we expected the 3 items "Cucumber","Brocolli" and "Beetroot" in the cart we got
		 * "Brocolli","Beetroot" and "Tomato"
		 * 
		 * REASON: 
		 * The "Add to Cart" button is counted up in the index as it is displayed, However this button will change to "Added" when it is clicked, then retruned to "Add to Cart". It did not stay static
		 * Our code below then added the "Add to Cart" index starting from the "Cauliflower" rather than the "Brocolli" 
		 * 
		 * TAKE AWAY: Do not rely on "TEXT" when qualifying locators. 
		 * 
		 * FIX: Redefine the element in line 76
		 * From:
		 * "driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();"
		 * To:
		 * "driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();"
		 * 
		 * 
		 */
		
				
		
		
		
		//Adding multiple products. Note that we Variablized an Array in Line 19 above. (Lesson 67)
		
		List<WebElement> multiProduct=driver.findElements(By.cssSelector("h4.product-name")); // find all the elements with this product-name
		
		for(int i=0;i<multiProduct.size();i++) //looks for all instances of products 
		{
			/* Format name to get the actual vegitable name Lesson 68  i.e "Brocolli - 1 Kg"
			 * the .split() with "-" 
			 * Note You are now using String[] instead of String because you have effectively split out mulitple strings. 
			 * Therefore you get 2 instances 
			 * From 'Brocolli - 1 kg'
			 * TO: name[0]= 'Brocolli '
			 *     name[1]= '1 kg'
			 */
			String[] name=multiProduct.get(i).getText().split("-"); 
			String formattedName=name[0].trim(); // since we still have a space after the split to deal with we will use the ".trim()".
			
			/* 1. convert array into ArrayList for easy search. doing it this way saves memory
			 * 2. check whether name you extracted is present in array List or not			
			 */
			List itemsNeededList= Arrays.asList(itemsNeeded); //step 1
			
						
			if(itemsNeededList.contains(formattedName)) //step 2
			{
				itemNumber++;
				//click on Add to Cart for that given index i
		      //driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				if(itemNumber==itemsNeeded.length) //we get the size of the String[] array on Line 19. This is so we can define when we need to break out of this loop
				{
					break;
				}
			}
		}

		System.out.println("END PROGRAM");

		// driver.close();

	}
	
	
	
	
	
}