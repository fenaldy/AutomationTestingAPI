package Scenarios;

import org.testng.Assert;

import GET.POST_List;
import io.restassured.response.Response;

public class Scenarios_POST_List {
	
	static Response resp = POST_List.PostList("recommendation", "motorcycle", 12);
	
	public void ValidateStatusPostList201() {
		Assert.assertEquals(resp.getStatusCode(), 201);
	}	
	
	public void ValidateResponseBodyMatchedWithParameter() {
		Assert.assertEquals(resp.jsonPath().get("title"), "recommendation");
		Assert.assertEquals(resp.jsonPath().get("body"), "motorcycle");
		Assert.assertEquals(resp.jsonPath().get("userId"), 12);
	}
	
}
