import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class S09_Lesson65_Adding_Items_into_Cart_Ecommerce {

	public static void main(String[] args) throws InterruptedException, IOException {

		WebDriver driver;

		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\eclipse\\chromedriver.exe");
		driver = new ChromeDriver();
		String[] itemsNeeded= {"Brocolli","Beetroot","Cauliflower"};  // we are defining an array of strings in by listing the items in '{}'. Imprortant to define the array by "String[]"
		int itemNumber=0; //we know how many items in the above String[] array.
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise");
		driver.manage().window().maximize();// max browser window
		driver.manage().deleteAllCookies();

		/*
		 * Lets Add Items to cart and run some validations
		 * Problem is that there are several elements labled "Add to Cart" How do we know which "Add to Cart" to click?
		 * By Looping to each product name and finding the correct name then click on the 'Add to Cart" for that index.
		 * 
		 */
		
		//Example 1: Adding Cucumber into cart. Identifying the Cucumber index and then clicking on the add to cart button within that index 
		List<WebElement> products=driver.findElements(By.cssSelector("h4.product-name")); // find all the elements with this product-name
		
		for(int i=0;i<products.size();i++) //looks for all instances of products 
		{
			String name=products.get(i).getText(); 
			
			if(name.contains("Cucumber"))
			{
				//click on Add to Cart for that given index i
				driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
				break;
			}
		}
		
		
				
		
		
		
		//Example 2: Adding multiple products. Note that we Variablized an Array in Line 19 above. (Lesson 67)
		
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
				driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
				if(itemNumber==3) //since we know we defined 3 items in the String[] array on Line 19
				{
					break;
				}
			}
		}

		System.out.println("END PROGRAM");

		// driver.close();

	}
	
	
	
	
	
}