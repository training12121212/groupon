package pageobjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import common.ReusableMethods;
import common.WebDriverInstance;

public class CalculatorPage extends ReusableMethods {

	WebDriver driver;

	@FindBy(name = "cloanamount")
	WebElement amount;
	//List<WebElement> ls;
@FindBy(tagName="input")
List<WebElement> textbox;

	public void enterAmount(String amountValue) {
		enterText(amount, amountValue);
	}

	public CalculatorPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	public void printAllElements(){
		for(WebElement s: textbox){
			System.out.println(s.getAttribute("name"));
		}
	}
	

}
