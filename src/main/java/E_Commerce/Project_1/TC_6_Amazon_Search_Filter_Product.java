package E_Commerce.Project_1;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TC_6_Amazon_Search_Filter_Product {
	WebDriver driver;
	
	@FindBy(xpath="//a/span[.='Get It by Tomorrow']")
	WebElement delivery_day;
	
	@FindBy(linkText="Women's Sports & Outdoor Shoes")
	WebElement shoe_category;
	
	@FindBy(xpath="//a/span[.='Campus']")
	WebElement shoe_brand;
	
	@FindBy(xpath="(//input[@type='range'])[2]")
	WebElement price_slider;
	
	@FindBy(xpath="//input[@class='a-button-input']")
	WebElement price_select_button;
	
	
	public void delivery_day_select()
	{
		delivery_day.click();
	}
	
	public void shoe_category_select()
	{
		shoe_category.click();
	}
	
	public void shoe_brand_select()
	{
		shoe_brand.click();
	}
	
	public void price_slider_select() throws InterruptedException
	{
		for(int i=0;i<=50;i++)
		{
			Thread.sleep(500);
			price_slider.sendKeys(Keys.ARROW_LEFT);
		}
	}
	
	public void click_go()
	{
		price_select_button.click();
	}
	
	public TC_6_Amazon_Search_Filter_Product(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

}
