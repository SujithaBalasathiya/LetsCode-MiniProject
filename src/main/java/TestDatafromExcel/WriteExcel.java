package TestDatafromExcel;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcel {

	public static void main(String[] args) throws IOException {
		try {
			String filepath = System.getProperty("user.dir")
					+ "\\src\\main\\resources\\InputExcelFile\\WriteExcel.xlsx";
			FileWriter Writefile = new FileWriter(filepath);
			XSSFWorkbook wbook = new XSSFWorkbook();
			XSSFSheet sheet = wbook.createSheet("Employee Details");
			sheet.createRow(0).createCell(0).setCellValue("Name");
			sheet.getRow(0).createCell(1).setCellValue("Age");
			sheet.createRow(1).createCell(0).setCellValue("Sujitha");
			sheet.getRow(1).createCell(1).setCellValue("26");
			FileOutputStream WriteExel = new FileOutputStream(filepath);
			wbook.write(WriteExel);
			wbook.close();
			System.out.println("Data inserted successfully into Excel");
		} catch (IOException e) {
			System.out.println("An error occurred");
			e.printStackTrace();
		}

	}

}
