package Suite;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class test {
	
	@Test(priority = 1)
	public void gtest() {
		Response resp;
		RestAssured.baseURI = "https://reqres.in";
		RequestSpecification request = RestAssured.given();
		resp = request.get("/api/users/2");
		
		System.out.println(resp.jsonPath().get("data.email").toString());
	}
}
