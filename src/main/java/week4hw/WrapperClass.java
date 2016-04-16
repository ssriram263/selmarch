package week4hw;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Set;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class WrapperClass {
	
	WebDriver driver;
	String parentwindow;
	
	//Input - browser(chrome or Firfox) and URL to navigate
	//Output - opens Chrome or Firefox, maximize window and navigates to given url
	public void launchapp(String browser, String url){
		
		try {
			if(browser.equalsIgnoreCase("chrome")){
				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
				driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.get(url);
				parentwindow = driver.getWindowHandle();
			}else if(browser.equalsIgnoreCase("firefox")){
				driver = new FirefoxDriver();
				driver.manage().window().maximize();
				driver.get(url);
				parentwindow = driver.getWindowHandle();
			}
		} catch (WebDriverException e)  {
			System.out.println("Can't launch Application"+browser);
		}	
		
	}
	
	//Input - webelement id and string to be filled in the webelement
    //Output - Enters given string in the desired web-object using id
	public void enterById(String id, String value){
		
		try {
			driver.findElement(By.id(id)).clear();
			driver.findElement(By.id(id)).sendKeys(value);
		} catch (NoSuchElementException e) {			
			System.out.println("Id "+id+" can't be found");
		}
		
	}
	
	//Input - webelement id 
    //Output - clicks the desired web-object using id
	public void clickById(String id ){
		
		try {
			driver.findElement(By.id(id)).click();
		} catch (NoSuchElementException e) {      
			System.out.println("Id "+id+" can't be found");
		}
		
	}
	
	//Input - webelement class and string to be filled in the webelement
    //Output - Enters given string in the desired web-object using classname
	public void enterByClassName(String classname, String value){
		
		try {
			driver.findElement(By.className(classname)).clear();
			driver.findElement(By.className(classname)).sendKeys(value);
		} catch (NoSuchElementException e) {			
			System.out.println("Classname "+classname+" can't be found");
		}
		
	}
	
	//Input - webelement classname
    //Output - clicks the desired web-object using classname
    public void clickByClassName(String classname ){
		
		try {
			driver.findElement(By.className(classname)).click();
		} catch (NoSuchElementException e) {          
			System.out.println("Classname "+classname+" can't be found");
			}
		
	}
    
    //Input - webelement Name
    //Output - Enters given string in the desired web-object using Name
    public void enterByName(String name, String value){
    	
    	try {
    		driver.findElement(By.name(name)).clear();
			driver.findElement(By.name(name)).sendKeys(value);
		} catch (NoSuchElementException e) {
			System.out.println("Name "+name+" can't be found");	
		}
    	
    }
    
    //Input - webelement Name
    //Output - clicks the desired web-object using name
    public void clickByName(String name){
    	
    	try {
			driver.findElement(By.name(name)).click();
		} catch (NoSuchElementException e) {			
			System.out.println("Name "+name+" can't be found");	
		}
    	
    }
	
    //Input - webelement xpath and string to be filled in the webelement
    //Output - Enters given string in the desired web-object using xpath
    public void enterByXpath(String xpath, String value){
    	
    	try {
    		driver.findElement(By.xpath(xpath)).clear();
			driver.findElement(By.xpath(xpath)).sendKeys(value);;
		} catch (NoSuchElementException e) {			
			System.out.println("Xpath "+xpath+"can't be found");			
		}
    	
    }
    
    //Input - webelement xpath 
    //Output - clicks the desired web-object using xpath
    public void clickByXpath(String xpath){
    	
    	try {
			driver.findElement(By.xpath(xpath)).click();
		} catch (NoSuchElementException e) {			
			System.out.println("Xpath "+xpath+" can't be found");	
		}
    	
    }
    
    //Input - webelement id and Index
    //Output - selects a value by index
    public void selectValueByIndex(String id, int index){
    	
    	try {
			WebElement se =driver.findElement(By.id(id));
			Select dropdown = new Select(se);
			List <WebElement> list = dropdown.getOptions();
			list.get(index).click();
		} catch (NoSuchElementException e) {			
			System.out.println("Exception in selectValueByIndex method");	 
		}
    	
    }
    
    //Input - no input
    //Output - switches to primary or parent window    
    public void switchToPrimaryWindow(){
    	
    	try {
			driver.switchTo().window(parentwindow);
		} catch (NoSuchWindowException e) {			
			System.out.println("Parentwindow "+parentwindow+" can't be found");	
		}
    	
    }
    
    //Input - no input
    //Output - switches to last window
    public void switchToLastWindow(){
    	
    	try {
			Set <String> allwindows = driver.getWindowHandles();    	
			int count = allwindows.size();
			for(int i = 1; i<count; i++){    		
			allwindows.remove(allwindows.iterator().next());       
			}    	
			String lastwindow = allwindows.iterator().next();
			driver.switchTo().window(lastwindow);
		} catch (NoSuchWindowException e) {			
			System.out.println("Exception in switchToLastWindow method");
		}
    	
    }
    
    //Input - frame xpath
    //OutPut - switches to particular frame based on frame xpath
    public void switchToFrameByXpath(String xpath){
    	
    	try {
			driver.switchTo().frame(driver.findElement(By.xpath(xpath)));
		} catch (NoSuchElementException e) {			
			System.out.println("Xpath "+xpath+" can't br found");
		} catch (NoSuchFrameException e){
			System.out.println("Exception in switchToFrameByXpath method");
		}
    	
    }
    
    //Input -  frame classname
    //OutPut - switches to particular frame based on frame classname
    public void switchToFrameByClassname(String classname){
    	
    	try {
			driver.switchTo().frame(driver.findElement(By.className(classname)));
		} catch (NoSuchElementException e) {			
			System.out.println("Classname "+classname+" can't be found");
		}catch (NoSuchFrameException e){
			System.out.println("Exception in switchToFrameByClassName method");
		}
    			
    }
    
    //Input - frame id
    //OutPut - switches to particular frame based on frame id
    public void switchToFrameById(String id){
    	
    	try {
			driver.switchTo().frame(id);
		} catch (NoSuchElementException e) {			
			System.out.println("Frame id "+id+" can't be found");
		} catch (NoSuchFrameException e){
			System.out.println("Exception in switchToFrameById method");
		}   	
    	
    }
    
    //Input - frame name
    //OutPut - switches to particular frame based on frame name
    public void switchToFrameByName(String name){
    	
    	try {
			driver.switchTo().frame(name);
		} catch (NoSuchElementException e) {			
			System.out.println("Frame name "+name+" can't be found");
		} catch (NoSuchFrameException e){
			System.out.println("Exception in switchToFrameByName method");
		}   		
    	
    }
    
    //Input - no input
    //Output - switch to first frame
    public void switchToFirstFrame(){
    	
    	try {
			driver.switchTo().frame(0);
		} catch (Exception e) {			
			System.out.println("Exception in switchToFirstFrame method");
		}    	
    	
    }
    
    //Input - no input
    //output - accept alert
    public void acceptAlert(){
    	
    	try {
			Alert a = driver.switchTo().alert();
			a.accept();
		} catch (NoAlertPresentException e) {			
			System.out.println("Exception in acceptAlert method");
		}
    	
    }  
    
    //Input - no input
    //output - accept alert
    public void dimissAlert(){
    	
    	try {
			Alert a = driver.switchTo().alert();
			a.dismiss();
		} catch (NoAlertPresentException e) {			
			System.out.println("Exception in dismissAlert method");
		}
    	
    }
    
    //Input - expected url
    //Output - verify expected url equals to actual url
    public void verifyUrl(String expurl){
    	
    	try {
			String acturl = driver.getCurrentUrl();
			if(expurl.equals(acturl)){
				System.out.println("Url verification successful: Expected url-"+expurl+"    Actual url-"+acturl);    		
			}
			else{
				System.out.println("Url verification unsuccessful: Expected url-"+expurl+"    Actual url-"+acturl);
			}
		} catch (WebDriverException e) {
			System.out.println("Exception in verifyUrl method");
		}
    	
    }
    
    //Input - expected Title
    //Output - verify expected title equals to actual title
     public void verifyTitle(String exptitle){
    	
    	try {
			String acttitle = driver.getTitle();
			if(exptitle.equals(acttitle)){
				System.out.println("Title verification successful: Expected title-"+exptitle+"    Actual title-"+acttitle);    		
			}
			else{
				System.out.println("Url verification unsuccessful: Expected title-"+exptitle+"    Actual title-"+acttitle);
			}
		} catch (WebDriverException e) {
			System.out.println("Exception in verifyTitle method");			
		}
    	
    }
     
    //Input - webelement id to be verified, expected text
    //Output - verify expected text equals to actual text
     public void verifyText(String id, String exptext){
    	
    	 try {
			String acttext = driver.findElement(By.id(id)).getText();
			 if(exptext.equals(acttext)){
				 System.out.println("Text verification successful: Expected text-"+exptext+"    Actual text-"+acttext);
			 }
			 else{
				 System.out.println("Text verification unsuccessful: Expected text-"+exptext+"    Actual text-"+acttext);
			 }
		} catch (NoSuchElementException e) {
			System.out.println("Exception in verifyText method");			
		}
    	 
    } 
     
     //Input - link text
     //Output - clicks the desired web-obj using link text
     public void clickByLinkText(String linktext){
    	 
    	 try {
			driver.findElement(By.linkText(linktext)).click();
		} catch (NoSuchElementException e) {
			System.out.println("Link Text "+linktext+ " can't be found");
		}
     }
     
 public void clickByTagName(String tagname){
    	 
    	 try {
			driver.findElement(By.tagName(tagname)).click();
		} catch (NoSuchElementException e) {
			System.out.println("Tag Name "+tagname+ " can't be found");
		}
     }
     
     //Input - partial link text
     //output - clicks the desired web-obj using partial link text
     public void clickByPartialLinkText(String partiallinktext){
    	 try {
			driver.findElement(By.partialLinkText(partiallinktext)).click();;
		} catch (NoSuchElementException e) {
			System.out.println("Partial Link Text "+partiallinktext+" can't be found");
		}
     }
     
     public String readCellFromExcel(String TCWorkBook, int row, int col) throws IOException {
 		
 		FileInputStream fis = new FileInputStream(new File("./data/"+TCWorkBook+".xlsx"));

 		XSSFWorkbook wb = new XSSFWorkbook(fis);

 		XSSFSheet sheet = wb.getSheet("Sheet1");
 		
      XSSFRow currentrow = sheet.getRow(row);
      return currentrow.getCell(col).getStringCellValue();
 	}
     
     public String readCellFromExcel1(String TCWorkBook, int row, int col) throws IOException {
  		
  		FileInputStream fis = new FileInputStream(new File("./data/"+TCWorkBook+".xls"));

  		HSSFWorkbook wb = new HSSFWorkbook(fis);

  		HSSFSheet sheet = wb.getSheet("Sheet1");
  		
       HSSFRow currentrow = sheet.getRow(row);
       return currentrow.getCell(col).getStringCellValue();
  	}
     
     public String readByLocator(String xpath) throws IOException {
   		
   		 
        return driver.findElement(By.xpath(xpath)).getText().toString();
   	}
}
