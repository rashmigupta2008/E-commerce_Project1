package E_Commerce.Project_1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TC_3_Amazon_Invalid_Login_Page {
	
WebDriver driver;
	
	@FindBy(name="email")
	WebElement email;
	
	@FindBy(id="continue")
	WebElement continue_button;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(id="auth-signin-button")
	WebElement signin_button;
	
	public void email_id()
	{
		email.sendKeys("rashmi.gupta@gmail.com");
	}
	
	public void continue_press()
	{
		 continue_button.click();
	}
	
	public void password()
	{
		password.sendKeys("hyderabad");
	}
	
	public void sign_in()
	{
		signin_button.click();
	}
	
	public TC_3_Amazon_Invalid_Login_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}


}
