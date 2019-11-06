
import org.testng.annotations.Test;

public class S18_Lesson135_Importance_of_xml_file_in_TestNG_configuration {
	/*
	 * In this lesson we will look at Frameworks: What is Framework? - A testing
	 * framework or more specifically a testing automation framework is an.
	 * execution environment for automated tests. It is the overall system in which
	 * tests will be automated. -
	 * 
	 * Technologies Description Example scenario ------------ ------------
	 * ---------------- Phase 1: TestNG- Unit Testing framework run 400 tests 200
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
	 * Importance of TestNG Installation and configuration in Eclipse
	 * (https://testng.org/doc/download.html) 
	 * 
	 * Testing XML file Importance - Allows
	 * you to define and control a suite of tests within a project - configurations
	 * in xml can be used -right click on Project / TestNG / convert to TestNG -
	 * this will create a test.xml which reads like this :
	 * 
	 * <?xml version="1.0" encoding="UTF-8"?>
		<!DOCTYPE suite SYSTEM "https://testng.org/testng-1.0.dtd">
		<suite name="Suite">
		  <test name="Test">
		    <classes>
		      <class name=".S18_Lesson136_Prioritizing_the_Testcases_with_TestNG"/>
		    </classes>
		  </test> <!-- Test -->
		</suite> <!-- Suite -->
	 * 
	 * 'import org.testng.annotations.Test;' 'Add TestNG library'
	 * 
	 * One can define multiple test cases in the same class by annotating with @test
	 * followed by a method
	 * 
	 * 
	 * XML RUNNING Stable on Selenium_Trining project. there seems to be a bug that
	 * Test ng xml not working on Introduction/defualt package. For a better example
	 * look at the 'test' project
	 * 
	 */

	@Test // This is first test case
	public void firstTest() {

		System.out.println("First Test");
	}

	@Test // this is second test case
	public void secondTest() {
		System.out.println("Second Test");
	}

}
