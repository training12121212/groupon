package pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import common.ReusableMethods;
import getterSetter.FlightGS;

public class WebtourHomepage extends ReusableMethods
{
     WebDriver driver;
     public WebtourHomepage(WebDriver driver)
     {
    	 
    	 PageFactory.initElements(driver, this);
 		this.driver=driver;
     	 
     }
		@FindBy(name="userName")
		WebElement userName;
		@FindBy(name="password")
		WebElement pwdvalue;
		@FindBy(name="login")
		WebElement loginButton;
		
		public void loginPage(String username_value, String password_value) {
		enterText(userName, username_value);
		enterText(pwdvalue, password_value);
			/*userName.sendKeys(username_value);
			pwdvalue.sendKeys(password_value);*/
		loginButton.click();
		}
		
		/*@FindBy(xpath=("//input[@value='roundtrip']"))
		WebElement type;*/
	/*	@FindBy(name="tripType")
		WebElement radioButton;*/
		
		//List<WebElement> radioButton = driver.findElements(By.name("tripType"));
		//By radioButton = By.name("tripType");
	/*	@FindBy(xpath=("//input[@value='roundtrip']"))
		WebElement type;
		
		@FindBy(name="passCount")
		WebElement passenger;
		@FindBy(name="fromPort")
		WebElement deptFrom;
		@FindBy(name="toMonth")
		WebElement onMonth;
		@FindBy(name="fromDay")
		WebElement fromDay;
		@FindBy(name="toPort")
		WebElement arriveTo;
		@FindBy(name="toMonth")
	    WebElement toMonth;
		@FindBy(name="toDay")
		WebElement toDay;
		@FindBy(xpath="//input[@value='Business']")
		WebElement serviceClass;
		@FindBy(name="airline")
		WebElement airline;
		@FindBy(name="findFlights")
		WebElement continous;
		
		public void fightRegistration(List<Integer> intValues) 
		{
			
			//selectvalue(type, num);
           type.click();
			//radioButton.get(1).click();
			selectvalue(passenger, intValues.get(0));
			selectvalue(deptFrom, intValues.get(1));
			selectvalue(onMonth, intValues.get(2));
			selectvalue(fromDay, intValues.get(3));
			selectvalue(arriveTo, intValues.get(4));
			selectvalue(toMonth, intValues.get(5));
			selectvalue(toDay, intValues.get(6));
			//selectvalue(serviceClass, num8);
			serviceClass.click();
			selectvalue(airline, intValues.get(7));
			continous.click();
		}
*/
		


     }

