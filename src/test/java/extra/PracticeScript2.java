package extra;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PracticeScript2 
{
	RequestSpecification req;
	Response res;
	
	@Test(priority=1)
	public void test()
	{
		req=RestAssured.given();
		req.baseUri("http://www.google.co.in");
        req.basePath("search");
        req.queryParam("q","abdul kalam");
        res=req.get();
	}
	
	@Test(priority=2)
	public void test2()
	{
		//verify result
		if(res.getStatusCode()==200 && res.asString().contains("abdul kalam"))
		{
			Reporter.log("status code test passed");
			Assert.assertTrue(true);
		}
		else
		{
			Reporter.log("status code test failed");
			Assert.assertTrue(false);
		}
	}

}
