package myTests;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

public class Tests1 {
	public static void main(String[] args) throws IOException {
		// Get Gson object

		// read JSON file data as String
		String fileData = new String(Files.readAllBytes(
				Paths.get("C:\\Forcepoint\\Git\\V4.6.3_TestNG\\workspace\\myTests\\src\\myTests\\x.json")));
		System.out.println(fileData);
		JsonElement jelement = new JsonParser().parse(fileData);
		
		String  jobject = jelement.getAsJsonObject().get("empID").getAsString();
		System.err.println(jobject);
	}
}
