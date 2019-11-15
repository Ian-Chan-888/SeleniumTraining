
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class S18_Lesson143_Paramerterising_from_TestNG_xml_file {
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
	 * 	Parameterising From TestNG witing the XML file
	 * - useful for global variable specifications. 
	 * - add them after the suites or within the test locations. 
	 * 
	 * eg: driving most common parameters in XML
	 * 
			**********************************************************************					

			<?xml version="1.0" encoding="UTF-8"?>
				<!DOCTYPE suite SYSTEM "https://testng.org/testng-1.0.dtd">
				<suite name="Suite">
				<parameter name="URL_Global" value = "Suite_Level_Parameter.com"/> 
				
				  <test thread-count="5" name="Test1">
				   <parameter name = "URL_test" value ="test_level_url.com"/>
				    <classes>
				      <class name=".S18_Lesson136_day1"/>
				      <class name=".S18_Lesson136_day2"/>
				    </classes>
				  </test> <!-- Test -->
				</suite> <!-- Suite -->
							.
							.
							.
				
				<test thread-count="5" name="Test2">
				   <parameter name = "URL_test2" value ="test_level2_url.com"/>
				    <classes>
				      <class name="class_name2"/>
				      <class name="calss_name4"/>
				    </classes>
				  </test> <!-- Test -->
				</suite> <!-- Suite -->	

	 * 
	 * 
	 * 
	 *  
	 */
	
	//import org.testng.annotations.Parameters;
	@Parameters({"URL_test"})
	@Test
	public void Parameter_example(String urlname) {
		System.out.println("This test should be able to port in the Parameter of URL at the 'test' level");
		System.out.println("The URL specified is : " + urlname);
	}

	//import org.testng.annotations.Parameters;
	@Parameters({"URL_Global"})
	@Test
	public void Parameter_example2(String urlname) {
		System.out.println("This test should be able to port in the Parameter of URL at the 'Global/Suite' level - Day 1");
		System.out.println("The URL specified is : " + urlname);
	}


	@BeforeTest
	public void Test3() {
		System.out.println("@Test - This is Test3 method");
	}
	
	
	
	@Test
	public void Test1() {
		System.out.println("@Test - This is Test1 method");
	}
	
	@Test
	public void Test2() {
		System.out.println("@Test - This is Test2 method");
	}
	

	
	}


