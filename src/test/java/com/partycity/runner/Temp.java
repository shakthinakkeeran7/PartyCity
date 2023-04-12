package com.partycity.runner;

import java.util.HashMap;

import com.partycity.dataprovider.ConfigExcelFileReader;
import com.partycity.manager.FileReaderManager;

public class Temp {
	public static ConfigExcelFileReader reader = new ConfigExcelFileReader();
	
	public static void main(String[] args) throws Throwable {
		HashMap<String, String> testData = null;
		HashMap<String, String> rowTestData = reader.getRowTestData("LoginPageTestData", "SuccessfulLoginWithValidUsernameAndPassword");
		String sheetName = FileReaderManager.getInstance().getCrInstance().getSheetName("LoginPageTestData");
		String testName = "SuccessfulLoginWithValidUsernameAndPassword";
				
		
		System.out.println("----------"+rowTestData.get("EmailID")+rowTestData.get("Password")+"--------------");
		
		String LoginUrl = FileReaderManager.getInstance().getCrInstance().getApplicationUrl()+"/account-login";
	
	}
}
