package com.ibm.banking;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class FileCapture {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		FileInputStream fis = new FileInputStream("./testData/config.properties");
		Properties prop = new Properties();
		
		prop.load(fis);
		System.out.println("application url" + prop.getProperty("url"));
		System.out.println("user name" + prop.getProperty("userid"));
		System.out.println("password" + prop.getProperty("des","not provided"));
		
		

	}

}
