package json_Read_Write;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.LinkedHashMap;
import java.util.Map;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class CreateJSON {

	public static void main(String[] args) throws FileNotFoundException {

		JSONObject jObject = new JSONObject();

		jObject.put("Name", "Ishan");
		jObject.put("Surname", "Mittal");
		jObject.put("Age", "30");
		jObject.put("Status", "Single");

		JSONArray jArray = new JSONArray();

		Map<String, String> firstCompany = new LinkedHashMap<String, String>();
		firstCompany.put("CompanyName", "Webvirtue Technology");
		firstCompany.put("Designation", "Quality Analyst");
		firstCompany.put("Location", "Gurgaon");

		Map<String, String> secondCompany = new LinkedHashMap<String, String>();
		secondCompany.put("CompanyName", "Gspann Technology");
		secondCompany.put("Designation", "Sr. Software Engg.");
		secondCompany.put("Location", "Gurgaon");

		jArray.add(secondCompany);
		jArray.add(firstCompany);

		jObject.put("Company details", jArray);

		PrintWriter pw = new PrintWriter(System.getProperty("user.dir") + "\\JSONFiles\\CreateJSON.json");
		pw.write(jObject.toJSONString());

		pw.flush();
		pw.close();

	}
}
