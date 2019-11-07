
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class S18_Lesson139_TestNG_Annotations_part1 {
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
	 * Annotations Part 1: 
	 * 
	 * - import org.testng.annotations.BeforeTest;
	 * - this annotation will trigger the test first.
	 * 
	 * -import org.testng.annotations.AfterTest;
	 * -this will trigger the test last.
	 * 
	 * NOTE: The @BeforeTest and @AfterTest will be only effective within the scope of that Class. 
	 * 
	 * 
	 */
	
	@AfterTest
	public void lastTest() {
		System.out.println("This should execute last");
	}
	
	@Test
	public void fluf() {
		System.out.println("Ignore this code");
	}
	
	@BeforeTest
	public void executeThisFirst() {
		System.out.println("This should be run first");
	}
	
	}


