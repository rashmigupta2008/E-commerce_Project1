package E_Commerce.Project_1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class TC_8_Amazon_Product_Sorted_Price {
	
	WebDriver driver;
	
	@FindBy(xpath="//select[@class='a-native-dropdown a-declarative']")
	WebElement sorted_dropdown;
	
	
	public void product_sorted_by_price()
	{
		Select s1=new Select(sorted_dropdown);
		s1.selectByVisibleText("Price: Low to High");
	}
	
	TC_8_Amazon_Product_Sorted_Price(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

}
