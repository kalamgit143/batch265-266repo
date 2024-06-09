package extra;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeScript1 
{
	WebDriver driver;
	
	@Test(priority = 1)
	public void test1() throws Exception
	{
		//open browser
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(5000);
	}
	
	@Test(priority = 2)
	public void test2() throws Exception
	{
		//launch site
		driver.get("https://www.google.com");
		Thread.sleep(5000);
	}
	
	@Test(priority = 3)
	public void test3()
	{
		if(driver.getTitle().equals("Google"))
		{
			Reporter.log("Google title test passed");
			Assert.assertTrue(true);
		}
		else
		{
			Reporter.log("Google title test failed");
			Assert.assertTrue(false);
		}
	}
	@Test(priority = 4)
	public void test4()
	{
		//close browser window
		driver.quit();
	}
}
