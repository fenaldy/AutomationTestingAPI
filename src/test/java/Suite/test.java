package Suite;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import GET.GET_List;
import Scenarios.Scenarios_GET_List;
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
}
