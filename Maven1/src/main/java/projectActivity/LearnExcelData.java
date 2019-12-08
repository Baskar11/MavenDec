package projectActivity;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class LearnExcelData {
	public String[][] excelDataUsage(String excelFileName) throws IOException {
		XSSFWorkbook book = new XSSFWorkbook("./testData/"+excelFileName+".xlsx");
		 XSSFSheet sheet = book.getSheet("CreateLead");
		 int rowCount = sheet.getLastRowNum();
		 short colCount = sheet.getRow(0).getLastCellNum();
		 String[][] dataExcel = new String[rowCount][colCount];
		 for (int i = 1; i <= rowCount; i++) {
			XSSFRow row = sheet.getRow(i);
			for (int j = 0; j < colCount; j++) {
				XSSFCell cell = row.getCell(j);
				dataExcel[i-1][j] = cell.getStringCellValue();				
				System.out.print(dataExcel[i-1][j]+" ");
			}
			System.out.println();
		}
		 return dataExcel;



	}

	public static void main(String args[]) throws IOException {
		LearnExcelData obj = new LearnExcelData();
		obj.excelDataUsage("Data1");
	}
}
