


import org.testng.annotations.Test;





	/*
	 * In this lesson we will look at Frameworks: 
	 * What is Framework?
	 * 	- A testing framework or more specifically a testing automation framework is an. execution environment for automated tests. It is the overall system in which tests will be automated.
	 * 	- 
	 *  
	 *  Technologies			Description														Example scenario
	 *  ------------			------------													----------------
	 *  Phase 1:
	 *  TestNG-					Unit Testing framework											run 400 tests 200 run as smoke
	 *  Data Driven Testing		Best Practices to drive data from external resources
	 *  Maven					Build Management Tool
	 *  Jenkins					Continuous Integration 
	 *  Reports					Reports for Framwork  tests
	 *  Log 4j					Logging framework generates Logs
	 *  Page object Mechanism	Design Patterns for tests development
	 *  
	 *  Phase 2:
	 *  Framework Building		Develop Robust Selenium framework from scratch 
	 *   real time project		by integrating all the componenets of framework and
	 * 							run selenium tests
	 * *****************************************************************************************************************************************************************************************
	 * Test NG Tutorial
	 * 
	 * Importance of TestNG
	 * Installation and configuration in Eclipse (https://testng.org/doc/download.html)
	 * Testing XML file Importance
	 * Controlling Testcase exceutions from Testing XML files
	 * Include Exclude Mechanisim
	 * Understanding TestNG Annoations
	 * Groups
	 * Data Provider Annotation
	 * Annotation helper Attributes
	 * 
	 *
	 * 
	 * 
	 * 
	 * info@clickacademy.com -  for email questions
	 */
	
		public class S18_Lesson134_Running_Test_Cases_in_TestNG_with_out_java_compiler { 
			
			@Test   // import org.testng.annotations.Test; By doing this you do not have to rely on Java compliler as TestNg has its own.
			public void Demo()
			{
				System.out.println("Hello"); // automation
			}
		
		
		
		}
				
	

