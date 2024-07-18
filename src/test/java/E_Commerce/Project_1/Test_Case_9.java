package E_Commerce.Project_1;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

//Verify that items can be added to the shopping cart from the product pages

public class Test_Case_9 extends Base_Class {
	
	@Test
	
	public void product_added_to_shopping_cart() throws InterruptedException
	{
		TC_5_Amazon_Search_Product a1=new TC_5_Amazon_Search_Product(driver);
		a1.search_product();
		TC_6_Amazon_Search_Filter_Product a2=new TC_6_Amazon_Search_Filter_Product(driver);
		  a2.delivery_day_select(); 
		  a2.shoe_category_select(); 
		  a2.shoe_brand_select();
		  a2.price_slider_select();
		  a2.click_go();
		 
		TC_8_Amazon_Product_Sorted_Price a4=new TC_8_Amazon_Product_Sorted_Price(driver);
		a4.product_sorted_by_price();
		TC_9_Amazon_Product_Added_Shoppingcart a5=new TC_9_Amazon_Product_Added_Shoppingcart(driver);
		a5.first_shoe_click();
		Set<String> p1=driver.getWindowHandles();
		Iterator<String> pc_id=p1.iterator();
		String p_id=pc_id.next();
		String c_id=pc_id.next();
		driver.switchTo().window(c_id);
		a5.product_added_cart();
		String actual_text=driver.findElement(By.xpath("//h1[contains( text( ),'Added')]")).getText();
		String expected_text="Added to Cart";
		Assert.assertEquals(actual_text, expected_text);
				
		
		
	}

}
