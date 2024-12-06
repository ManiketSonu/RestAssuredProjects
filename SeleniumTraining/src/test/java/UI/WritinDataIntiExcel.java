package UI;

import java.io.FileOutputStream;
import java.io.IOException;

//import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritinDataIntiExcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileOutputStream file = new FileOutputStream(System.getProperty("user.dir")+"\\testdata\\myfile.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet =  workbook.createSheet();
		
//		XSSFCell cell = sheet.createRow(0).createCell(1);
		
		XSSFRow row1 = sheet.createRow(0);
		
		row1.createCell(1).setCellValue("Welcome");
		row1.createCell(2).setCellValue("12345");
		row1.createCell(3).setCellValue("XYZ");
		
		XSSFRow row2 = sheet.createRow(1);
		row2.createCell(1).setCellValue("abc");
		row2.createCell(2).setCellValue("4567");
		row2.createCell(3).setCellValue("testing");

		workbook.write(file);
		workbook.close();
		file.close();
		
		System.out.println("Writing in excel file is done");
	}

}