package E_Commerce.Project_1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//Check if user is able to select each payment method

public class TC_12_Amazon_Select_Each_Payment_Method {
	WebDriver driver;
	
	@FindBy(xpath="(//input[@name='ppw-instrumentRowSelection'])[6]")
	WebElement cash_on_delivery;
	
	@FindBy(xpath="(//input[@name='ppw-instrumentRowSelection'])[5]")
	WebElement emi_option;
	
	@FindBy(xpath="(//input[@name='ppw-instrumentRowSelection'])[4]")
	WebElement upi_option;
	
	@FindBy(xpath="(//input[@name='ppw-instrumentRowSelection'])[3]")
	WebElement net_banking;
	
	@FindBy(xpath="(//input[@name='ppw-instrumentRowSelection'])[2]")
	WebElement credit_card;
	
	@FindBy(xpath="(//input[@name='ppw-instrumentRowSelection'])[1]")
	WebElement amazon_pay_balance;
	
	public void cash_on_delivery_payment()
	{
		cash_on_delivery.click();
		
	}
	
	public void emi_payment()
	{
		emi_option.click();
		
	}
	
	public void upi_payment()
	{
		upi_option.click();
		
	}
	
	public void net_banking_payment()
	{
		net_banking.click();
		
	}
	
	public void  credit_card_payment()
	{
		 credit_card.click();
		
	}
	
	public void  amazon_pay_balance_payment()
	{
		 amazon_pay_balance.click();
		
	}
	
	
	
	public TC_12_Amazon_Select_Each_Payment_Method(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

}
