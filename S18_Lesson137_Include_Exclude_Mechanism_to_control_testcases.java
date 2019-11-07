
import org.testng.annotations.Test;

public class S18_Lesson137_Include_Exclude_Mechanism_to_control_testcases {
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
	 * Lets now only run everything but 
	 * - Day 4 test 1
	 * - Day 4 test 2
	 * 
	 * How dow we do this? - We use the <methods> <exclude> or <include> tag
	 * 
	 * 
	 * <?xml version="1.0" encoding="UTF-8"?>
			<!DOCTYPE suite SYSTEM "https://testng.org/testng-1.0.dtd">
			<suite name="Suite">
			
			
			  <test name="Test">
			    <classes>
			      <class name=".S18_Lesson136_day1"/>
			      <class name=".S18_Lesson136_day3"/>
			      <class name=".S18_Lesson136_day2"/>
			    </classes> 
			  </test>    
			  
			  
			  <test name="Test4">  
			    <classes>  
			      
			      <class name=".S18_Lesson136_day4">
						<methods>
						 	<exclude name = "Day4_test2"/>
						 	<exclude name = "Day4_test1"/>
						</methods>
				  </class>  
				      
				</classes>	
			  </test>		
			  
			  //Optionally you can use:
			   *************************************************
			   *<test name="Test4">  						   *
			   * <classes>  								   *
			   *   											   *	
			   *  <class name=".S18_Lesson136_day4">           *
			   *		<methods>							   *	
			   *		 	<include name = "Day4_test3"/>	   *					 	
			   *		</methods>							   *
			   * </class>  									   *
			   *      										   *
			   *</classes>									   *
			   *************************************************
			      
			 
			  
			</suite> 

	 * 
	 * - RESULTING output: 
	 * 
	 *   [RemoteTestNG] detected TestNG version 7.0.0
			Day 3 (test1)
			Day 3 (test2)
			Day 3 (test3)
			Day2 (test1)
			Day2 (test2)
			Day1 (test1)
			Day 4 (test3)
			
			===============================================
			Suite
			Total tests run: 7, Passes: 7, Failures: 0, Skips: 0
			===============================================
	 *
	 *
	 *
	 *
	 *	
	 *
	 *
	 *
	 */
	@Test
	public void fluf() {
		System.out.println("Ignore this code");
	}
		
	}


