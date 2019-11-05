

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


public class S16_Lesson131_Continued_A {

	/*
	 * 
	 * info@clickacademy.com -  for email questions
	 */
	
		

	public static AndroidDriver<AndroidElement> Capabilities() throws MalformedURLException{
	
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Nexus6");
		File f = new File("src");//definding files in 'src' location
		File fs = new File(f,"ApiDemos-debug.apk"); //storing location of file as 'fs'
		cap.setCapability(MobileCapabilityType.APP,fs.getAbsolutePath() ); //best way of handling APP file location handling. 
		AndroidDriver<AndroidElement> driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
		return driver; 
		
		//AndroidUIAutomator
		
		
		
		
		

}

}