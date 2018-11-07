package tests;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import common.BaseTest;
import common.Excel;
import common.WebDriverInstance;
import pageobjects.CalculatorPage;

public class SecondClass extends BaseTest {
	CalculatorPage calculatePage;
	WebDriverInstance setup = new WebDriverInstance();
	public WebDriver driver;
	Excel excel =new Excel(".\\src\\test\\java\\testData\\TestScripts.xlsx","TestData","TC001");

	@Test(priority = 101)
	public void testcase2() throws InterruptedException, IOException {
		driver = setup.browserSetup(driver);
		calculatePage = new CalculatorPage(driver);
		System.out.println(excel.getData("PARAM1"));
		calculatePage.printAllElements();
		driver.quit();
		/*
		 * driver.findElement(By.name("userName")).sendKeys("Demo");
		 * driver.findElement(By.name("password")).sendKeys("demo");
		 * driver.findElement(By.name("login")).click();
		 */

		// driver.findElement(By.linkText("REGISTER")).click();
		// driver.findElement(By.partialLinkText("Hote")).click();;

	}

}
