package E_Commerce.Project_1;


//Verify login is successful with correct email and password
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import project_1_DDT.Excelsheet;

public class Test_Case_2 extends Base_Class {
	@Test
	public void valid_credential_login() throws EncryptedDocumentException, IOException
	{
		Excelsheet.excel_fetching_data();
		Actions a1=new Actions(driver);
		WebElement hover_over=driver.findElement(By.id("nav-link-accountList"));
		a1.moveToElement(hover_over).perform();
		WebElement sign_in_here=driver.findElement(By.xpath("(//span[.='Sign in'])[1]"));
		sign_in_here.click();
		TC_2_Amazon_Valid_Login_Page a2=new TC_2_Amazon_Valid_Login_Page(driver);
	    a2.email_id();
	    a2.continue_press();
	    a2.password();
	    a2.sign_in();
	    Assert.assertEquals(driver.getTitle(), "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in");
	}
	
	

}
