
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class S18_Lesson133_Framework_Part_1_TestNG {

	/*
	 * In this lesson we will look at Frameworks: What is Framework? - A testing
	 * framework or more specifically a testing automation framework is an.
	 * execution environment for automated tests. It is the overall system in which
	 * tests will be automated. -
	 * 
	 * Technologies Description Example scenario ------------ ------------
	 * ---------------- Phase 1: TestNG- Unit Testing framework run 400 tests 200
	 * run as smoke Data Driven Testing Best Practices to drive data from external
	 * resources Maven Build Management Tool Jenkins Continuous Integration Reports
	 * Reports for Framwork tests Log 4j Logging framework generates Logs Page
	 * object Mechanism Design Patterns for tests development
	 * 
	 * Phase 2: Framework Building Develop Robust Selenium framework from scratch
	 * real time project by integrating all the componenets of framework and run
	 * selenium tests
	 * *****************************************************************************
	 * *****************************************************************************
	 * ******************************* Test NG Tutorial
	 * 
	 * Importance of TestNG Installation and configuration in Eclipse
	 * (https://testng.org/doc/download.html) Go to the heading : 'Install from
	 * update site' Select Help / Install New Software... Enter the update site URL
	 * in "Work with:" field: Update site for release: http://beust.com/eclipse. Or,
	 * Update site for beta: http://beust.com/eclipse-beta , use it if you want to
	 * experiment with the new features or verify the bug fixes, and please report
	 * back if you encounter any issues. Make sure the check box next to URL is
	 * checked and click Next. Eclipse will then guide you through the process. You
	 * can also install older versions of the plug-ins here. Note that the URL's on
	 * this page are update sites as well, not direct download links.
	 * 
	 * 
	 * Testing XML file Importance Controlling Testcase exceutions from Testing XML
	 * files Include Exclude Mechanisim Understanding TestNG Annoations Groups Data
	 * Provider Annotation Annotation helper Attributes
	 * 
	 *
	 * 
	 * 
	 * 
	 * info@clickacademy.com - for email questions
	 */

	@Test
	public void TestNG() throws MalformedURLException {

		WebDriver driver;

		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\eclipse\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().window().maximize();// max browser window
		driver.manage().deleteAllCookies();

		System.out.println("END PROGRAM");

		// driver.close();

	}

}