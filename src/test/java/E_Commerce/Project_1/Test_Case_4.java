package E_Commerce.Project_1;


//Check if a user can successfully edit their profile information
import java.time.Duration;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test_Case_4 extends Base_Class
{
	@Test
	public void edit_profile()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Actions a1=new Actions(driver);
		WebElement hover_over=driver.findElement(By.id("nav-link-accountList"));
		a1.moveToElement(hover_over).perform();
		WebElement your_account=driver.findElement(By.xpath("(//a[@class='nav-link nav-item'])[6]"));
		your_account.click();
		WebElement login_security=driver.findElement(By.xpath("(//a[@class='ya-card__whole-card-link'])[2]"));
		login_security.click();
		TC_2_Amazon_Valid_Login_Page a2=new TC_2_Amazon_Valid_Login_Page (driver);
		a2.email_id();
		a2.continue_press();
		a2.password();
		a2.sign_in();
		  Scanner sc=new Scanner(System.in); 
		  System.out.println("enter the otp");
		  String code=sc.next(); 
		  WebElement input_code=driver.findElement(By.id("input-box-otp"));
		  input_code.sendKeys(code); 
		  WebElement submit_code=driver.findElement(By.xpath("(//input[@class='a-button-input'])[2]"));
		  submit_code.click();
		  TC_4_Amazon_Profile_Edit a3=new TC_4_Amazon_Profile_Edit(driver);
		a3.edit_name();
		a3.enter_new_name();
		String actual_msg=driver.findElement(By.xpath("//div[@id='SUCCESS_MESSAGES']/div/div")).getText();
		String expected_msg="Name updated.";
		Assert.assertEquals(actual_msg, expected_msg, "the success msg is mismatched");
	}

}
