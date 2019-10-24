import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Generating_Customized_css {

	public static void main(String[] args) {

		//1. This lesson is to generate custom css from html attributes. When looking at a html: for the example in line 12.
			//<input type="email" class="inputtext" name="email" id="email" data-testid="royal_email">
		
				//"input" is referred to as the TagName
				//type,class, name, id, are examples of Attributes 
				//email,inputtext,email,royal_email are examples of values for the associated attributes. 
		
		//2. syntax for css = tagName[@attribute='value']
		
		//3. for the following html line "<input value="Log In" aria-label="Log In" data-testid="royal_login_button" type="submit" id="u_0_2">"
		//The css would be "input[@value='Log In']
		// to verify this is the correct xpath you can paste the following in the developer console of the page you are on: $x("//input[@value='Log In']")
		  // you can also replace the "input" tag with *, which will find any tags matching the attributes listed. i.e for //*[@value='Log In"]
		
		//4. One can also define an attribute value without knowing the full name of the value by using the '*' syntax. tagName[Attribute*='value'] 
		// i.e for <input name="username123"">
		// we can write -   input[name*='username']
	
	
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\eclipse\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.manage().window().maximize();//max browser window
		
		
		driver.get("http://rediff.com");//go to url
		// from the html line for "sign in" = <a href="https://mail.rediff.com/cgi-bin/login.cgi" title="Already a user? Sign in" class="signin" xpath="1" style="">Sign in</a>
		driver.findElement(By.cssSelector("a[title*='Sign in']")).click(); //this is an example of point 4 above where we find the Sign in button and click on it.
		// from the html line for login field: <input type="text" id="login1" maxlength="30" name="login" value="" style="" tabindex="1" xpath="1">
		driver.findElement(By.cssSelector("input[id*='log']")).sendKeys("Hello Jello");
		// from the html line for password field: <input type="password" id="password" name="passwd" value="" style="" tabindex="2" css="1">
		driver.findElement(By.cssSelector("input[id*='pass']")).sendKeys("This is the password field");
		// from the html line for "go": <input type="submit" name="proceed" value="Go" title="Sign in" tabindex="4">
		driver.findElement(By.cssSelector("input[type*='sub']")).click();
		
		System.out.println("Finished");
		
		
		
	}

}
