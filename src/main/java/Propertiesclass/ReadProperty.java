package Propertiesclass;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Properties;

public class ReadProperty {

	

	public static void main(String[] args) throws IOException {
	
			String filepath = System.getProperty("user.dir")+"//Propertiesclass//Properties.properties";
			FileReader file = new FileReader(filepath);
			
			Properties p = new Properties();
			p.load(file);
			
			System.out.println("Name");
		

	}

}
