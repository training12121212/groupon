package tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import common.BaseTest;
import common.WebDriverInstance;
import pageobjects.GrouponHomepage;


public class GrouponSearch extends BaseTest{
	
	
	WebDriverInstance setup =new WebDriverInstance();
	public WebDriver driver;
	GrouponHomepage homePage;
	
	
  @Test
  public void findIteam() throws IOException
  {
	  driver = setup.browserSetup(driver);
	  homePage = new GrouponHomepage();
	  logger = extent.createTest("Find Iteam ");
	  homePage.searchItem("cricket bats");
	   captureScreenshot(logger,driver,"GrouponHomePage");
		//logger.info("Entered value : shoe");
	  driver.quit();
	  
  }
}
