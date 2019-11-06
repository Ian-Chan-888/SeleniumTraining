
import static org.junit.Assert.assertFalse;

import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.SendKeysAction;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class S14_Lesson105_Handling_HTTPS_certifications {

	public static void main(String[] args) throws InterruptedException {

		/*
		 * SSL Certifications and how to handle them to land on the web site you are
		 * testing. -Typically you want to click on the "Procceed Anyway" - Use
		 * "ChomeOptions"
		 * 
		 * Certifcation screens like : "The site's security certificate is not trusted"
		 * "Proceed anyway" or "Back to safety" "Your connection is not private"
		 * "Advanced" "Reload"
		 * 
		 */

		// SSL certifications. This is how to bypass SSL certifications on sites that
		// prompt certification notices.

		// Desired capabilities =
		// general chrome profile
		DesiredCapabilities ch = DesiredCapabilities.chrome();

		ch.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		ch.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		/*
		 * you can also use : ch.acceptInsecureCerts();
		 */
		// Belows to your local browser
		ChromeOptions c = new ChromeOptions();
		c.merge(ch);

		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\eclipse\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(c);

		driver.get("...");
		driver.manage().window().maximize();// max browser window

		System.out.println("End Program");

	}

}