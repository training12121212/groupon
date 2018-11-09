package tests;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import common.BaseTest;
import common.Excel;
import common.WebDriverInstance;
import getterSetter.FlightGS;
import pageobjects.BookAFlight;
import pageobjects.FlightConfirmation;
import pageobjects.FlightFinder;
import pageobjects.SelectFlight;
//import pageobjects.RegistrationWebtour;
import pageobjects.WebtourHomepage;

public class MecuryWebtour extends BaseTest {
	WebDriverInstance setup =new WebDriverInstance();
	public WebDriver driver;
	WebtourHomepage obj;
	FlightFinder flightFinder;
	SelectFlight sf;
	BookAFlight bf;
	FlightConfirmation fc;
	Excel excel =new Excel(".\\src\\test\\java\\testData\\TestScripts.xlsx","TestData","TC001");
	
  @Test
  public void LoginPage() throws IOException {
	  driver = setup.browserSetup(driver);
	  logger = extent.createTest(excel.getData("TestCaseName"));
	  flightFinder = new FlightFinder(driver); 
	  sf = new SelectFlight(driver);
	  obj = new WebtourHomepage(driver);
	  bf = new BookAFlight(driver);
	  fc = new FlightConfirmation(driver);
	  obj.loginPage(excel.getData("USERNAME"),excel.getData("PASSWORD"));
		flightFinder.fightRegistration(excel);
	     sf.selectFlights();
	
	     bf.bookFight(excel);
	     captureScreenshot(logger,driver,"bookFights");
	     captureScreenshot(logger,driver,"bookFights");
	  driver.quit();
  }
}
