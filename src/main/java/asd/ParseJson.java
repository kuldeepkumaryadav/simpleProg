package asd;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ParseJson {

	public static String file;
	public static String id;
	public static String name;
	public static String groupId;

	public void readJsonFrmFile() {
		InputStream input = null;
		Properties prop = new Properties();
		try {
			input = new FileInputStream(
					"C:\\Users\\Kuyadav\\eclipse-workspace\\asd\\src\\main\\resources\\config.properties");
			prop.load(input);
			file = prop.getProperty("read");
		} catch (IOException io) {
			io.printStackTrace();
		}

	}

	public void parseJson() throws ParseException {
		JSONParser jsn = new JSONParser();
		Object ob = jsn.parse(file);
		JSONObject jnb = (JSONObject) ob;
		id = (String) jnb.get("Id");
		name = (String) jnb.get("Name");
		groupId = (String) jnb.get("GroupId");

	}

	public static void main(String args[]) throws ParseException {
		ParseJson pars = new ParseJson();
		pars.readJsonFrmFile();
		pars.parseJson();
		JsonObject obj = new JsonObject();
		obj.setId(id);
		obj.setName(name);
		obj.setGroupId(groupId);
		System.out.println("Id = " + obj.getId());
		System.out.println("Name = " + obj.getName());
		System.out.println("GroupId = " + obj.getGroupId());
	}
}
