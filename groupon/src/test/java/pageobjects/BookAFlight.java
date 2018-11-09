package pageobjects;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import common.Excel;
import common.ReusableMethods;

public class BookAFlight extends ReusableMethods {

	WebDriver driver;
	public BookAFlight(WebDriver driver) 
	{
		 PageFactory.initElements(driver, this);
	 		this.driver=driver;
	     	 
	}
	@FindBy(name="passFirst0")
	WebElement firstName;
	
	@FindBy(name="passLast0")
	WebElement lastName;
	@FindBy(name="pass.0.meal")
	WebElement meals;
	@FindBy(name="creditCard")
	WebElement credittype;
	@FindBy(name="creditnumber")
	WebElement creditnum;
	@FindBy(name="cc_exp_dt_mn")
	WebElement expiremon;
	@FindBy(name="cc_exp_dt_yr")
	WebElement expireyear;
	@FindBy(name="cc_frst_name")
	WebElement cardfirstname;
	@FindBy(name="cc_mid_name")
	WebElement cardmiddleName;
	@FindBy(name="cc_last_name")
	WebElement cardlastName;
	@FindBy(name="billAddress1")
	WebElement billaddress;
	@FindBy(name="billAddress2")
	WebElement billaddress2;
	@FindBy(name="billCity")
	WebElement billcity;
	@FindBy(name="billState")
	WebElement billstate;
	@FindBy(name="billZip")
	WebElement billzip;
	@FindBy(name="billCountry")
	WebElement billcountry;
	
	@FindBy(name="delAddress1")
	WebElement deladdress;
	@FindBy(name="delAddress2")
	WebElement deladdress2;
	@FindBy(name="delCity")
	WebElement delcity;
	@FindBy(name="delState")
	WebElement delstate;
	@FindBy(name="delZip")
	WebElement delzip;
	@FindBy(name="delCountry")
	WebElement delcountry;
	@FindBy(name="buyFlights")
	WebElement securepur;
	
	public void bookFight(Excel excel) throws IOException {
		enterText(firstName, excel.getData("PARAM9"));
		enterText(lastName, excel.getData("PARAM10"));
		selectvalue(meals, excel.getData("PARAM11"));
		selectvalue(credittype, excel.getData("PARAM12"));
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		enterText(creditnum, excel.getData("PARAM13"));
		selectvalue(expiremon, excel.getData("PARAM14"));
		selectvalue(expireyear, excel.getData("PARAM15"));
		enterText(cardfirstname, excel.getData("PARAM16"));
		enterText(cardmiddleName, excel.getData("PARAM17"));
		enterText(cardlastName, excel.getData("PARAM18"));
		enterText(billaddress, excel.getData("PARAM19"));
		enterText(billaddress2, excel.getData("PARAM20"));
		enterText(billcity, excel.getData("PARAM21"));
		enterText(billstate, excel.getData("PARAM22"));
		enterText(billzip, excel.getData("PARAM23"));
		selectvalue(billcountry,excel.getData("PARAM24"));
		enterText(deladdress, excel.getData("PARAM25"));
		enterText(deladdress2, excel.getData("PARAM26"));
		enterText(delcity, excel.getData("PARAM27"));
		enterText(delstate, excel.getData("PARAM28"));
		enterText(delzip, excel.getData("PARAM29"));
		selectvalue(delcountry, excel.getData("PARAM30"));
		securepur.click();
		
		
	}
	
}
