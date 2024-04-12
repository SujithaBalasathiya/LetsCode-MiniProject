package Propertiesclass;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class ModifyPropertyfile {

	public static void main(String[] args) throws IOException {
		String filepath = System.getProperty("user.dir")+"//Propertiesclass//Properties.properties";
		FileReader R = new FileReader(filepath);
		
		Properties p = new Properties();
		p.load(R);
		
		p.setProperty("Name","Sujitha");
		p.setProperty("DOB",p.getProperty("DOB"));
		p.setProperty("Age",p.getProperty("Age"));
		
		FileWriter W = new FileWriter(filepath);
		p.store(W, "Updated Updated");
	}

}
