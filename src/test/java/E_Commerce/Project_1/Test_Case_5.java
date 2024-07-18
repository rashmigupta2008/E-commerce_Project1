package E_Commerce.Project_1;

//Test searching for products using its name like shoe
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test_Case_5 extends Base_Class {
	
	@Test
	public void search_product_shoe()
	{
		TC_5_Amazon_Search_Product a1=new TC_5_Amazon_Search_Product(driver);
		a1.search_product();
		Assert.assertEquals(driver.getTitle(), "Amazon.in : shoe");
		
	}

}
