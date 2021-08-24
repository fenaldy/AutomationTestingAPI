package GET;

import org.json.simple.JSONObject;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class POST_List {
	
	public static JSONObject jsonBody(String title, String body, int userid) {
		JSONObject json = new JSONObject();
		json.put("title", title);
		json.put("body", body);
		json.put("userId", userid);
		
		return json;
	}
	
	public static Response PostList(String title, String body, int userid) {
		Response resp;
		JSONObject strJson = jsonBody(title, body, userid);

		RequestSpecification request = RestAssured.given();
		request.body(strJson).headers("Content-Type", "application/json");
		resp = request.post("/posts");
		
		return resp;
	}
}
