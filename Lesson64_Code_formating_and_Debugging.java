import java.io.File;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.commons.io.FileUtils;
import com.google.common.io.Files;


public class Lesson64_Code_formating_and_Debugging {

	public static void main(String[] args) throws InterruptedException, IOException {

		WebDriver driver;

		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\eclipse\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();// max browser window
		driver.manage().deleteAllCookies();

		/*
		 * 1. How to format and align the code in Eclipse? - there exists a shortuct to
		 * autoformat the code in Eclipse. Cntrl+Shift + F
		 * 
		 * 2. Naming Conventions in defining class, Variable and method names.
		 * 'camelCase' format: 
		 * - For Class names you must have the first Letter in Capitals and subsequent letters in lower case. 
		 * - For Variable and Method names should always be in lower case. i.e String mousePad=... or int totalSumValue=...
		 * 
		 *  
		 * How to debug the code in Eclipse?
		 * By adding a "Toggle Breakpoint"(right click on the line number) and with "Debut As" the test will run up to the Toggle Breakpoint. 
		 * Then you can audit the steps at the Toggle breakpoint line where you can step thru each line by using the "Step Over". If you want to resume the run 
		 * then you can clcik on the "Resume"(F8). Either to the next breakpoint for to the end of the code.
		 * 
		 * Step into: will debug the Method. the Method example is outside the publice static void main i.e 'public static void getScreenshot(WebDriver driver) throws IOException'
		 * 
		 *
		 * 
		 */
		
		getScreenshot(driver);

		System.out.println("END PROGRAM");

		// driver.close();

	}
	
	public static void getScreenshot(WebDriver driver) throws IOException
	{
		driver.get("http://google.com");
		driver.findElement(By.xpath("//body[@id='gsr']/div[@id='viewport']/div[@id='main']/span[@id='body']/center/div[@id='lga']/div[@id='hplogo']/a/img[1]")).click();
		File src=  ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src,new File("C:\\Users\\ION64-2017\\Desktop\\screen shots\\file.jpg"));
		
	}
	
	
	
}