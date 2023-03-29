package com.partycity.manager;

import com.partycity.dataprovider.ConfigFileReader;

public class FileReaderManager {

	private FileReaderManager() {
		
	}

	
	public static FileReaderManager getInstance() {
	
		FileReaderManager obj = new FileReaderManager();
			return obj;	
	}
	
	public ConfigFileReader getCrInstance() throws Throwable {
		ConfigFileReader cr= new 		ConfigFileReader();
		return cr;
	}
	
}
