package week4;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcel2 {

	public static void main(String[] args) throws IOException {
		
		XSSFWorkbook wbook = new XSSFWorkbook();
		XSSFSheet sheet = wbook.createSheet("TestOutput.xlsx");
		
		for (int i=1;i<5;i++)
		{
			XSSFRow currentRow =sheet.createRow(i);
			currentRow.createCell(0).setCellValue(i);
			String[] testCase = new String[5];
			//testCase  = [ "Create" , "Edit" , "Merge" , "Delete"];
			testCase[0] = "Create Lead";
			testCase[1] = "Edit Lead";
			testCase[2] = "Merge Lead";
			testCase[3] = "Delete Lead";
			currentRow.createCell(1).setCellValue(testCase[i-1]);
			if(i%2 ==0)
			{
				currentRow.createCell(2).setCellValue("PASS");
			}
			else
			{
				currentRow.createCell(2).setCellValue("FAIL");
			}
		}
		
		FileOutputStream fileOutput = new FileOutputStream(new File("F:\\Selenium\\SelMarch2\\data\\output1.xlsx"));
		
		wbook.write(fileOutput);
		
		wbook.close();
		
		fileOutput.close();
		
		System.out.println("completed");
		

	}

}
