package com.qa.JSONConv;

import java.io.FileReader;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.qa.NestedJSON.POJO.Donut;

public class JSONParser {

    public static void main(String args[]) {
        // toJSON();  // converting Java object to JSON String
       toJava();  // parsing JSON file to create Java object
    }

    /**
     * Method to parse JSON String into Java Object using Jackson Parser.
     *
     */
    public static void toJava() {
       
        // this is the key object to convert JSON to Java
        ObjectMapper mapper = new ObjectMapper();

        try {
        	
        	FileReader fr = 
        		      new FileReader("C:\\Users\\Ninad\\eclipse-workspace\\ConversionsJSON_JAVA\\src\\main\\resources\\com\\qa\\JSON\\Files\\JSONNested.json"); 
        	Donut cake = mapper.readValue(fr, Donut.class);
            System.out.println("Java object created from JSON String :");
            System.out.println(cake);

        } catch (JsonGenerationException ex) {
            ex.printStackTrace();
        } catch (JsonMappingException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();

        }
    }
}