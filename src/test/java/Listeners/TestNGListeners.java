package Listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNGListeners implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("**************** Test is Started :"+result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("**************** Test is Successful :"+result.getName());
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("**************** Test failed :"+result.getName());	
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("**************** Test Skipped :"+result.getName());
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {

	}

	@Override
	public void onStart(ITestContext context) {
			}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("**************** Tests is Completed :"+context.getName());
	}

}
