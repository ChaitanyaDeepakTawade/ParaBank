package com.Utils;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

/*
 * This class helps to get data from properties file.
 * @Author chaitanya tawade (expleo pune) 
 * @sign 31/01/2024 jdk-1.7 
 * */

public class PropertiesFileReader {
    static Properties prop = new Properties();
    
	public static Properties PropertiesFileReader (String Path){
		
	    FileReader reader;   
		try {
			
			reader = new FileReader(Path);
			prop.load(reader);
			
		} catch (FileNotFoundException e) {

			e.printStackTrace();
			
		} catch (IOException e) {
			
			e.printStackTrace();
			
		}
		
	   return prop;
	}

}
