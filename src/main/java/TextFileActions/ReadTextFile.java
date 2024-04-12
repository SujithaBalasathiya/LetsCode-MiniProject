package TextFileActions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class ReadTextFile {

	public static void main(String[] args) throws FileNotFoundException {
		try {
			FileReader Readfile = new FileReader(
					System.getProperty("user.dir") + "\\src\\main\\resources\\TextFile\\Textfile.txt");
			Scanner sc = new Scanner(Readfile);
			while(sc.hasNextLine()) {
				String value = sc.nextLine();
				System.out.println(value);
			}
			sc.close();
		} catch (FileNotFoundException e) {
			System.out.println("Failed due to error");
			e.printStackTrace();
			
		}

	}

}
