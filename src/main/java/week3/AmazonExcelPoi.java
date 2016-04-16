package week3;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonExcelPoi {

	public static void main(String[] args) throws IOException {
		
System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeDriver driver= new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		FileInputStream fis=new FileInputStream(new File ("./data/shopping.xls"));
		
		HSSFWorkbook workbook =new HSSFWorkbook(fis);
		
		HSSFSheet sheet=workbook.getSheet("Sheet1");
		
		HSSFRow currentRow= sheet.getRow(1);
		
		driver.findElementByXPath("//*[@id='twotabsearchtextbox']").sendKeys(currentRow.getCell(0).getStringCellValue());
		
		driver.findElementByXPath("//*[@id='nav-search']/form/div[2]/div/input").click();
		
		String qty = currentRow.getCell(1).getStringCellValue();
		
		int index = Integer.parseInt(qty);
		
		System.out.println(qty);
		
		System.out.println(driver.findElementByXPath("//ul[@id='s-results-list-atf']/li[" + index + "]/div/div/div/div[2]/div[2]/a/h2").getText());

		driver.close();

	}

}
