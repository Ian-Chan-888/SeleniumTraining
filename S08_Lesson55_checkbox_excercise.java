import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class S08_Lesson55_checkbox_excercise {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver;

		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\eclipse\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://qaclickacademy.com/practice.php"); // URL in the browser
		driver.manage().window().maximize();// max browser window

		// checkbox option 1
		driver.findElement(By.cssSelector("input[id='checkBoxOption1']")).click();

		Assert.assertTrue(driver.findElement(By.cssSelector("input[id='checkBoxOption1']")).isSelected());

		driver.findElement(By.cssSelector("input[id='checkBoxOption1']")).click();

		Assert.assertFalse(driver.findElement(By.cssSelector("input[id='checkBoxOption1']")).isSelected());

		// Count the number of checkboxes:
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());

		// Course answer Question 1:
		driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).click();

		Assert.assertTrue(driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).isSelected());

		driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).click();

		Assert.assertFalse(driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).isSelected());

		// Course anser Question 2:
		System.out.println(driver.findElements(By.cssSelector("[type='checkbox']")).size());

		System.out.println("END PROGRAM");

		// driver.close();

	}
}