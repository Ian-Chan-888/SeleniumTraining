
import org.testng.annotations.Test;

public class S18_Lesson138_Executing_the_Testcases_at_Package_level_with_regex {
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
	 * Notion 1: You can run test in various different leveles: 
	 * <packages>, <Class>, <methods>. and they can be difined within the xml. 
	 * 
	 * Notion 2: Using Wildcards such as '.*', you can specify tests that starts with simular keyword names.
	 *  - The syntax would be <... name = "keyword.*"
	 *  i.e 
	 *  	<classes>
	 *  		<class name = ".S18.*"> // this will run all classes starting with the keyword S18 in its title i.e : 'public class S18_lessons1()..'
	 *  
	 *  ********************************************************************
	 *  	<packages>
			   		<package name= "test.*"/>
			</packages	
	 *  
	 *  ********************************************************************
	 *  
	 *  	<class name=".S18_Lesson136_day4">
						<methods>
						 	<exclude name = "Day4_.*"/>
						 </methods>
				  </class>  
	 *  
	 * 
	 */
	@Test
	public void fluf() {
		System.out.println("Ignore this code");
	}
		
	}


