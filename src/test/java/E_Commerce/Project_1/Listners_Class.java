package E_Commerce.Project_1;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listners_Class implements ITestListener  {
	
	public void onTestStart(ITestResult result) {
		
		System.out.println("this method is triggered before every test execution is started.it is invoked before every test case execution");
		   
		  }

	public void onTestSuccess(ITestResult result) {
		System.out.println("this method is triggered when test execution is passed");
		  }
	 
	public void onTestFailure(ITestResult result) {
		System.out.println("this method is triggered when test execution is failed");
		  }
	 
	public void onTestSkipped(ITestResult result) {
		System.out.println("this method is triggered when test execution is skipped");
		  }
	 
	public void onStart(ITestContext context) {
		System.out.println("this method is triggered before every test execution is started.it is invoked only once");
		  }
	 
	public void onFinish(ITestContext context) {
		System.out.println("this method is triggered once all test execution is completed");
		  }

}
