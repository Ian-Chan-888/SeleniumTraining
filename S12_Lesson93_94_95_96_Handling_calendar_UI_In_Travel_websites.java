
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class S12_Lesson93_94_95_96_Handling_calendar_UI_In_Travel_websites {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\eclipse\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.path2usa.com/travel-companions");
		driver.manage().window().maximize();// max browser window
		/*
		 * Calendars in travel websites or simular, often will not have a unique
		 * identifier for the days.
		 * 
		 * 1. Lets target elements in the month and the day -Grab the common attribute
		 * and put into a list. Then iterate until the target day is found. -While loop
		 * will keep on executing until it becomes false. By using the '!' = Not
		 */

		// 1

		// Navigate Month

		// click on the "Date" field
		driver.findElement(By.xpath("//input[@id='travel_date']")).click(); // open the Date window

		// using Parent - Child element locating methods.
		while (!driver.findElement(By.cssSelector("[class='datepicker-days'] [class='datepicker-switch']")).getText()
				.contains("December")) // while NOT '!' Month then...
		{
			Thread.sleep(2000);
			driver.findElement(By.cssSelector("[class='datepicker-days'] [class='next']")).click(); // click on the next
																									// arrow
		}

		// Navigate to date

		@SuppressWarnings("unused")
		List<WebElement> dates = driver.findElements(By.className("day"));
		int count = driver.findElements(By.className("day")).size(); // counts the number of emlements with "day" as
																		// being the common attribute

		for (int i = 0; i < count; i++) {
			String text = driver.findElements(By.className("day")).get(i).getText();
			if (text.equalsIgnoreCase("23")) // looking for the 23rd day
			{
				driver.findElements(By.className("day")).get(i).click();// click on the index of day 23
				break;
			}

		}

		/*
		 * //Navigate Day
		 * 
		 * //Grab common attribute//Put into list and iterate int
		 * count=driver.findElements(By.cssSelector("div[class='dw-cal-day-fg']")).size(
		 * );//This counts the number of elements found
		 * 
		 * 
		 * for(int i=0;i<count;i++) {
		 * 
		 * String text; // To prevent stale emlement exception Line 95-100 using try
		 * catch with StaleElementReferenceException reference try { text =
		 * driver.findElements(By.cssSelector("div[class='dw-cal-day-fg']")).get(i).
		 * getText(); } catch (StaleElementReferenceException e) {
		 * 
		 * text =
		 * driver.findElements(By.cssSelector("div[class='dw-cal-day-fg']")).get(i).
		 * getText(); }
		 * 
		 * 
		 * if(text.equalsIgnoreCase("25")) {
		 * driver.findElements(By.cssSelector("div[class='dw-cal-day-fg']")).get(i).
		 * click(); break; }
		 * 
		 * 
		 * } //clicking on the submit button
		 * driver.findElement(By.xpath("//div[@id='desktop-submit']//div//input")).click
		 * (); driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); // wait
		 * for page to load.
		 * 
		 * 
		 * //Validating Origin location String origin;
		 * 
		 * try { // from lines 119 to 121 using try catch to elmiate state element
		 * exception origin =
		 * driver.findElement(By.cssSelector("strong[class='origin']")).getText(); }
		 * catch (StaleElementReferenceException e) { // TODO Auto-generated catch block
		 * origin =
		 * driver.findElement(By.cssSelector("strong[class='origin']")).getText(); }
		 * 
		 * 
		 * if (!origin.equalsIgnoreCase("Vancouver (YVR)")) {
		 * System.out.println("Origin of Vancouver (YVR) FAILED");
		 * System.out.println("Instead got " + origin); } else {
		 * System.out.println("Origin of Vancouver (YVR) PASSED");
		 * 
		 * }
		 * 
		 * 
		 * 
		 * //Validating destination location String destination;
		 * 
		 * destination =
		 * driver.findElement(By.cssSelector("strong[class='destination']")).getText();
		 * 
		 * 
		 * if (!destination.equalsIgnoreCase("London (Gatwick) (LGW)")) {
		 * System.out.println("Destination of London (Gatwick) (LGW) FAILED");
		 * System.out.println("Instead got " + destination); } else {
		 * System.out.println("Destination of London (Gatwick) (LGW) PASSED");
		 * 
		 * }
		 * 
		 * 
		 * 
		 * //Validating Start Date location String sdate;
		 * 
		 * sdate = driver.findElement(By.xpath(
		 * "//*[@id=\"main\"]/div[4]/div[1]/div/div/div[1]/div[2]/div/span/strong/span")
		 * ).getText();
		 * 
		 * if (!sdate.contains("Dec. 25")) {
		 * System.out.println("Start Date Validation FAILED: Expected Dec. 25");
		 * System.out.println("Instead got " + sdate); } else {
		 * System.out.println("Start Date Validation PASSED = " + sdate);
		 * 
		 * }
		 * 
		 * 
		 * //Validating Number of Audults String Adults;
		 * 
		 * Adults = driver.findElement(By.xpath(
		 * "//*[@id=\"main\"]/div[4]/div[1]/div/div/div[1]/div[3]/div/span[1]/strong")).
		 * getText();
		 * 
		 * 
		 * if (!Adults.contains("2")) {
		 * System.out.println("Number of Audults Validation FAILED Expected '2'");
		 * System.out.println("Instead got " + Adults); } else {
		 * System.out.println("Number of Audults Validation PASSED = " + Adults);
		 * 
		 * }
		 * 
		 * 
		 * //Validating Number of Children String Children;
		 * 
		 * Children = driver.findElement(By.xpath(
		 * "//*[@id=\"main\"]/div[4]/div[1]/div/div/div[1]/div[3]/div/span[2]/strong")).
		 * getText();
		 * 
		 * 
		 * if (!Children.contains("1")) {
		 * System.out.println("Number of Children Validation FAILED = " + Children); }
		 * else { System.out.println("Number of Children Validation PASSED= " +
		 * Children);
		 * 
		 * }
		 * 
		 */

		System.out.println("End Program");

	}

}