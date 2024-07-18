package E_Commerce.Project_1;


//Test if a new user can successfully register
import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
public class Test_Case_1 extends Base_Class {

	@Test
	public void registration()
	{
		Actions a1=new Actions(driver);
		WebElement hover_over=driver.findElement(By.xpath("//span[.='Hello, sign in']"));
		a1.moveToElement(hover_over).perform();
		WebElement new_registration=driver.findElement(By.xpath("(//a[.='Start here.'])[1]"));
		new_registration.click();
		TC_1_Amazon_Registration_Page a2=new TC_1_Amazon_Registration_Page(driver);
		a2.customer_name();
		a2.mob_number();
		a2.enter_password();
		a2.verify_mob();
        Assert.assertEquals(driver.getTitle(),"Authentication required","registered successfully");
        
		
	}
	
}



