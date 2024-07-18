package E_Commerce.Project_1;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

//Reach till cart page without login in amazon application
public class Test_Case_15 extends Base_Class {
	
	@Test
	
	public void reach_cart_page_witout_login() throws InterruptedException
	{
		TC_5_Amazon_Search_Product a1=new TC_5_Amazon_Search_Product(driver);
		a1.search_product();
		TC_15_Amazon_Reach_Till_Cart_Page_Without_Login a2=new TC_15_Amazon_Reach_Till_Cart_Page_Without_Login(driver);
		a2.click_on_shoe_image(driver);
		
		a2.shoe_add_to_cart();
		a2.go_cart();
	}

}
