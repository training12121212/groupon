package common;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.aventstack.extentreports.Status;

public class ReusableMethods extends BaseTest {
	
	
	
	public void enterText(WebElement element,String value){
		element.clear();
		element.sendKeys(value);
		logger.log(Status.INFO, "Entered Value : " + value);
	}
	
//	public void selectvalueByIndex(WebElement element, String index) {
//		 Select oselect = new Select(element);
//		 oselect.selectByIndex(index);
//		 logger.log(Status.INFO, "Selected index : " + index);
//	}
//	
	public void selectvalue(WebElement element,String value) {
		 Select oselect = new Select(element);
		// oselect.selectByVisibleText(value);;
		 int value1 = Integer.parseInt(value);
		 oselect.selectByIndex(value1);
		 logger.log(Status.INFO, "Selected value : " + value);
	}

}
