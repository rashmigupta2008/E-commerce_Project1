package E_Commerce.Project_1;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TC_15_Amazon_Reach_Till_Cart_Page_Without_Login {
	
	WebDriver driver;
	
	@FindBy(xpath="(//a[@class='a-link-normal s-no-outline'])[4]")
	WebElement click_shoe;
	
	public void click_on_shoe_image(WebDriver driver) throws InterruptedException
	{
		click_shoe.click();
		Thread.sleep(3000);
		Set<String> p1=driver.getWindowHandles();
		Iterator<String> pc_id=p1.iterator();
		String p_id=pc_id.next();
		String c_id=pc_id.next();
		driver.switchTo().window(c_id);
	}
	
	@FindBy(xpath="//input[@title='Add to Shopping Cart']")
	WebElement add_cart;
	
	public void shoe_add_to_cart()
	{
		add_cart.click();
	}
	
	@FindBy(linkText="Go to Cart")
	WebElement go_to_cart;
	
	public void go_cart()
	{
		go_to_cart.click();
	}
	
	public TC_15_Amazon_Reach_Till_Cart_Page_Without_Login(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

}
