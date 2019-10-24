import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import javax.xml.crypto.dsig.keyinfo.KeyInfo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;



public class Assignment7_Web_Tables {

	public static void main(String[] args) throws InterruptedException, IOException {

		WebDriver driver;

		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\eclipse\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://qaclickacademy.com/practice.php");
		driver.manage().window().maximize();// max browser window
		driver.manage().deleteAllCookies();
		WebDriverWait w = new WebDriverWait(driver,5);
		Actions a = new Actions(driver); //defining new Actions class (you will need to import it as part of the Selenium libraries.
		/*
		 * In this Assignment : 
		 * 1. Navigate to QAclickAcademy / practice
		 * 2. Select any Checkbox Example and then grab the label of the selected checkbox // put the label in a vaiable. // do not hard code text. drive it
		 *   dynamically for subsequent steps.
		 * 3. Go to the Dropdown and select the dropdown to match the selected checkbox from step 1. 
		 * 4. Go the Swith To Alert Example and Enter the variablized text in the edit box. 
		 * 5. Click on the Alert and then verify if text present grabed from step 2 is present in the popup message. 
		 * 
		 * Note: you should not hard code any parts during this assignment. 
		 * 		 * 
		 * info@clickacademy.com -  for email questions. 
		 * 
		 */
		
		//2. click on Opiton 2 and store the lable in a variable. 
		driver.findElement(By.xpath("//div[@id='checkbox-example']//label[2]")).click();
		String checkbox = driver.findElement(By.xpath("//div[@id='checkbox-example']//label[2]")).getText();
		String Label = checkbox.toLowerCase(); // making checkbox to all lower case to support step 3
		System.out.println(Label);
		System.out.println(checkbox);
		//3.
		Select s= new Select(driver.findElement(By.xpath("//select[@id='dropdown-class-example']"))); //calling Select Method on dropdown
		s.selectByValue(Label); /* select the dropdown option from step 2. 
		NOTE: THIS IS CASE SENSITIVE. However if you use s.selectByVisibleText(arg0); then it is not case senstive */
		
		//4 
		driver.findElement(By.cssSelector("#name")).sendKeys(Label);
		
		
		//5. 
		driver.findElement(By.cssSelector("#alertbtn")).click(); // click on the Alert
		
		String alert = driver.switchTo().alert().getText();
		
		System.out.println(alert); // print out alert
		
		if (alert.contains(Label))
		{
			System.out.println("Alert message success");
		}
		else
		System.out.println("Alert message failed");
		
		
		/* Instructor Solution: 
		 * 
		 * 		driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[2]/input")).click();

        String opt=driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[2]")).getText();

        WebElement dropdown=driver.findElement(By.id("dropdown-class-example"));

        Select s=new Select(dropdown);

        s.selectByVisibleText(opt);

        driver.findElement(By.name("enter-name")).sendKeys(opt);

        driver.findElement(By.id("alertbtn")).click();

		String text=  driver.switchTo().alert().getText();

		if(text.contains(opt))

			{

			System.out.println("Alert message success");

			}

		else

		System.out.println("Something wrong with execution");
		 * 
		 */
		
		/*
		 * Here is a Student example where he selected Option 3 but the code does not assume option 3 is selected. Instead a loop was created
		 * where it goes to find which one is selected and then goes to grab the text. 
		 * 
		 * driver.findElement(By.id("checkBoxOption3")).click();

			List<WebElement> options=driver.findElements(By.cssSelector("input['type=checkbox']"));
			
			for(inti=0;i<options.size();i++)
			
			{
			
			if(options.get(i).isSelected())
			
			{
			
			String selected=options.get(i).getText();
			
			Select s=new select(driver.findElement(By.id("dropdown-class-example")));
			
			s.SelectByIndex(i);
			
			driver.findElement(By.id("name")).sendKeys(selected);
			
			driver.findElement(By.id("alertbtn")).click();
			
			String alertText=driver.switchTo().alert().getText();
			
			Assert.assertTrue(alertText.contains(selected));

		 * 
		 */
		
		
		
		
		System.out.println("END PROGRAM");	
		}


	
}
		
		
	
	
	
