

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

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;


public class S16_Lesson131_Continued_B extends S16_Lesson131_Continued_A { //Note this inherits the prevoius class.

	/*
	 * This is an example of how to run appium , load a demo application (apk) and start a program. Moreover you will see that we have wrapped up the start up and 
	 * configuration section into a function called 'Capabilities', put the function into its own class (S16_Lesson131_Continued_B) and ensure it is inherited into the current
	 * class your working on. This makes for cleaner code. 
	 * 
	 * 
	 * 
	 * info@clickacademy.com -  for email questions
	 */
	
		

	public static void main(String[] args) throws MalformedURLException {
		
		AndroidDriver<AndroidElement> driver = Capabilities();	// this will load the Demo app and stop at the API Demos page 
	
		
				

}

}