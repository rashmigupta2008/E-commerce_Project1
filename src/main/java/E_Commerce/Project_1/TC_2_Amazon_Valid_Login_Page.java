package E_Commerce.Project_1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import project_1_DDT.Excelsheet;

public class TC_2_Amazon_Valid_Login_Page extends Excelsheet {
	
	WebDriver driver;
	
	@FindBy(name="email")
	WebElement email;
	
	@FindBy(id="continue")
	WebElement continue_button;
	
	@FindBy(name="password")
	WebElement passwordd;
	
	@FindBy(id="signInSubmit")
	WebElement signin_button;
	
	public void email_id()
	{
		email.sendKeys(username);
	}
	
	public void continue_press()
	{
		 continue_button.click();
	}
	
	public void password()
	{
		passwordd.sendKeys(password);
	}
	
	public void sign_in()
	{
		signin_button.click();
	}
	
	public TC_2_Amazon_Valid_Login_Page(WebDriver driver)
	{
		
		PageFactory.initElements(driver, this);
	}

}
