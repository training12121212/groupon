package tests;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.assertthat.selenium_shutterbug.core.Shutterbug;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.MediaEntityModelProvider;

import common.BaseTest;
import common.WebDriverInstance;
import pageobjects.CalculatorPage;

public class LoanCalculator extends BaseTest {
	CalculatorPage calculatePage;
	WebDriverInstance setup =new WebDriverInstance();
	public WebDriver driver;
	
	
	@Test(priority=100)	
	public void testcase1() throws InterruptedException, IOException{
		driver = setup.browserSetup(driver);
		calculatePage = new CalculatorPage(driver);
		logger = extent.createTest("TC001");
		calculatePage.enterAmount("99");
		captureScreenshot(logger,driver,"LoanAmount");
		captureScreenshot(logger,driver,"LoanAmount1");
		logger.info("End");
	}

	
	@Test(priority=101)
	public void testcase2() throws InterruptedException{
		logger = extent.createTest("TC002");
		calculatePage.enterAmount("150");
		driver.quit();
	}
	
}
