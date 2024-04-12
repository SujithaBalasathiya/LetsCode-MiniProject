package TextFileActions;

import java.io.File;
import java.io.IOException;

public class CreateTextFile {

	public static void main(String[] args) throws IOException {
		try {
			String filepath = System.getProperty("user.dir") + "\\src\\main\\resources\\TextFile\\Textfile.txt";
			File file = new File(filepath);
			if (file.createNewFile()) {
				System.out.println("New File Created: " + file.getName());
			} else {
				System.out.println("File already created");
			} 
		
		} catch (IOException e) {
			System.out.println("Failed due to error");
			e.printStackTrace();
		}

	}

}
