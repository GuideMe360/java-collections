package com.guideme.collection.properties;

import java.io.FileReader;
import java.util.Properties;

public class PropertiesExample {

	public static void main(String[] args) throws Exception {
		FileReader fileReader = new FileReader("src/com/guideme/collection/properties/data.properties");
		
		Properties prop = new Properties();
		prop.load(fileReader);
		
		System.out.println("Username :"+prop.getProperty("username"));
		System.out.println("Password :"+prop.getProperty("password"));
		
	}

}
