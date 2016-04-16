package week4hw;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class erail {

	public static void main(String[] args) throws InterruptedException, IOException {
		
System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeDriver driver= new ChromeDriver();
		
		driver.get("http://erail.in/");
		
		
		driver.findElementById("txtStationFrom").clear();
		driver.findElementById("txtStationFrom").sendKeys("MAS",Keys.TAB);
		driver.findElementById("txtStationTo").clear();
		driver.findElementById("txtStationTo").sendKeys("ED",Keys.ENTER);
		Thread.sleep(5000);
		XSSFWorkbook wb = new XSSFWorkbook();
		XSSFSheet sheet = wb.createSheet("Sheet1");
		//driver.findElementByClassName("DataTable TrainList");
		List <WebElement> heading=driver.findElementsByXPath("//*[@id='divTrainsListHeader']/table[1]/tbody/tr");
		for (WebElement headingiter : heading) {
			
			XSSFRow row = sheet.createRow(0);
			List<WebElement> iteratorh = headingiter.findElements(By.tagName("td"));
			for (int h = 0; h < iteratorh.size(); h++) {
				XSSFCell cell = row.createCell(h);
				cell.setCellValue(iteratorh.get(h).getText());		
			}
		}
		List <WebElement> Rows=driver.findElementsByXPath("//*[@id='divTrainsList']/table[1]/tbody/tr");
		System.out.println(Rows.size());
		int i = 1;
		for (WebElement iterator : Rows) {
							XSSFRow row = sheet.createRow(i);	
				
				List<WebElement> iterator2 = iterator.findElements(By.tagName("td"));
				for (int j = 0; j < iterator2.size(); j++) {
					XSSFCell cell = row.createCell(j);
					cell.setCellValue(iterator2.get(j).getText());		
			}
				i++;
		}
		FileOutputStream fout = new FileOutputStream(new File("F:\\Selenium\\SelMarch2\\data\\erail.xlsx"));
		wb.write(fout);
		fout.close();
		System.out.println("done");
	}

}
