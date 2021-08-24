package Suite;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import GET.GET_List;
import GET.POST_List;
import Scenarios.Scenarios_GET_List;
import Scenarios.Scenarios_POST_List;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class test {
	
	@BeforeTest
	public void BeforeSuite() {
		RestAssured.baseURI = "https://jsonplaceholder.cypress.io";
	}
	
	@Test(priority = 1)
	public void GET_List() {
		Scenarios_GET_List.ValidateStatusGetList200();
		Scenarios_GET_List.ValidateJsonBodyNotNull();
		Scenarios_GET_List.ValidateArrayLength100();
	}
	
	@Test(priority = 2)
	public void POST_List() {
		Scenarios_POST_List scenarios = new Scenarios_POST_List();
		scenarios.ValidateStatusPostList201();
		//scenarios.ValidateResponseBodyMatchedWithParameter();
	}
	
}
