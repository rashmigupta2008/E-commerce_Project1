package E_Commerce.Project_1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TC_9_Amazon_Product_Added_Shoppingcart {
	WebDriver driver;
	
	@FindBy(xpath="(//div[@class='a-section aok-relative s-image-tall-aspect'])[1]")
	WebElement shoe_click;
	
	
	@FindBy(xpath="//span[@id='submit.add-to-cart']")
	WebElement add_cart;
	
	public void first_shoe_click()
	{
		shoe_click.click();
	}
	
	public void product_added_cart()
	{
		add_cart.click();
	}
	
	public TC_9_Amazon_Product_Added_Shoppingcart(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	

}
