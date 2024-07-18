package E_Commerce.Project_1;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class Base_Class {
	WebDriver driver;
	@Parameters("rashmi_gupta")
	@BeforeMethod
	public void before_method(String browser_name)
	{
		if(browser_name.equalsIgnoreCase("chrome"))
		{
			driver=new ChromeDriver();
		}
		if(browser_name.equalsIgnoreCase("edge"))
		{
			driver=new EdgeDriver();
		}
		driver.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=155259815513&hvpone=&hvptwo=&hvadid=674842289437&hvpos=&hvnetw=g&hvrand=10166471146323279445&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9062142&hvtargid=kwd-10573980&hydadcr=14453_2316415&gad_source=1");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    
	}
	
	/*
	 * @AfterMethod public void after_method() throws InterruptedException {
	 * Thread.sleep(5000); driver.quit(); }
	 */
	

}
