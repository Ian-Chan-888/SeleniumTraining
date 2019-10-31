

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class S15_Lesson113_114_115_Intro_to_Selenium_Grid {

	
	
	

	public static void main(String[] args) throws InterruptedException, IOException {

	
	
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\eclipse\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();//max browser window
		driver.manage().deleteAllCookies();//deletes all the cookies in the browser

		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		
		/*
		 * Selenium Grid: 
		 * Selenium - Grid allows you to run your tests on a different machine against different browsers
		 *  - Supports distributed test execution
		 *  - you and also run the tests in paraallel in multiple machines on Sleneium Grid
		 *     -thus reduces test executing time.
		 *  - The concepth of a HUB is created to help coordinate testing.
		 *   - one of the things the HUB can do is to help idenify systems that have specific configurations i.e OS..IE9, IE11, Chorme...etc
		 *  - Nodes represent the test systems.
		 *  
		 *  How to Implement Selenium Grid: 
		 *  1. Download 'Selenium Standalone Server' jar file
		 *    = www.seleniumhq.org/download
		 *  2. Define what machine will be your Selenium HUB
		 *     - Using the command Prompt, navigate to the location where you are storing your Selenium Standalone Server.jar (D:\Selenium Hub)
		 *     - Type 'java -jar selenium-server-standalone-3.141.59.jar - role hub'
		 *     output: 
		 *            D:\Selenium Hub>java -jar selenium-server-standalone-3.141.59.jar -role hub
					16:36:29.073 INFO [GridLauncherV3.parse] - Selenium server version: 3.141.59, revision: e82be7d358
					16:36:29.239 INFO [GridLauncherV3.lambda$buildLaunchers$5] - Launching Selenium Grid hub on port 4444
					2019-10-30 16:36:29.662:INFO::main: Logging initialized @1134ms to org.seleniumhq.jetty9.util.log.StdErrLog
					16:36:30.120 INFO [Hub.start] - Selenium Grid hub is up and running
					16:36:30.120 INFO [Hub.start] - Nodes should register to http://192.168.1.188:4444/grid/register/
					16:36:30.120 INFO [Hub.start] - Clients should connect to http://192.168.1.188:4444/wd/hub
		 *     
		 *    3. Register your Nodes and ensure it is registered to the address noted above. : http://192.168.1.188:4444/grid/register/
		 *       - download and insatll both Java and java jdk to the node machine. 
		 *       - ensure that the jdk is configured properly in the System properties. (see S02 Setup Java and Selenium)
		 *       - From the Node machine that is network accessable to the HUB; Download the Selenium Stand alone server on the node machine as well. 
		 *       - then invoke the jar by typing : 'java -jar selenium-server-standalone-3.141.59.jar - role webdriver -hub 192.168.1.188:4444/grid/register/ -port 5566'
		 *     output: 
		 *     		C:\Selenium>java -jar selenium-server-standalone-3.141.59.jar -role webdriver -hub http://192.168.1.188:4444/grid/register/ -port 5566
					16:28:24.324 INFO [GridLauncherV3.parse] - Selenium server version: 3.141.59, revision: e82be7d358
					16:28:24.574 INFO [GridLauncherV3.lambda$buildLaunchers$7] - Launching a Selenium Grid node on port 5566
					2019-10-30 16:28:25.277:INFO::main: Logging initialized @1527ms to org.seleniumhq.jetty9.util.log.StdErrLog
					16:28:25.808 INFO [WebDriverServlet.<init>] - Initialising WebDriverServlet
					16:28:26.059 INFO [SeleniumServer.boot] - Selenium Server is up and running on port 5566
					16:28:26.059 INFO [GridLauncherV3.lambda$buildLaunchers$7] - Selenium Grid node is up and ready to register to the hub
					16:28:26.278 INFO [SelfRegisteringRemote$1.run] - Starting auto registration thread. Will try to register every 5000 ms.
					16:28:28.763 INFO [SelfRegisteringRemote.registerToHub] - Registering the node to the hub: http://192.168.1.188:4444/grid/register
					16:28:29.076 INFO [SelfRegisteringRemote.registerToHub] - The node is registered to the hub and ready to use
					
				  - NOTE : The Server web client can view the status of nodes. This can be access when typing the url : http://192.168.1.188:4444/grid/console OR localhost:4444/grid/console
		 *     			-this can let you know how many instances of browsers you can allocate tests to. 
		 *     
		 *     4. To ensure your Nodes have the proper drivers i.e : 'Chormedriver.exe; geckodriver.exe downloaded. (NOTE: YOU CAN SHUT DOWN THE NODE SERVER SERVICE BY PRESSING 'CNTRL-C')
		 *        - Then the driver you want to use is defined when you first spin up the Selenium node command(eg):
		 *           java -Dwebdriver.chrome.driver=C:\Selenium\chromedriver.exe -jar selenium-server-standalone-3.141.59.jar -role webdriver -hub http://192.168.1.188:4444/grid/register/ -port 5566
		 *      output: 
		 *      	C:\Selenium>java -Dwebdriver.chrome.driver=C:\Selenium\chromedriver.exe -jar selenium-server-standalone-3.141.59.jar -role webdriver -hub http://192.168.1.188:4444/grid/register/ -port 5566
					16:43:04.880 INFO [GridLauncherV3.parse] - Selenium server version: 3.141.59, revision: e82be7d358
					16:43:05.068 INFO [GridLauncherV3.lambda$buildLaunchers$7] - Launching a Selenium Grid node on port 5566
					2019-10-30 16:43:05.443:INFO::main: Logging initialized @975ms to org.seleniumhq.jetty9.util.log.StdErrLog
					16:43:05.834 INFO [WebDriverServlet.<init>] - Initialising WebDriverServlet
					16:43:06.021 INFO [SeleniumServer.boot] - Selenium Server is up and running on port 5566
					16:43:06.021 INFO [GridLauncherV3.lambda$buildLaunchers$7] - Selenium Grid node is up and ready to register to the hub
					16:43:06.130 INFO [SelfRegisteringRemote$1.run] - Starting auto registration thread. Will try to register every 5000 ms.
					16:43:06.662 INFO [SelfRegisteringRemote.registerToHub] - Registering the node to the hub: http://192.168.1.188:4444/grid/register
					16:43:06.833 INFO [SelfRegisteringRemote.registerToHub] - The node is registered to the hub and ready to use     
		 *        
		 *        
		 *        
		 *        
		 *     
		 *     
		 */  
	
	
		

		
		
				
				
			System.out.println("End Program");
			
}

}