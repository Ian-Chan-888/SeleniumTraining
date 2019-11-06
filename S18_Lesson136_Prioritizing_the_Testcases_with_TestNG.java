
import org.testng.annotations.Test;

public class S18_Lesson136_Prioritizing_the_Testcases_with_TestNG {
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
	 * 
	 * You can control which tests to run by removing or adding the names of the tests. and classes within the tests in the xml : 
	 * for the next examples view the tests in the 'test' project
	 * 
	 * <?xml version="1.0" encoding="UTF-8"?>
			<!DOCTYPE suite SYSTEM "https://testng.org/testng-1.0.dtd">
			<suite name="Suite">
			  <test thread-count="5" name="Test">
			    <classes>
			      <class name="test.day3"/>
			      <class name="test.day2"/>
			      <class name="test.day4"/>
			      <class name="test.day1"/>
			    </classes>
			  </test> <!-- Test -->
			</suite> <!-- Suite -->

	 * 
	 * - This xml example from the 'test' project you can see that the suite will run 9 test cases 
	 *   [RemoteTestNG] detected TestNG version 7.0.0
						Day 3 (test1)
						Day 3 (test2)
						Day 3 (test3)
						Day2 (test1)
						Day2 (test2)
						Day 4 (test1)
						Day 4 (test2)
						Day 4 (test3)
						Day1 (test1)
						
						===============================================
						Suite
						Total tests run: 9, Passes: 9, Failures: 0, Skips: 0
						===============================================
	 * 
	 */

	@Test 
	public void WebloginCarLoan() {

		//add some code here
		System.out.println("WebloginCarLoan");
	}

	@Test 
	public void MobileLogincarLoan() {

		//Appium code 
		System.out.println("MobileLogincarLoan");
	}
	
	@Test 
	public void LoginAPIcarLoan() {

		//REST API code 
		System.out.println("LoginAPIcarLoan");
		
	}

}
