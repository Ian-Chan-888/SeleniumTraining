import org.openqa.selenium.By;
import org.openqa.selenium.By.ByCssSelector;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class S08_Lesson53_Radiobutton_code_download {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver;

			System.setProperty("webdriver.chrome.driver","C:\\Program Files\\eclipse\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("http://www.echoecho.com/htmlforms10.htm"); //URL in the browser
			driver.manage().window().maximize();//max browser window

		
		
			System.out.println("START PROGRAM");
		
		Actions action = new Actions(driver);		
		action.sendKeys(Keys.PAGE_DOWN);
		action.sendKeys(Keys.PAGE_DOWN);
		action.sendKeys(Keys.PAGE_DOWN);
		action.sendKeys(Keys.PAGE_DOWN);
		Thread.sleep(3000);
		
			//driver.findElement(By.xpath("//input[@value='Milk']")).click();

			int count =driver.findElements(By.xpath("//input[@name='group1']")).size();

			for(int i=0;i<count;i++)

			{

			//driver.findElements(By.xpath("//input[@name='group1']")).get(i).click();

			String text=driver.findElements(By.xpath("//input[@name='group1']")).get(i).getAttribute("value");

			if(text.equals("Cheese"))

			{

			driver.findElements(By.xpath("//input[@name='group1']")).get(i).click();
			
			}
			}
	
		
	
				
			
			
			System.out.println("END PROGRAM");
		
			
			//driver.close();
			
		}
}