
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class S18_Lesson141_Usage_of_Groups_functionality_in_TestNG {
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
	 * Annotations Groups: 
	 * By using Groups this will allow a specific test case from different classes to be run on every build.
	 *  ie: Want to run 1 test from Class= Day 1 , 2 tests from Class= Day 2
	 *  
	 *  Use: 
	 *  @Test(groups={"Smoke"})
	 *  public void <name>()..
	 *  
	 *  Therefore any tags with the groups Smoke will be run 
	 *  
	 *  eg xml: 
	 *  
	 *  <?xml version="1.0" encoding="UTF-8"?>
				<!DOCTYPE suite SYSTEM "https://testng.org/testng-1.0.dtd">
				<suite name="Suite">
				
				// Here you define in your xml that you are going to run any classes with "Smoke" test tags.
				 
				  <groups> 								
					<test name="Smoke regression"/>
						<include name = "Smoke"/>
					</run>
				  </groups>
				  
				  
				  .
				  .
				  .
	
				</suite> 
	 * 
	 * 
	 * 
	 */
	
	@Test(groups={"Smoke"})
	public void SmokeTestTag() 
	{
		System.out.println("@Test(groups= {'Smoke'}) - This is a tagged test that you can define in the TestNG XML");
	}
	
	
	
	
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


