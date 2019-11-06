package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class testCase3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// selenium code -

		// Create Driver object for Firefox Browser

		// We will strictly implement methods of Webdriver

		/*
		 * Class name = x,
		 * 
		 * x driver=new x()
		 */

		// gecko driver

		System.setProperty("webdriver.geckodriver.driver", "C:\\Program Files\\eclipse\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();

		driver.get("http://google.com");
		System.out.println(driver.getTitle());

	}

}