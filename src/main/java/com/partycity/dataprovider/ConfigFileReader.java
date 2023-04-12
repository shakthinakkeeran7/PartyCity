package com.partycity.dataprovider;



import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ConfigFileReader {

	private Properties properties;
	private final String propertyFilePath = "src/test/resources/properties/config.properties";

	public ConfigFileReader() {
		BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader(propertyFilePath));
			properties = new Properties();
			try {
				properties.load(reader);
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			throw new RuntimeException("Configuration.properties not found at " + propertyFilePath);
		}
	}

	public void getDriverPath() {
	}

	public void getImplicitlyWait() {
		
		
	}

	public String getApplicationUrl() {
		
		String ApplicationUrl = properties.getProperty("url");

		return ApplicationUrl;
		
	}

	public String getBrowser() {

		String browserName = properties.getProperty("browserName");

		return browserName;
	}

	public void getEnvironment() {
	}

	public void getBrowserWindowSize() {
	}

	public void getTestDataResourcePath() {
	}

	
	
	
	
}
