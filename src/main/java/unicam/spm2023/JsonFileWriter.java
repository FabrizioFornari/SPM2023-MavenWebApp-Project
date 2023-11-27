package unicam.spm2023;

import java.io.BufferedWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.json.JSONObject;

public class JsonFileWriter {
	 public static void main( String[] args )
	    {
	        System.out.println( "Hello World!" );
	        writeJson();
	    }
	    
	    
	    public static void writeJson() {
	    	
	    	JSONObject jo = new JSONObject();
	    	jo.put("name", "jon doe");
	    	jo.put("age","22");
	    	jo.put("city", "chicago");
	    	
	    	String fileName = "/Users/fabriziofornari/Desktop/java-spm2022/jsonFile.json";
	    	try(BufferedWriter writer = Files.newBufferedWriter(Paths.get(fileName),StandardCharsets.UTF_8)){
	    		jo.write(writer);
	    		writer.write("\n");
	    	} catch (Exception ex) {
	    		System.err.println("Couldn't write content Names\n" + ex.getMessage());
	    	}
	    	System.out.println("Successfully Copied JSON Object to File...");
	    	System.out.println("\nJSON Object: " + jo);
	    }
}
