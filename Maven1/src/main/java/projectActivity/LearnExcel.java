package projectActivity;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class LearnExcel {

	public static void main(String[] args) throws IOException {
		 XSSFWorkbook book = new XSSFWorkbook("./testData/Data1.xlsx");
		 XSSFSheet sheet = book.getSheet("CreateLead");
		 int rowCount = sheet.getLastRowNum();
		 short colCount = sheet.getRow(0).getLastCellNum();
		 for (int i = 1; i <= rowCount; i++) {
			XSSFRow row = sheet.getRow(i);
			for (int j = 0; j < colCount; j++) {
				XSSFCell cell = row.getCell(j);
				String S = cell.getStringCellValue();
				System.out.print(S+" ");
			}
			System.out.println();
		}
		 

	}

}
