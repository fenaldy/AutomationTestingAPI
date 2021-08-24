package GET;

import java.util.ArrayList;

import org.testng.Assert;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GET_List {

	public static Response GetList() {
		Response resp;
		
		RequestSpecification request = RestAssured.given();
		resp = request.get("/posts");
		
		return resp;
	}
	
}
