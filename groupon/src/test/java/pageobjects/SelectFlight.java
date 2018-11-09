package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectFlight {

	
	WebDriver driver;
	public SelectFlight(WebDriver driver) 
	{
		 PageFactory.initElements(driver, this);
	 		this.driver=driver;
	     	 
	
	}
	
	
	@FindBy(xpath=("//input[@value='Blue Skies Airlines$361$271$7:10']"))
	WebElement depart;
	
	
	@FindBy(xpath=("//input[@value='Blue Skies Airlines$631$273$14:30']"))
	WebElement returns;
	
	@FindBy(name="reserveFlights")
	WebElement continues;
	public void selectFlights()
	{
		depart.click();
		returns.click();
		continues.click();
	}


}
