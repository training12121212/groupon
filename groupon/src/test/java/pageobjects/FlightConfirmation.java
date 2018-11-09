package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import common.ReusableMethods;

public class FlightConfirmation extends ReusableMethods{
      
	WebDriver driver;
	
	public FlightConfirmation(WebDriver driver) {
		 PageFactory.initElements(driver, this);
	 		this.driver=driver;
	}
	
	@FindBy(xpath="(//font[contains(.,'Confirmation')])[3]")
			WebElement confirmation;
	public void captureConfirmation(){
		String val;
		val = confirmation.getText();
		logger.info(val.split("#")[1]);
	}

}
