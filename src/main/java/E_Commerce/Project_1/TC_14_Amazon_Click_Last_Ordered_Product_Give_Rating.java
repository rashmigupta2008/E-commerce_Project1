package E_Commerce.Project_1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TC_14_Amazon_Click_Last_Ordered_Product_Give_Rating {
	
	WebDriver driver;
	
	@FindBy(xpath="//a[@id='nav_prefetch_yourorders']")
	WebElement your_order;
	
	@FindBy(id="rme-happy-feedback-link")
	WebElement smily_face;
	
	
	public void view_your_order()
	{
		your_order.click();
	}
	
	public void smily_face_click()
	{
		smily_face.click();
	}
	
	public TC_14_Amazon_Click_Last_Ordered_Product_Give_Rating(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

}
