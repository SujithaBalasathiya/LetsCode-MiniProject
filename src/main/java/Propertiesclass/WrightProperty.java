package Propertiesclass;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Properties;

public class WrightProperty {

	

	public static void main(String[] args) throws IOException {
		String filepath = System.getProperty("user.dir")+"//Propertiesclass//Properties.properties";
		FileWriter w = new FileWriter(filepath);
		
		Properties property = new Properties();
		property.setProperty("Name", "Sathyan");
		property.store(w, "Property Updated");

	}

}
