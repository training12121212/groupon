package pageobjects;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import common.Excel;
import common.ReusableMethods;

public class FlightFinder extends ReusableMethods  {
	
	     WebDriver driver;
	     public FlightFinder(WebDriver driver)
	     {
	    	 
	    	 PageFactory.initElements(driver, this);
	 		this.driver=driver;
	     	 
	     }
				

			@FindBy(xpath=("//input[@value='roundtrip']"))
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
			
			public void fightRegistration(Excel excel) throws IOException 
			{
	           type.click();
				selectvalue(passenger,excel.getData("PARAM1"));
				selectvalue(deptFrom, excel.getData("PARAM2"));
				selectvalue(onMonth, excel.getData("PARAM3"));
				selectvalue(fromDay, excel.getData("PARAM4"));
				selectvalue(arriveTo, excel.getData("PARAM5"));
				selectvalue(toMonth, excel.getData("PARAM6"));
				selectvalue(toDay, excel.getData("PARAM7"));
				serviceClass.click();
				selectvalue(airline, excel.getData("PARAM8"));
				continous.click();
			}

			


	     }




