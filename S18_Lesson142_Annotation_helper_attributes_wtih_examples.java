
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class S18_Lesson142_Annotation_helper_attributes_wtih_examples {
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
	 * 	Note: All methods within the class will run by its name aplphabetically.
	 * 
	 *  Anootation : 
	 *  @Test(dependsOnMethods={"<method_name1>","<method_name2>,..."}
	 *   -this means that the method listed will run first before this test. 
	 *   
	 *  @Test(enabled=false) = TestNG will skip this test when set to false, else it will run if set to True. 
	 *   
	 *  @Test(timeOut=4000) = allows you to specify a timeout of 4 seconds before fail.
	 *  
	 */
	
	@Test(timeOut=2000)
	public void timeout2sec() {
		System.out.println("@Test timeOut2sec - This test will have a wait time of 2 sec if it is unresponsive");
	}

	
	@Test(enabled=false)
	public void testEnabled() {
		System.out.println("@Test enabled=false - This test will be skipped when set to false");
	}

	@BeforeTest
	public void Test3() {
		System.out.println("@Test - This is Test3 method");
	}
	
	@Test(dependsOnMethods={"Test1","Test2"})
	public void dependsOnMethods() {
		System.out.println("@Test(dependsOnMethods= {'Test1,Test2'}) - You will see this after Test 1 and Test 2 is run");
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


