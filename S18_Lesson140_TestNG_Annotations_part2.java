
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class S18_Lesson140_TestNG_Annotations_part2 {
	/*
	 * In this lesson we will look at Frameworks: What is Framework? - A testing
	 * framework or more specifically a testing automation framework is an.
	 * execution environment for automated tests. It is the overall system in which
	 * tests will be automated. -
	 * 
	 * Technologies Description Example scenario ------------ ------------
	 * ---------------- 
	 * Phase 1: TestNG- Unit Testing framework run 400 tests 200
	 * run as smoke Data Driven Testing Best Practices to drive data from external
	 * resources Maven Build Management Tool Jenkins Continuous Integration Reports
	 * Reports for Framwork tests Log 4j Logging framework generates Logs Page
	 * object Mechanism Design Patterns for tests development
	 * 
	 * Phase 2: Framework Building Develop Robust Selenium framework from scratch
	 * real time project by integrating all the componenets of framework and run
	 * selenium tests
	 * *****************************************************************************
	 * *****************************************************************************
	 * ******************************* Test NG Tutorial
	 * 
	 * Annotations Part 2: 
	 * 
	 * 	@BeforeSuite annotation is another confirguration that allows you to run certain tests before the main test such as applying API keys,
	 * 	load data.
	 * 
	 *  @AfterSuite will be another configuration specification that allows you to control run scenarios. 
	 *  
	 *  @BeforeMethod annotation will specify what needs to be run before the methods are run. 
	 *  @AfterMethod annotation will specify what needs to be run After the methods are run.
	 *  	
	 *  @BeforeClass : This should execute First before executing any Methods
	 *  @AfterClass : This should execute after all Methods are executed 
	 * 
	 * 
	 * import org.testng.annotations.AfterClass;	 
	 * import org.testng.annotations.BeforeClass;
	 * import org.testng.annotations.BeforeSuite;
	 * import org.testng.annotations.AfterSuite;
	 * import org.testng.annotations.BeforeMethod
	 * import org.testng.annotations.AfterMethod;
	 * 
	 */
	
@BeforeClass
public void beforclass() {
System.out.println("@BeforeClass - This should execute First before executing any Methods");
	
}

@AfterClass
public void AfterClass() {
System.out.println("@AfterClass - This should execute after all Methods are executed");

}
	
	@AfterTest
	public void lastTest() {
		System.out.println("@AfterTest - This should execute last");
	}
	
	@Test
	public void Test1() {
		System.out.println("@Test - This is Test1 method");
	}
	
	@Test
	public void Test2() {
		System.out.println("@Test - This is Test2 method");
	}
	
	@BeforeTest
	public void executeThisFirst() {
		System.out.println("@BeforeTest - This should be run first, unless a @BeforeSuite is specified");
	}
	
	@BeforeSuite
	public void BeforeSuite() {
		System.out.println("@BeforeSuite - This should be run Before your test suite runs");
	}
	

	@AfterSuite
	public void AfterSuite() {
		System.out.println("@AfterSuite - This should be run After your test suite runs");
	}
	
	@BeforeMethod
	public void BeforeMethod() {
		System.out.println("@BeforeMethod - This should be run Before any Methods are run");
	}
	
	@AfterMethod
	public void AfterAfterMethod() {
		System.out.println("@AfterMethod - This should be run After any Methods are run");
	}
	
	}

