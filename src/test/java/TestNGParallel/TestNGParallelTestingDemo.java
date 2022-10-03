package TestNGParallel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class TestNGParallelTestingDemo {

//	WebDriver driver=null;
	
	@Test
	public void test1() throws Exception {
		
		System.out.println("I am inside Test 1|"+Thread.currentThread().getId());
		
		
//		System.setProperty("webdriver.edge.driver", "C:\\Webdrivers\\edgedriver_win64\\Driver_Notes\\msedgedriver.exe");
//		driver = new EdgeDriver();
//		driver.get("https://www.google.co.in/");
//		Thread.sleep(3000);
//		driver.close();
		
	}
	@Test
	public void test2() throws Exception {
		
		System.out.println("I am inside Test 2|"+Thread.currentThread().getId());
		
//    	System.setProperty("webdriver.edge.driver", "C:\\Webdrivers\\edgedriver_win64\\Driver_Notes\\msedgedriver.exe");
//		driver = new EdgeDriver();
//		driver.get("http://seleniumhq.org");
//		Thread.sleep(3000);
//		driver.close();
		
			}
	@Test
public void test3() throws Exception {
		
		System.out.println("I am inside Test 3|"+Thread.currentThread().getId());
	
	}
		
	}
	
	
	

