import java.io.File;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.commons.io.FileUtils;
import com.google.common.io.Files;


public class S02_Setup_Java_and_Selenium {

	public static void main(String[] args) throws InterruptedException, IOException {

		WebDriver driver;

		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\eclipse\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().window().maximize();// max browser window
		driver.manage().deleteAllCookies();

		/*
		 * Section 2 Java and Selenium instation.

			1. Java instalation (Lesson 8): java jdk download -- https://www.oracle.com/technetwork/java/javase/downloads/index.html
			   - install your Java (from Java.com) and Java jdk
			2. Configure Java Path and system variables.
			   - you need to point Selenium where Java is located.
			    - Control Pannel
					-Control Panel\System and Security\System
						-Select Advanced system settings (right hand side)
						- In the System Properties window click on "Envoronmnet Variables"
								- Under the System variables section click on the "New"
								- set Variable Name = JAVA_HOME
								- set Variable value = the location of the Java JDK i.e: C:\Program Files\Java\jdk-12.0.1
								- copy the path of the bin directory i.e: C:\Program Files\Java\jdk-12.0.1\bin
								- in the System variables find the Variable called "Path" and click on the Edit. 
								- in the 'Edit environment variable' window click on "New"
								- paste the location of the bin directory and press OK and then OK again.
								- Check Java is running in the cmd type "java -version"
								  output example: 
								  
								  C:\Users\ION64-2017>java -version
									java version "1.8.0_231"
									Java(TM) SE Runtime Environment (build 1.8.0_231-b11)
									Java HotSpot(TM) Client VM (build 25.231-b11, mixed mode, sharing)
								
			3 Eclipse Instation (Lesson 11)
			   - Download Newest version of Eclipse IDE for Java Developers
			   https://www.eclipse.org/downloads/packages/release/2019-09/r/eclipse-ide-java-developers
			   
			4. Create a new Eclipse Project (Lesson 12)
			   - First Project is Test Suite - Selenium API in java 
			   - language (Java class file -Testase)
			
			5. Downloading and configuring Selenium (Lesson 14)
   
   			6. ...
   			
   			7. ...
   			
   			8.
   			
   			9.
   			
   			10. 
   			
   			
		 * 
		 *
		 * info@clickacademy.com -  for email questions
		 */
		
		

		System.out.println("END PROGRAM");

		// driver.close();

	}
	
	
	
	
	
}