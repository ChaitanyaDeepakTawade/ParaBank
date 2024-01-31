package StepDefinations;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

/*
 * Testing Data for login page
 * @Author chaitanya tawade (expleo pune) 
 * @sign 30/01/2024 jdk-1.7 
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
