import java.io.File;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.commons.io.FileUtils;
import com.google.common.io.Files;


public class Example_Screen_Shot {

	public static void main(String[] args) throws InterruptedException, IOException {

		WebDriver driver;

		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\eclipse\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();// max browser window
		driver.manage().deleteAllCookies();
		
		driver.get("http://google.com");
		driver.findElement(By.xpath("//body[@id='gsr']/div[@id='viewport']/div[@id='main']/span[@id='body']/center/div[@id='lga']/div[@id='hplogo']/a/img[1]")).click();
		
		getScreenshot(driver);

		System.out.println("END PROGRAM");

		// driver.close();

	}
	
	public static void getScreenshot(WebDriver driver) throws IOException
	{
		
		File src=  ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src,new File("C:\\Users\\ION64-2017\\Desktop\\screen shots\\file.jpg"));
		
	}
	
	
	
}