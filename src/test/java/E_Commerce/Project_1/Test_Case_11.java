package E_Commerce.Project_1;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import project_1_DDT.Excelsheet;

//Validate the entire checkout process,including address selection,payment method selection and order review

public class Test_Case_11 extends Base_Class {
	
	@Test
	
	public void validate_checkout_process_address_payment_selection__order_review() throws InterruptedException, EncryptedDocumentException, IOException
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
		
		  TC_9_Amazon_Product_Added_Shoppingcart a5=new TC_9_Amazon_Product_Added_Shoppingcart(driver);
		a5.first_shoe_click();
		Set<String> p1=driver.getWindowHandles();
		Iterator<String> pc_id=p1.iterator();
		String p_id=pc_id.next();
		String c_id=pc_id.next();
		driver.switchTo().window(c_id);
		a5.product_added_cart();
		TC_10_Amazon_Updating_Shopping_Cart a6=new TC_10_Amazon_Updating_Shopping_Cart(driver);
		a6.go_to_cart();
		a6.quantity_updated();
		
		TC_11_Amazon_Checkout_Address_Payment_Selection a7=new TC_11_Amazon_Checkout_Address_Payment_Selection(driver);
		a7.proceed_to_buy();
		
		TC_2_Amazon_Valid_Login_Page a8=new TC_2_Amazon_Valid_Login_Page(driver);
		 Excelsheet.excel_fetching_data();
		    a8.email_id();
		    a8.continue_press();
		    a8.password();
		    a8.sign_in();
		    a7.select_address_radio_button();
		    Thread.sleep(1500);
		    a7.use_address_button();
		   
	}

}
