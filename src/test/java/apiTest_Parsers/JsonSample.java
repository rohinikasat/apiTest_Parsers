package apiTest_Parsers;

import java.io.FileWriter;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.github.cliftonlabs.json_simple.Jsonable;
import com.github.cliftonlabs.json_simple.Jsoner;
import com.google.gson.Gson;
import com.google.gson.JsonObject;

import apiTest_Parsers.core.JsonUtil;
import apiTest_Parsers_beans.User;

public class JsonSample {

	
	public static void main(String[] args) throws IOException {
		
		//// for getJsonFromJavaObject
		User user = createUser();
		String jsonString = JsonUtil.getJsonFromJavaObject(user);
		
		System.out.println(jsonString);
		
		
		//// for getJavaObjectfromJson
//		User user;
//		
//		String jsonTestString = "{\"name\":\"Rohini\",\"age\":27,\"position\":[\"Founder\",\"CTO\",\"Writer\"],\"skills\":[\"java\",\"python\",\"node\",\"kotlin\"],\"salary\":"
//				+ "{\"2018\":14000,\"2012\":12000,\"2010\":10000}}";
//		
//		 user = JsonUtil.getJavaObjectfromJson(jsonTestString);
//		
//		System.out.println(user.getName());
	}

	private static User createUser() {

		User user = new User();

		user.setName("Rohini");
		user.setAge(27);
		user.setPosition(new String[] { "Founder", "CTO", "Writer" });
		Map<String, BigDecimal> salary = new HashMap() {
			{
				put("2010", new BigDecimal(10000));
				put("2012", new BigDecimal(12000));
				put("2018", new BigDecimal(14000));
			}
		};
		user.setSalary(salary);
		user.setSkills(Arrays.asList("java", "python", "node", "kotlin"));

		return user;

	}

}