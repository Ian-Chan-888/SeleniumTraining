

import java.io.IOException;
import java.net.URL;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;


public class S16_Lesson120_121_122_Selenium_30_Mobile_Automation_Testing {

	
	
	

	public static void main(String[] args) throws InterruptedException, IOException {

		WebDriver driver;

		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\eclipse\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().window().maximize();// max browser window
		driver.manage().deleteAllCookies();

		/*
		 * 1. Download java and set Java_Home in environmental variables
		 *   - Right click on "My PC" and left click on Properties
		 *   - Left click on "Advanced system settings" 
		 *   - Left click on "Environment Variables"...
		 * 2. Download Android Studio from below link
		 * 3. https://developer.android.com/studio/index.html
		 * 4. Check Android installation path in Machine (i.e :D:\Android Studio) and run the application.
		 *   - When you run Anroid Studio for the first time it will download and install the Anroid SDK
		 * 5. Set Android_Home Environmental variables path to SDK location:
		 *   - it should be located in C:\Users\<username>\AppData\Local\Android\sdk
		 *   - Go to Environmental variables again (see step 1) and 
		 *    a. In the System Variables window click on 'New..."
		 *    b. Variable Name = 'ANDROID_HOME'
		 *    c. Variable value = 'C:\Users\<username>\AppData\Local\Android\sdk'
		 *    d. in the Same System Variables window find the 'Path' entry, click on Edit. 
		 *    e. Click on New then paste at the bottom 'C:\Users\<username>\AppData\Local\Android\Sdk\tools\bin'
		 *    f. Click on New again and paste at the bottom = 'C:\Users\<username>\AppData\Local\Android\Sdk\tools'
		 *    g. Optionally: Click on New again and paste at the bottom = 'C:\Users\<username>\AppData\Local\Android\Sdk\platform-tools'
		 *    
		 * 6. Open Android Studio and configure Virtual device/emulator. (122)
		 *   - Open Android Studio and start a new project, naming as required.
		 *   - Click on Help\Find Action and look for 'ADV Manager' and open it. 
		 *   - Click on "Create Virtual Device" if you have not previously added a virtual device. 
		 *   - Select a mobile that you whish to test on. 
		 *   - Choose the Android version you wish to test on and download it if needed. Then choose the Image and press Next.
		 *   - Choose your orientation 
		 *   - configure other options as needed. i.e Emulated Performance, Device Frame ... etc
		 *   - Note the Advance Settings give you further configurations. 
		 *   - Click on Finish
		 *   - Start by clicking on the play button "Launch this ADV in the Emulator". warning this might be slow depending on your resources.
		 *   - Alternatively you can start your device from command prompt. 
		 *     - navigate to your sdk\platform-tools folder
		 *     - to list the machines available type :  emulator -list-avds
		 *     - type : emulator -avd <name of device>
		 *  
		 * 7. Open Emulator and check if it is working. 
		 * 8. Download Node.js
		 * 9. https://nodejs.org/en/download/
		 * 10. Set Node_Home Environmental variables path
		 * 11. Set npm Environmental variables path
		 * 12. Download Appium Server from Node
		 * 13. Downlad Appium Java client library
		 * 14. Install Eclipse - Create a Project in Eclipse - configure Appium libraries
		 * 15. Start Appium Server- 
		 * 
		 * 
		 *
		 * info@clickacademy.com -  for email questions
		 */
		
				
			System.out.println("End Program");
			driver.close();
}

}