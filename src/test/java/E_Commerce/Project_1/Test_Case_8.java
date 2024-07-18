package E_Commerce.Project_1;

import org.testng.annotations.Test;

//check if products can be sorted by relevance,price,rating.etc.
public class Test_Case_8 extends Base_Class {
	@Test
	
	public void product_sorted_by_price() throws InterruptedException
	{
		TC_5_Amazon_Search_Product a1=new TC_5_Amazon_Search_Product(driver);
		a1.search_product();
		TC_6_Amazon_Search_Filter_Product a2=new TC_6_Amazon_Search_Filter_Product(driver);
		  a2.delivery_day_select(); 
		  a2.shoe_category_select(); 
		  a2.shoe_brand_select();
		  a2.price_slider_select();
		  a2.click_go();
		  TC_8_Amazon_Product_Sorted_Price a3=new TC_8_Amazon_Product_Sorted_Price(driver);
		  a3.product_sorted_by_price();
	}
	

}
