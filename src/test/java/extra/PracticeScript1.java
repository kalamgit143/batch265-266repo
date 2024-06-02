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
	public void test1()
	{
		//open browser
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@Test(priority = 2)
	public void test2()
	{
		//launch site
		driver.get("https://www.google.com");
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
		//close browser
		driver.quit();
	}
}
