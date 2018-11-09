package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import common.ReusableMethods;

public class GrouponHomepage extends ReusableMethods {
	
	WebDriver driver;
    
	public GrouponHomepage() {
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	@FindBy(id="ls-search")
	WebElement searchBox;
	
	@FindBy(id="ls-header-search-button")
	WebElement searchButton;
	
	@FindBy(id="nothx")
	WebElement skipLink;
	
	@FindBy(id="trait-0")
	WebElement selectType;
	
	

   public void searchItem(String itemName) {
	   skipLink.click();
	 enterText(searchBox, itemName);
	 searchButton.click();	 
   }
   
   public void selectingItem(String index) {
	   //click
	   selectvalue(selectType,index);
   }


}
