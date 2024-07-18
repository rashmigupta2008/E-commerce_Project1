package E_Commerce.Project_1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TC_13_Amazon_Apply_Coupon_Code {
	WebDriver driver;
	
	
	  @FindBy(xpath="//input[@name='ppw-claimCode']") 
	  WebElement coupon_code;
	  
	  @FindBy(xpath="(//input[@class='a-button-input a-button-text'])[1]")
	  WebElement apply_button;
	 
	
	  public void coupon_code_apply() 
	  { 
		  coupon_code.sendKeys("ASBDGFJ"); 
		  }
	  
	  public void apply_button_click() 
	  { 
		  apply_button.click();
		  }
	
	public TC_13_Amazon_Apply_Coupon_Code(WebDriver driver) 
	{
		
		PageFactory.initElements(driver, this);
	}

}
