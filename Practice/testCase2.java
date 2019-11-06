package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class testCase2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// selenium code -

		// Create Driver object for InternetExplorerDriver Browser

		// We will strictly implement methods of Webdriver

		/*
		 * Class name = x,
		 * 
		 * x driver=new x()
		 */

		// InternetExplorerDriver

		System.setProperty("webdriver.ie.driver", "C:\\Program Files\\eclipse\\MicrosoftWebDriver.exe");
		WebDriver driver = new InternetExplorerDriver();

		driver.get("http://google.com");
		System.out.println(driver.getTitle());

	}

}