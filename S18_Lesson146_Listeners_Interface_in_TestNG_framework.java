import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class S18_Lesson146_Listeners_Interface_in_TestNG_framework implements ITestListener {
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
	 *  What are Listeners? 
	 *  -Listeners is a way of specifiying what to do next if a particular method fails, skipped...etc
	 *  
	 *  
	 *  uses: ITestListner
	 *  import org.testng.ITestListener;
	 *  
	 *  Syntax at class level: 
	 *  
	 *  'public class <name> implements ITestListner{..}'
	 *  
	 *  
	 *  There needs to be a specification in the xml to determmin where this Listeners class is located.
	 *   i.e: 
	 *   
	 *   <listeners>
	 *   	<listener class-name= <class name>/>
	 *   </listeners>
	 *  
	 *  
	 *  
	 *  
	 *  
	 *  
	 */
	
				@Override
				public void onFinish(ITestContext context) {
					// TODO Auto-generated method stub
					ITestListener.super.onFinish(context);
					System.out.print("Testing finished");
				}
				
				@Override
				public void onStart(ITestContext context) {
					// TODO Auto-generated method stub
					ITestListener.super.onStart(context);
				}
				
				@Override
				public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
					// TODO Auto-generated method stub
					ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
				}
				
				@Override
				public void onTestFailedWithTimeout(ITestResult result) {
					// TODO Auto-generated method stub
					ITestListener.super.onTestFailedWithTimeout(result);
				}
				
				
				@Override
				public void onTestFailure(ITestResult result) {
					// TODO Auto-generated method stub
					ITestListener.super.onTestFailure(result);
				}
				
				
				@Override
				public void onTestSkipped(ITestResult result) {
					// TODO Auto-generated method stub
					ITestListener.super.onTestSkipped(result);
				}
				
				
				@Override
				public void onTestStart(ITestResult result) {
					// TODO Auto-generated method stub
					ITestListener.super.onTestStart(result);
				}
				
				
				@Override
				public void onTestSuccess(ITestResult result) {
					// TODO Auto-generated method stub
					ITestListener.super.onTestSuccess(result);
				}










	
	}


