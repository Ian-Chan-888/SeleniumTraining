
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class S18_Lesson145_DataProvider_Annotation_Parameterizing_Testcases_2 {
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

	 * 		**********************************************************************		
	 * 
	 * Data Provider Annotation: (continued in Lesson 145)
	 * @DataProvider    import org.testng.annotations.DataProvider;
	 *  -this allows you to have several defined datatypes without having to run mulitple test cases. 
	 *  - In this example lets have 3 datatypes.
	 *    		//1st datatype =  combination - username password - good credit history
	 *			//2nd datatype =  username password - no credit
	 *			//3rd datatype =  fraudelent credit history
	 *
	 *
	 *  
	 */
	

	
	//import org.testng.annotations.DataProvider;
	@DataProvider
	public Object[][] getData() { 
		//1st datatype =  combination - username; password - good credit history
		//2nd datatype =  username; password - no credit
		//3rd datatype =  fraudelent credit history username; password
		
		//1st data set
		Object[][] data = new Object[3][2]; //defining an array with 3 rows with 2 columns as in 3 data types with max 2 values in the columns which are: username; password.
		data[0][0] = "1stsetusernam";
		data[0][1] = "1stpassword";
		// data[row number] [column number]
		//columns in the row are nothing but values for that particular combination(row)
		
		//2nd set
		// data[row number] [column number]
		data[1][0] = "2ndsetusernam";
		data[1][1] = "2ndpassword";
		
		//3nd set
		// data[row number] [column number]
		data[2][0] = "3rdsetusernam";
		data[2][1] = "3rdpassword";
		
		return data;

	}
	
	@Test(dataProvider = "getData") //this will run for each data set. i.e 3 times. 
	public void Lesson145_Test1(String username, String password) { //since getData has 2 values 'username' and 'password' you need to add 2 strings (String username, String password)
		System.out.println(username);
		System.out.println(password);
		

	}


	
	}


