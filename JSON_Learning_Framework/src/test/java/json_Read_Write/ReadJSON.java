package json_Read_Write;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ReadJSON {

	public static void main(String[] args) throws FileNotFoundException, IOException, ParseException {

		Object obj = new JSONParser()
				.parse(new FileReader(System.getProperty("user.dir") + "\\JSONFiles\\JSONExample.json"));

		JSONObject jObject = (JSONObject) obj;

		String employeeName = (String) jObject.get("Name");

		JSONArray comapnyArray = (JSONArray) jObject.get("Company details");

		JSONObject companyObject = (JSONObject) comapnyArray.get(0);
		
		String companyName = (String) companyObject.get("CompanyName");

		System.out.println("Name of Employee is : " + employeeName);

		System.out.println("Latest Company of Employee is : " + companyName);
	}

}
