package UI;

import java.io.FileInputStream;
import java.io.IOException;

//import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingExcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileInputStream file = new FileInputStream("/Users/maniketkumar/eclipse-workspace/SeleniumTraining/testdata/data.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		
		int totalrows = sheet.getLastRowNum();
		int totalcells = sheet.getRow(1).getLastCellNum();
		
		System.out.println("Total number of rows"+totalrows);
		System.out.println("Total number of cells"+totalcells);
		
		for(int r=0;r<=totalrows;r++)
		{
			XSSFRow currentRow=  sheet.getRow(r);
			for(int c=0;c<totalcells;c++)
			{
//				XSSFCell cell = currentRow.getCell(c);
//				String value =  cell.toString();
				String value =  currentRow.getCell(c).toString();
				System.out.println(value);
			}
		}
		workbook.close();
		file.close();
	}

}