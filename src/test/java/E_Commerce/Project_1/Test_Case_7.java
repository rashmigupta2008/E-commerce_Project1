package E_Commerce.Project_1;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

//Ensure that the product detail page displays all necessary information(price,reviews,description)
public class Test_Case_7 extends Base_Class {
	
	@Test
	
	public void product_discription_review_display() throws InterruptedException
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
		  TC_7_Amazon_Product_discription_Page_Display a3=new TC_7_Amazon_Product_discription_Page_Display(driver) ;
		  a3.display_shoe_image();
		  Set<String> pc_id=driver.getWindowHandles();
		  Iterator<String> it=pc_id.iterator();
		  String p_id=it.next();
		  String c_id=it.next();
		  driver.switchTo().window(c_id);
		  System.out.println(driver.getTitle());
		  
		WebElement detail =driver.findElement(By.xpath("//div[@id='detailBulletsWrapper_feature_div']/h2"));
		String actual_detail=detail.getText();
		Point p1=detail.getLocation();
		int x1=p1.getX();
		int y1=p1.getY();
		System.out.println(x1);
		System.out.println(y1);
		JavascriptExecutor js1= (JavascriptExecutor)driver;
		js1.executeScript("window.scrollBy(0, +"+y1+")");
		System.out.println(actual_detail); 
		String expected_detail="Product details";
		Assert.assertEquals(actual_detail,expected_detail ); 
		 
		 WebElement description =driver.findElement(By.xpath("//h2[@class='softlines']"));
			String actual_description=description.getText();
			Point p2=description.getLocation();
			int x2=p2.getX();
			int y2=p2.getY();
			System.out.println(x2);
			System.out.println(y2);
			
			JavascriptExecutor js2= (JavascriptExecutor)driver;
			js2.executeScript("window.scrollBy(0, +"+y2+")");
			
			System.out.println(actual_description); 
			String expected_description="Product description";
			Assert.assertEquals(actual_description,expected_description); 
			
			 WebElement customer_review =driver.findElement(By.xpath("(//div[@class='a-section celwidget'])[2]//h2[contains(text( ),'Customer reviews')]"));
				String actual_customer_review=customer_review.getText();
				Point p3=customer_review.getLocation();
				int x3=p3.getX();
				int y3=p3.getY();
				System.out.println(x3);
				System.out.println(y3);
				
				JavascriptExecutor js3= (JavascriptExecutor)driver;
				js3.executeScript("window.scrollBy(0, +"+y2+")");
				
				System.out.println(actual_customer_review); 
				String expected_customer_review="Customer reviews";
				Assert.assertEquals(actual_customer_review,expected_customer_review); 
			
			
		
	}

}
