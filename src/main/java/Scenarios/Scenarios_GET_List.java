package Scenarios;

import org.testng.Assert;

import GET.GET_List;
import io.restassured.response.Response;

public class Scenarios_GET_List {
	
	static Response resp = GET_List.GetList();

	public static void ValidateStatusGetList200() {
		Assert.assertEquals(resp.getStatusCode(), 200);
	}
	
	public static void ValidateJsonBodyNotNull() {
		Assert.assertNotNull(resp.jsonPath().get("userId[0]"));
		Assert.assertNotNull(resp.jsonPath().get("id[0]"));
		Assert.assertNotNull(resp.jsonPath().get("title[0]"));
		Assert.assertNotNull(resp.jsonPath().get("body[0]"));
	}
	
	public static void ValidateArrayLength100() {
		Assert.assertEquals(resp.jsonPath().get("id.size()"), 100);
	}
}
