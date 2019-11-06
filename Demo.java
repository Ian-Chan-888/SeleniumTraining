import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//selenium code - 

		// Create Driver object for Chrome Browser

		// We will strcily implement methods of Webdriver

		/*
		 * Class name = x,
		 * 
		 * x driver=new x()
		 */

		// invoke .exe file first; therefore you must first download the driver i.e
		// chromedriver. (https://sites.google.com/a/chromium.org/chromedriver/)
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\eclipse\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://google.com");
		System.out.println(driver.getTitle());

		System.out.println(driver.getCurrentUrl());
		// System.out.println(driver.getPageSource());

		driver.close();

	}

}
