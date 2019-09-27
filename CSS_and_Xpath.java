import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CSS_and_Xpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//selenium code - 
		
		//Create Driver object for Chrome Browser
		
		// We will strcily implement methods of Webdriver
		
		 /* Class name = x,
				  
				  x driver=new x()*/
		
		
	
	//invoke .exe file first; therefore you must first download the driver i.e chromedriver. (https://sites.google.com/a/chromium.org/chromedriver/)	
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
