package E_Commerce.Project_1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


//Verify that searching with filters(e.g.,category,price rage) gives accurate result
public class Test_Case_6 extends Base_Class{
	@Test
	
	public void search_product_with_filter() throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		TC_5_Amazon_Search_Product a1=new TC_5_Amazon_Search_Product(driver);
		a1.search_product();
		TC_6_Amazon_Search_Filter_Product a2=new TC_6_Amazon_Search_Filter_Product(driver);
		  a2.delivery_day_select(); 
		  a2.shoe_category_select(); 
		  a2.shoe_brand_select();
		  a2.price_slider_select();
		  a2.click_go();
		 
		  
	}

}
