import java.io.File;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.commons.io.FileUtils;
import com.google.common.io.Files;


public class LessonX_Template {

	public static void main(String[] args) throws InterruptedException, IOException {

		WebDriver driver;

		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\eclipse\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().window().maximize();// max browser window
		driver.manage().deleteAllCookies();

		/*
		 * 
		 * 
		 *
		 * info@clickacademy.com -  for email questions
		 */
		
		

		System.out.println("END PROGRAM");

		// driver.close();

	}
	
	
	
	
	
}