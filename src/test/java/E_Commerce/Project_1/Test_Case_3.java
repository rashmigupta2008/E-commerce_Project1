package E_Commerce.Project_1;


//Ensure login fails with incorrect email or password
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test_Case_3 extends Base_Class{
	@Test
	
	public void invalid_login_credential()
	{
		Actions a1=new Actions(driver);
		WebElement hover_over=driver.findElement(By.id("nav-link-accountList"));
		a1.moveToElement(hover_over).perform();
		WebElement new_registration=driver.findElement(By.xpath("(//span[.='Sign in'])[1]"));
		new_registration.click();
		TC_3_Amazon_Invalid_Login_Page a3=new TC_3_Amazon_Invalid_Login_Page(driver);
	    a3.email_id();
	    a3.continue_press();
	    a3.password();
	    a3.sign_in();
	   // Assert.assertEquals(driver.getTitle(), );
	}
	

}
