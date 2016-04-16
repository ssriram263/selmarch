package week4hw;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ExcelWrappers {

	public void openWorkbook(String fileName, String sheetName) throws IOException{
		
		FileInputStream fis = new FileInputStream(new File("./data/"+fileName+".xls"));

  		HSSFWorkbook wb = new HSSFWorkbook(fis);

  		HSSFSheet sheet = wb.getSheet(sheetName);
	}
	public int getNumOfRows(String fileName, String sheetName) throws IOException{
		
		FileInputStream fis = new FileInputStream(new File("./data/"+fileName+".xls"));

  		HSSFWorkbook wb = new HSSFWorkbook(fis);

  		HSSFSheet sheet = wb.getSheet(sheetName);
  		
  		return(sheet.getLastRowNum());
	}
	
	 public String getCellValue(String fileName, int row, int col) throws IOException {
	  		
	  		FileInputStream fis = new FileInputStream(new File("./data/"+fileName+".xls"));

	  		HSSFWorkbook wb = new HSSFWorkbook(fis);

	  		HSSFSheet sheet = wb.getSheet("Sheet1");
	  		
	       HSSFRow currentrow = sheet.getRow(row);
	       return currentrow.getCell(col).getStringCellValue();
	  	}
	 
	 public void writeData(String fileName, int rownum, int colnum, String data) throws IOException {
	  		
	  		FileInputStream fis = new FileInputStream(new File("./data/"+fileName+".xls"));

	  		HSSFWorkbook wb = new HSSFWorkbook(fis);

	  		HSSFSheet sheet = wb.getSheet("Sheet1");
	  		
	       HSSFRow row = sheet.getRow(rownum);
	       
	       HSSFCell cell = row.createCell(colnum);
	       
	       cell.setCellValue(data);
	       
	       FileOutputStream fout = new FileOutputStream(new File("./data/"+fileName+".xls"));
	       
	       wb.write(fout);
	       
	       
	 }
	 
	 public void closeWorkbook(String fileName) throws IOException{
			
			FileInputStream fis = new FileInputStream(new File("./data/"+fileName+".xls"));

	  		HSSFWorkbook wb = new HSSFWorkbook(fis);

	  		wb.close();
		}

}
