package E_Commerce.Project_1;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import project_1_DDT.Excelsheet;

//Go to orders page and click on your last ordered product and give 5 star rating

public class Test_Case_14 extends Base_Class {
	
	@Test
	
	public void give_rating_on_last_order() throws EncryptedDocumentException, IOException, InterruptedException
	{
		  Excelsheet.excel_fetching_data();
		  Actions a1=new Actions(driver); 
		  WebElement hover_over=driver.findElement(By.id("nav-link-accountList"));
		  a1.moveToElement(hover_over).perform(); 
		  TC_14_Amazon_Click_Last_Ordered_Product_Give_Rating a2=new TC_14_Amazon_Click_Last_Ordered_Product_Give_Rating(driver);
		  a2.view_your_order();
		  TC_2_Amazon_Valid_Login_Page a3=new TC_2_Amazon_Valid_Login_Page(driver); 
		  a3.email_id();
		  a3.password(); 
		  a3.sign_in();
		  WebElement your_order_loctaion=driver.findElement(By.xpath("(//span[@class='a-button a-button-span12 a-button-base'])[1]"));
		  Point p1=your_order_loctaion.getLocation();
		  int x1=p1.getX();
		  int y1=p1.getY();
		  System.out.println(x1);
		  System.out.println(y1);
		  JavascriptExecutor js=(JavascriptExecutor) driver;
		  js.executeScript("window.scrollBy(0,+"+y1+")");
		  Thread.sleep(500);
		  your_order_loctaion.click();
		  a2.smily_face_click();
		  
		 
	}

}
