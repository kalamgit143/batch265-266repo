package extra;

import org.testng.Reporter;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PracticeScript2 
{
	RequestSpecification req;
	Response res;
	
	@Test
	public void test()
	{
		req=RestAssured.given();
		req.baseUri("http://www.google.co.in");
        req.basePath("search");
        req.queryParam("q","abdul kalam");
        res=req.get();
        Reporter.log(res.asString());
	}

}
