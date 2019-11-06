import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lession42_CSS_Selection_Locators {

	public static void main(String[] args) {

		// To validate valid css elecments in console you can type : $$("header") i.e:
		// $$("*[class='input r4 wide mb16 mt8 password']")

		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\eclipse\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();// max browser window

		driver.get("http://login.salesforce.com");// go to url

		// there is no direct way to get CSS in chrome. however you will find it in the
		// tool bar just below the elements console
		String Username = "Your Username here";
		// tagname[attribute='value'
		driver.findElement(By.cssSelector("*[class='input r4 wide mb16 mt8 username']")).sendKeys(Username);// entering
																											// user name
		driver.findElement(By.cssSelector("*[class='input r4 wide mb16 mt8 password']")).sendKeys("Password_here");
		// using * as a wildcard to identify tagname

		System.out.println("Passed");

		// driver.close();

	}

}
