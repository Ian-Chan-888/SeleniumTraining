import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Xpath_Parent_child_Traverse_36 {

	public static void main(String[] args) {

		//This lesson is to generate custom xpath from html attributes. When looking at a html: for the example in line 12.
			//<input type="email" class="inputtext" name="email" id="email" data-testid="royal_email">
		
				//"input" is referred to as the TagName
				//type,class, name, id, are examples of Attributes 
				//email,inputtext,email,royal_email are examples of values for the associated attributes. 
		//syntax for xpath = //tagName[@attribute='value']
		
		// for the following html line "<input value="Log In" aria-label="Log In" data-testid="royal_login_button" type="submit" id="u_0_2">"
		//The xpath would be "//input[@value='Log In']
		// to verify this is the correct xpath you can paste the following in the developer console of the page you are on: $x("//input[@value='Log In']")
		  // you can also replace the "input" tag with *, which will find any tags matching the attributes listed. i.e for //*[@value='Log In"]
		
		//One can also define an attribute value without knowing the full name of the value by using the 'contains' syntax. format should be //input[contains(attribute,'value')] 
		// i.e for <input name="username123"">
		// we can write -   //input[contains(@name,'username')]
	
		

	
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\eclipse\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();//max browser window
		
		
		driver.get("http://salesforce.com");//go to url
		
		//CSS and Xpath
		
		
		//Xpath
		
		
		try {
			//drop down menu navigation example
			String ContactusXP="/html/body/header/div[2]/div[3]/div/div/nav/div[1]/div/div[3]/div[1]/div[3]/a";//"Contact Us"  
			//.. when xpath starts with "//html.."  then switch browser and find element again. "//*id..." is better.
			WebElement menu=driver.findElement(By.xpath(ContactusXP));
			//Move mouse pointer on DrowDown Menu
			Actions actions=new Actions(driver);
			actions.moveToElement(menu).perform();
			driver.findElement(By.xpath("/html/body/header/div[2]/div[3]/div/div/nav/div[1]/div/div[3]/div[1]/div[3]/ul/li[3]/a")).click();
			
			//fill out fields
			driver.findElement(By.xpath("//*[@id=\"UserFirstName\"]")).sendKeys("Ian"); // First Name
			driver.findElement(By.xpath("//*[@id=\"UserLastName\"]")).sendKeys("Chan"); //Last Name
			
			driver.findElement(By.xpath("//*[@id=\"UserTitle\"]")).sendKeys("CEO"); //Job title
			driver.findElement(By.xpath("//*[@id=\"UserEmail\"]")).sendKeys("gmail@gmail.com"); //email address
			driver.findElement(By.xpath("//*[@id=\"UserPhone\"]")).sendKeys("123-456-7890"); //Phone number
			driver.findElement(By.xpath("//*[@id=\"CompanyName\"]")).sendKeys("My First Company"); //Company Name
			
			
			//go back to main page
			
			driver.navigate().back();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//CSS
		// there is no direct way to get CSS in chrome. however you will find it in the tool bar just below the elements console
		String Logincss="body > header > div:nth-child(2) > div:nth-child(3) > div > div > nav > div.container.globalnavbar-header-container > div > div.top-section.col > div.utility-bar > div.global-nav-login-flydown.global-login > div > a";
		String Username= "Your Username here";	
			driver.findElement(By.cssSelector(Logincss)).click(); // clicking on the Login button to enter the login screen
			driver.findElement(By.id("username")).sendKeys(Username);//entering user name
			//get error message when no password it selected - then display error message in console.
			driver.findElement(By.cssSelector("#Login")).click(); //click on login
			System.out.println("Error message: ");
			System.out.println(driver.findElement(By.cssSelector("div#error.loginError")).getText()+"\n");// confirming error message wants password.
			System.out.println("The current web page title is: ");
			System.out.println(driver.getTitle()+"\n");
			System.out.println("The current url is:");
			System.out.println(driver.getCurrentUrl()+"\n");
		
		
		System.out.println("Passed");
		
		
		//driver.close();
		
	}

}
