package week4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcel {

	public static void main(String[] args) throws IOException {
		
		XSSFWorkbook wbook = new XSSFWorkbook();
		XSSFSheet sheet = wbook.createSheet("TestOutput.xlsx");
		XSSFRow row0 =sheet.createRow(0);
		XSSFRow row1 = sheet.createRow(1);
		XSSFRow row2 = sheet.createRow(2);
		XSSFRow row3 = sheet.createRow(3);
		XSSFRow row4 = sheet.createRow(4);
		
			row0.createCell(0).setCellValue("S.NO");
		
			row0.createCell(1).setCellValue("TestCaseName");
		
			row0.createCell(2).setCellValue("Status");
		
			row1.createCell(0).setCellValue("1");
						
			row1.createCell(1).setCellValue("CreateLead");
			
			row1.createCell(2).setCellValue("PASS");
			
			row2.createCell(0).setCellValue("2");
			
			row2.createCell(1).setCellValue("EditLead");
			
			row2.createCell(2).setCellValue("FAIL");
			
			row3.createCell(0).setCellValue("3");
			
			row3.createCell(1).setCellValue("MergeLead");
			
			row3.createCell(2).setCellValue("PASS");
			
			row4.createCell(0).setCellValue("4");
			
			row4.createCell(1).setCellValue("DeleteLead");
			
			row4.createCell(2).setCellValue("FAIL");
			
			FileOutputStream fileOutput = new FileOutputStream(new File("F:\\Selenium\\SelMarch2\\data\\output.xlsx"));
			
			wbook.write(fileOutput);
			
			wbook.close();
			
			fileOutput.close();
			
			System.out.println("completed");
			
	}

}
