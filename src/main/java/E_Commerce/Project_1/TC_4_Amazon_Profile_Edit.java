package E_Commerce.Project_1;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TC_4_Amazon_Profile_Edit {
	WebDriver driver;
	
	@FindBy(xpath="(//a[@class='a-button-text'])[12]")
	WebElement name_edit;
	
	@FindBy(name="customerName")
	WebElement new_name;
	
	@FindBy(xpath="(//input[@type='submit'])[18]")
	WebElement name_save_change;
	
	public void edit_name()
	{
		name_edit.click();
	}
	
	 public void enter_new_name()
	 {
		 new_name.sendKeys(Keys.BACK_SPACE);
		 new_name.sendKeys(Keys.BACK_SPACE);
		 new_name.sendKeys(Keys.BACK_SPACE);
		 new_name.sendKeys(Keys.BACK_SPACE);
		 new_name.sendKeys(Keys.BACK_SPACE);
		 new_name.sendKeys(Keys.BACK_SPACE);
		 new_name.sendKeys(Keys.BACK_SPACE);
		 new_name.sendKeys(Keys.BACK_SPACE);
		 new_name.sendKeys(Keys.BACK_SPACE);
		 new_name.sendKeys(Keys.BACK_SPACE);
		 new_name.sendKeys(Keys.BACK_SPACE);
		 new_name.sendKeys(Keys.BACK_SPACE);
		 new_name.sendKeys("rashmi");
		 name_save_change.click();
	 }
	 
	public TC_4_Amazon_Profile_Edit (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	

}
