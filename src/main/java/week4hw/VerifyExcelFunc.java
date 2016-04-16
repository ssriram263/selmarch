package week4hw;

import java.io.IOException;

import org.junit.Test;

public class VerifyExcelFunc extends ExcelWrappers {
@Test	
	public void excelVerify() throws IOException{
		
		System.out.println(getNumOfRows("TC2", "Sheet2"));
		System.out.println(getCellValue("TC2", 1, 1));
		
		//writeData("TC2", 1, 9, "Hello World");
		
		closeWorkbook("TC2");
	}

}
