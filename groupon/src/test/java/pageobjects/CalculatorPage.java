package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import common.ReusableMethods;
import common.WebDriverInstance;

public class CalculatorPage extends ReusableMethods {

	WebDriver driver;

	@FindBy(name = "cloanamount")
	WebElement amount;

	public void enterAmount(String amountValue) {
		enterText(amount, amountValue);
	}

	public CalculatorPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	

}
