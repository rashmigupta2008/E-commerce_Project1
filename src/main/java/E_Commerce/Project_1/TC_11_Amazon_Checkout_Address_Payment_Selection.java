package E_Commerce.Project_1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TC_11_Amazon_Checkout_Address_Payment_Selection {
	WebDriver driver;
	
	@FindBy(name="proceedToRetailCheckout")
	WebElement proceed_checkout;
	
	@FindBy(xpath="(//input[@name='submissionURL'])[4]")
	WebElement address_button;
	
	@FindBy(xpath="(//input[@class='a-button-input'])[2]")
	WebElement use_address;
	
	
	
	public void proceed_to_buy()
	{
		proceed_checkout.click();
	}
	
	public void select_address_radio_button()
	{
		address_button.click();
	}
	
	public void use_address_button()
	{
		 use_address.click();
	}
	
	
	
	
	public TC_11_Amazon_Checkout_Address_Payment_Selection(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
