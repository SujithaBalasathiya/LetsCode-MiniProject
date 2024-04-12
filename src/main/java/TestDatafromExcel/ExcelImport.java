package TestDatafromExcel;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ExcelImport {

	public static void main(String[] args) throws IOException {
		String filepath = System.getProperty("user.dir")+"\\src\\main\\resources\\InputExcelFile\\InputExcel.xlsx";
		System.out.println(filepath);
		//File fs = new File(filepath);
		FileInputStream file = new FileInputStream(
            new File(filepath));
		XSSFWorkbook wbook = new XSSFWorkbook(file);
		Sheet sheet = wbook.getSheetAt(0);
		/*for (int i = 1; i <= 2; i++) {
			Row row = sheet.getRow(i);
			for (int j = 0; j < 2; j++) {
				Cell cell = row.getCell(j);
				String value = cell.getStringCellValue();
				System.out.println(value);
			} 
		}*/
		Iterator<Row> itr = sheet.iterator(); // iterating over excel file
		while (itr.hasNext()) {
			Row row = itr.next();
			Iterator<Cell> cellIterator = row.cellIterator(); // iterating over each column
			while (cellIterator.hasNext()) {
				Cell cell = cellIterator.next();
				DataFormatter dft = new DataFormatter();
				String value = dft.formatCellValue(cell);
				//System.out.print(cell.getStringCellValue() + "\t\t\t");
				System.out.println(value);
			}
		}
		wbook.close();

	}

}
