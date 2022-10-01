package apiTest_Parsers.core;

import java.io.StringWriter;

import com.google.gson.Gson;

import apiTest_Parsers.Staff;
import apiTest_Parsers_beans.User;

public class JsonUtil {
	public static String getJsonFromJavaObject(User user) {
		Gson gson = new Gson();

		// 1. Java object to JSON file
		StringWriter sw = new StringWriter();
		gson.toJson(user, sw);

		// 2. Java object to JSON string
		// String jsonInString = gson.toJson(user);

		// System.out.println(jsonInString);

		return sw.toString();
	}

	public static User getJavaObjectfromJson(String jsonString) {
		Gson gson = new Gson();
		User user = gson.fromJson(jsonString, User.class);
		System.out.println(user.getAge());

		return user;
	}

}
