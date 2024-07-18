package E_Commerce.Project_1;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TC_5_Amazon_Search_Product {
	WebDriver driver;
	@FindBy(id="twotabsearchtextbox")
	WebElement search_field;
	
	public void search_product()
	{
		search_field.sendKeys("shoe");
		search_field.sendKeys(Keys.ENTER);
	}
	
	public TC_5_Amazon_Search_Product(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

}
