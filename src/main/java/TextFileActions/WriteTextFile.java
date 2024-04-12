package TextFileActions;

import java.io.FileWriter;
import java.io.IOException;

public class WriteTextFile {

	public static void main(String[] args) throws IOException {
		try {
			FileWriter filewrite = new FileWriter(System.getProperty("user.dir") + "\\src\\main\\resources\\TextFile\\Textfile.txt");
			filewrite.write("User has completed text write");
			filewrite.close();
			System.out.println("Text file write completed successfully");
		} catch (IOException e) {
			System.out.println("Failed due to exception");
			e.printStackTrace();
		}

	}

}
