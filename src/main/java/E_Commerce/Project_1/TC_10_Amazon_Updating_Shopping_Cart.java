package E_Commerce.Project_1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class TC_10_Amazon_Updating_Shopping_Cart {
	
	WebDriver driver;
	
	@FindBy(xpath="(//a[@class='a-button-text'])[3]")
	WebElement go_cart;
	
	@FindBy(name="quantity")
	WebElement quantity_added;
	
	
	
	public void go_to_cart()
	{
		go_cart.click();
	}
	
	public void quantity_updated() throws InterruptedException
	{
		Select s1=new Select(quantity_added);
		s1.selectByValue("5");
		Thread.sleep(1000);
		s1.selectByValue("2");
	}
	
	public TC_10_Amazon_Updating_Shopping_Cart(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
