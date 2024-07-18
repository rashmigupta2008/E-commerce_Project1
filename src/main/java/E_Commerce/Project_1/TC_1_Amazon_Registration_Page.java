package E_Commerce.Project_1;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TC_1_Amazon_Registration_Page {
	
	WebDriver driver;
	
	@FindBy(id="ap_customer_name")
	WebElement name;
	
	@FindBy(id="ap_phone_number")
	WebElement phone_no;
	
	@FindBy(id="ap_password")
	WebElement password;
	
	@FindBy(id="auth-continue")
	WebElement verify_number;
	
	public void customer_name()
	{
		name.sendKeys("harshita gupta");
	}
	
	public void mob_number()
	{
		phone_no.sendKeys("6393513975");
	}
	
	public void enter_password()
	{
		password.sendKeys("hellorashmi");
	}
	
	public void verify_mob()
	{
		verify_number.click();
	}
	
	public TC_1_Amazon_Registration_Page(WebDriver driver)
	{
			
		PageFactory.initElements(driver, this);
	}
}
