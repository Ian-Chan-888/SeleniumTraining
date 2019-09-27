import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByCssSelector;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Calendar_Handling {

	public static void main(String[] args) throws InterruptedException {

	
	
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\eclipse\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();



		driver.get("https://www.path2usa.com/travel-companions");
		//
		driver.findElement(By.xpath(".//*[@id='travel_date']")).click();

		//Navigate Month
		while(!driver.findElement(By.cssSelector("[class='datepicker-days'] [class='datepicker-switch']")).getText().contains("November"))
			{
				driver.findElement(By.cssSelector("[class='datepicker-days'] th[class='next']")).click();
			}

		//Navigate Day
		
		//Grab common attribute//Put into list and iterate
		int count=driver.findElements(By.className("day")).size();

			for(int i=0;i<count;i++)
				{
					String text=driver.findElements(By.className("day")).get(i).getText();
					if(text.equalsIgnoreCase("21"))
					{
						driver.findElements(By.className("day")).get(i).click();
						break;
}

}
}

}