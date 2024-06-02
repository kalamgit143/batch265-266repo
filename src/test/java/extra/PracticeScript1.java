package extra;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeScript1 
{
	@Test
	public void test()
	{
		//open browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
}
