


import org.testng.annotations.Test;

	
		public class S18_Lesson135_Importance_of_xml_file_in_TestNG_configuration { 
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
			 * 	- Allows you to define and control a suite of tests within a project
			 * 	- configurations in xml can be used 
			 *  -right click on Project / TestNG / convert to TestNG
			 *    - this will create a test.xml which reads like this : 
			 *   
			 *      <?xml version="1.0" encoding="UTF-8"?>
					<!DOCTYPE suite SYSTEM "https://testng.org/testng-1.0.dtd">
					<suite name="Suite">
					  <test thread-count="5" name="Test">
					    <classes>
					      <class name=".S18_Lesson134_Running_Test_Cases_in_TestNG_with_out_java_compiler"/>
					      <class name=".S18_Lesson135_Importance_of_xml_file_in_TestNG_configuration"/>
					      <class name=".S18_Lesson133_Framework_Part_1_TestNG"/>
					    </classes>
					  </test> <!-- Test -->
					</suite> <!-- Suite -->
					
			 *	- By right clicking on the Testing.xml that is generated then choosing, 'open with../ General text editor' you can see the content above. 
			 *  - So above you can see that if your run this xml 'module' you can then define which classes to run that can be called by Right clicking within the xml and 'Run As / TestNG suite.'
			 *	
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
			 * 
			 * 
			 * 

			 * 'import org.testng.annotations.Test;'
			 * 'Add TestNG library'
			 * 
			 * One can define multiple test cases in the same class by annotating with @test followed by a method 
			 * 
			 * 
			 */
			
			@Test   //This is first test case
			public void firstTest() {
			
				System.out.println("First Test"); 
			}
			
			
			
			@Test //this is second test case
			public void secondTest() {
				System.out.println("Second Test"); 
			}
		
		}
				
	

