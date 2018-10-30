package common;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.IInvokedMethod;
import org.testng.ITestNGMethod;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.assertthat.selenium_shutterbug.core.Shutterbug;
import com.assertthat.selenium_shutterbug.utils.web.ScrollStrategy;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class BaseTest {
	public static ExtentHtmlReporter htmlreport;
	public static ExtentReports extent;
	public static ExtentTest logger;
	
	@BeforeSuite
	public void reportInitiliaze() {
		htmlreport = new ExtentHtmlReporter("./reports/test.html");
		htmlreport.config().setDocumentTitle("Groupon Regression Testing");
		htmlreport.config().setReportName("[GROUPON]");
		extent = new ExtentReports();
		extent.attachReporter(htmlreport);
		
	}

	
	@BeforeMethod
	public void beforeMethod(Method method){
		//
	}
	
	@AfterMethod
	public void afterMethod(){
		extent.flush();
	}
	
	
/*	@BeforeTest
	public void startApplication() {
		 wd.setDriver();
		 driver = wd.getDriver();
		//driver = WebDriverInstance.getDriver();
		
		driver.get("https://www.calculator.net/loan-calculator.html");
	}*/

/*	@AfterTest
	public void testDown() {
		driver.quit();
		System.out.println("Browser closed");
	}*/

	public void captureScreenshot(ExtentTest logger,WebDriver driver,String name) throws IOException{
		//Shutterbug.shootPage(driver).withName(name).save("Z:\\workspace\\Demo\\reports");
		Shutterbug.shootPage(driver, ScrollStrategy.BOTH_DIRECTIONS, 100, true).withName(name).save("Z:\\workspace\\Demo\\reports");
		//snapshot.save("C:/AutomationProjects/screens/");
	    logger.addScreenCaptureFromPath("Z:\\workspace\\Demo\\reports\\"+name+".png");
	
	}
	
}
