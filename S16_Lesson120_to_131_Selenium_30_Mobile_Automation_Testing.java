

import java.io.File;
import java.io.IOException;
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


public class S16_Lesson120_to_131_Selenium_30_Mobile_Automation_Testing {

	
	
	

	public static void main(String[] args) throws InterruptedException, IOException {


		/*
		 * 1. Download java and set Java_Home in environmental variables
		 *   - Right click on "My PC" and left click on Properties
		 *   - Left click on "Advanced system settings" 
		 *   - Left click on "Environment Variables"...
		 *   
		 * 2. Download Android Studio from below link
		 * 
		 * 3. https://developer.android.com/studio/index.html
		 * 
		 * 4. Check Android installation path in Machine (i.e :D:\Android Studio) and run the application.
		 *   - When you run Anroid Studio for the first time it will download and install the Anroid SDK
		 *   
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
		 *    More Refernces : https://developer.android.com/studio/run/managing-avds?utm_source=android-studio
		 *    
		 * 7. Open Emulator and check if it is working. 
		 * 
		 * 8. Download Node.js (Lession 123)
		 *    - Node.js is a download shell that allows you to install Appium. 
		 *    - Download node.js
		 *    
		 * 9. https://nodejs.org/en/download/
		 *    - download and install node.js (C:\Program Files\Node..)
		 *    
		 * 10. Set Node_Home Environmental variables path
		 *    -Create Node_Home simular to Step 5. (i.e: C:\Program Files\Nodejs)
		 *    
		 * 11. Set npm Environmental variables path
		 *    -Create npm path (i.e: C:\Program Files\Nodejs\node_modules\npm\bin)
		 * 12. Download Appium Server module from Node
		 *    - in command line type : 'C:\Users\<username>\npm install -g appium'  (be paitent as this may take up to 10 mins)
		 *    - Type 'appium'
		 *         output: 
		 *     		[Appium] Welcome to Appium vX.X.X
		 *     		[Appium] Appium REST http interface listener started on 0.0.0.0.:4723
		 *     
		 *     (Lession 124)
		 *    - This will always install the latest stable version
		 *    - new versions change with changes to newest Android OS versions.
		 *    - however, if you wish to install a beta version you can type : 
		 *     npm install -g appium@beta --no-shrinkwrap 
		 *    - uninstall npm you can type : 'npm uninstall -g appium
		 *    		 *    
		 *    -Verifying the Installation

		 *     To verify that all of Appium's dependencies are met you can use appium-doctor. 
		 *     		Install it with npm install -g appium-doctor, then run the appium-doctor command, 
		 *          supplying the --ios or --android flags to verify that all of the dependencies are set up correctly.
		 *          
		 *      REFERENCE to APPIUM :http://appium.io/docs/en/about-appium/getting-started/     
		 *     
		 * 13. Downlad Appium Java client jars for frontEnd execution (Lesson 125)
		 *    -Navigate to : http://appium.io/downloads.html
		 *    - select "Java"
		 *    - click on the Download 'jar'
		 *    - save it to a known location your for your other jar files (i.e : program files\java)
		 *   
		 * 14. Install Eclipse - Create a Project in Eclipse - configure Appium libraries 
		 *   - once Selenium installed, add the resource to your project
		 *   	- Right click / Properties / Add Java Build Path / 'Add External JARs...'
		 *   	- choose the location of the jar file 'java-client-X.X.X.jar'
		 *      - 'Apply and close'
		 *   - Note: Selenium jars need to be added as well. See 'S02_Setup Java and Selenium'
		 *   
		 * Lesson 127-131: 
		 * 	What are Desired capabilities? How to talk to appium server
		 * 	a. Start your appium server. From starting the appium server we know " Appium REST http interface listener started on 0.0.0.0:4723"
		 *  b. Open emulator (AVD in Android Studio) eg: "Nexus_6_API_23"
		 *  c. ensure you have the proper classes defined. See S15 Lesson 116 DesirecCapabilities and Remote Webdriver
		 *  d. test your target APP. 'xyz APP' by envoking it. 
		 *  e. Connect your steps to the Server
		 *  f. then you can start coding. 
		 * 
		 * 
		 *
		 * info@clickacademy.com -  for email questions
		 */
		
		
		
		//*******NOTE : FOR THIS PROGRAM TO RUN APPIUM SERVER NEEDS TO BE RUNNING**********
		
		//import org.openqa.selenium.remote.DesiredCapabilities;
		DesiredCapabilities cap = new DesiredCapabilities();
		
		//targeting your virtual mobile device. IMPORTANT this device needs to be online from Android Stuido.
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Nexus6");
		
		
		/*target the application to test on and invoking it. 
		 *  - in this example we will download a apk application from appium called 'ApiDemos-debug.apk' and add it to the project
		 *  https://github.com/appium/java-client/blob/master/src/test/java/io/appium/java_client/ApiDemos-debug.apk
		 *  - download and then drag and drop the ApiDemos-debug.apk into the '(default package) section in this selenium project
		 *  
		 */
		File f = new File("src");//definding files in 'src' location
		File fs = new File(f,"ApiDemos-debug.apk"); //storing location of file as 'fs'
				
		cap.setCapability(MobileCapabilityType.APP,fs.getAbsolutePath() ); //best way of handling APP file location handling. 
		
		/*connection to the server. You need to invoke an android class.
		 *  below step  connects and invokes 
		 *  import io.appium.java_client.android.AndroidDriver;
		 *  import io.appium.java_client.android.AndroidElement;
		 *  import java.net.URL;
		 *  After running you; the appium server logs (console) should show exit 200. which means success of the execution step.
		 *  
		 */
		AndroidDriver<AndroidElement> driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"),cap); //127.0.0.1:4723 is the default local host address. port 4723 is from appium server start sequence.
		//once the test is completed the Appium server session will close within 60 secs. If you want to manually close the session you can 'CNTRL-C' to close the Appium server and then restart 
		
	
		/*
		 * Using a tool to find the object elements withing a android application is used :
		 * 
		 *  -it is called 'uiautomatorviewer.bat'
		 * 
		 *  It should be installed when you installed Android Studio
		 * 	-default location should be: C:\Users\<user>\AppData\Local\Android\sdk\tools\bin
		 *  - in my case it is located here: D:\AndroidStudioSDK_files\tools\bin
		 *  - Open your Emulator
		 *  - double clcik this bat. To open the UI Automator Viewer
		 *  	- click on the 'Device Screenshot (UI automator Dump)'
		 *  	- A screen shot of your Android screen should appear in the viewer.
		 *  	- each element in the screen shot will be described in the UI automatorviewer.
		 *  	- as well Node Detail will be viewed for each element you highlight/click on. 
		 *  i.e: 
		 *  With the API Demos apk the "APP" element details are as follows in the "Node Detail" section: 
		 *  index		2
		 *  text		App
		 *  resource-id	android:id/text1
		 *  class		android.widget.TextView
		 *  			.
		 *  			. ..etc
		 *  
		 *  
		 *  
		 *  
		 * 
		 */
		
		
		
		// WE WILL WRAP THIS CODE UP IN ITS OWN FUNCTION AND WE WILL CALL IT 'Capabilities'
		

}

}