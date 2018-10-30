package common;

import org.openqa.selenium.WebElement;

import com.aventstack.extentreports.Status;

import tests.BaseTest;

public class ReusableMethods extends BaseTest {
	
	
	
	public void enterText(WebElement element,String value){
		element.clear();
		element.sendKeys(value);
		logger.log(Status.INFO, "Entered Value : " + value);
	}

}
