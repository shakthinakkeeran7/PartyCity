package com.partycity.runner;

import com.partycity.dataprovider.ConfigFileReader;
import com.partycity.manager.FileReaderManager;

public class temp extends ConfigFileReader {

	public static void main(String[] args) throws Throwable {
		
		
	
		
		
		String browser2 = FileReaderManager.getInstance().getCrInstance().getBrowser();
		System.out.println(browser2);
		//WebDriver driver = BaseClass.getBrowser(browser);
		
	}
}
