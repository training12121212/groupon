package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import common.BaseTest;
import common.WebDriverInstance;
import pageobjects.CalculatorPage;

public class SecondClass extends BaseTest {
	CalculatorPage calculatePage;
	WebDriverInstance setup =new WebDriverInstance();
	public WebDriver driver;
	
	
	@Test(priority=101)
	public void testcase2() throws InterruptedException{
		driver = setup.browserSetup(driver);
		calculatePage = new CalculatorPage(driver);
		logger = extent.createTest("TC003");
		calculatePage.enterAmount("150000");
		driver.quit();
	}

}
