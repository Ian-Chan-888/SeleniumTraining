
import org.testng.annotations.Test;

public class S18_Lesson136_Prioritizing_the_Testcases_with_TestNG {
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
	 * 
	 * 
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
