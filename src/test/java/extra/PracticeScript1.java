package extra;

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
		//close browser
		driver.quit();
	}
}
