package E_Commerce.Project_1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TC_7_Amazon_Product_discription_Page_Display {
	
	WebDriver driver;
	
	@FindBy(xpath="(//a[@class='a-link-normal s-no-outline'])[5]")
	WebElement shoe_display;
	
	
	public void display_shoe_image()
	{
		shoe_display.click();
	}
	TC_7_Amazon_Product_discription_Page_Display(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	
	
	

}
