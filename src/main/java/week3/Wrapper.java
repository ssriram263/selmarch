package week3;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

public class Wrapper {
	
	RemoteWebDriver driver;
	
	public void	launchApp(String browser, String url){
	//verified		
			try {
					if(browser.equalsIgnoreCase("firefox")){
							driver = new FirefoxDriver();
							driver.manage().window().maximize();
					}else if(browser.equalsIgnoreCase("chrome")){
							System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
							driver= new ChromeDriver();
							driver.manage().window().maximize();
					}
				} catch (WebDriverException e) {
						System.out.println("Unable to launch" + browser + "browser");
				}
			
				driver.get(url);
			
		}
		
		public void switchToFrameByElement (String frameid){
			//verified	
			try {
					driver.switchTo().frame(frameid);
					System.out.println("U r inside frme with id: " +frameid);
				} catch (NoSuchFrameException e) {
						System.out.println("The frame with id" + frameid + "is not present");
				}
		}
		
		public void switchToFirstFrame (){
			//verified	
			try {
					driver.switchTo().frame(0);
					System.out.println("You are in first frame now");
				} catch (NoSuchFrameException e) {
						System.out.println("No frames are present here");
				}
		}
		
		public void selectValueByIndex (String id, int index){
			// verified
			try {
				
				Select dropDown = new Select(driver.findElementById(id));
				dropDown.selectByIndex(index);
				List <WebElement> option = dropDown.getOptions();
				System.out.println(option.size());
				
				for (WebElement eachoption : option) {
					
					System.out.println(eachoption.getText());
					
					
				}
				
					
				} catch (NoSuchElementException e) {
						System.out.println("No dropdowns are present here");
				}
		}
		
		public void switchToPrimaryWindow (String handle){
			
			try {
				
				driver.switchTo().window(handle);
				System.out.println("Window handle is" + handle);
					
				} catch (NoSuchWindowException e) {
						System.out.println("No primary window present ");
				}
		}
		
		public void switchToLastWindow (){
			
			try {
				Set<String> allWindows = driver.getWindowHandles();
				for (String eachWindow : allWindows) {
					
					int i=1;
					if(i == allWindows.size()){
						
						driver.switchTo().window(eachWindow);
						System.out.println("You are in last window now");
					}
					i++;
				}
					
				} catch (NoSuchWindowException e) {
						System.out.println("No window present ");
				}
		}
		
		public void acceptAlert (){
			//verified	
			try {
				
				driver.switchTo().alert().accept();
				}
					
				catch (NoAlertPresentException e) {
						System.out.println("No alert window present ");
				}
		}
		
		public void dismissAlert (){
			//verified	
			try {
				
				driver.switchTo().alert().dismiss();
				}
					
				catch (NoAlertPresentException e) {
						System.out.println("No alert window present ");
				}
		}
		
		public boolean verifyURL (String URL){
			
			boolean a = false;
			try {
				if (URL.equalsIgnoreCase(driver.getCurrentUrl())){
					a = true;
					System.out.println("URL matching");
				}
				}
					
				catch (NoSuchWindowException e) {
						System.out.println(" URL you gave " + URL + "is not matching with current URL");
				}
			return a;
		}
		
		public boolean verifyText (String id, String text){
			
			boolean a = false;
			try {
				if (driver.findElementById(id).getText().equalsIgnoreCase(text)){
					a = true;
					System.out.println("Text matching");
				}
				}
					
				catch (NoSuchElementException e) {
						System.out.println(" Text you gave " + text +" is not matching with the text in the element with id" + id);
				}
			return a;
		}
		
		public boolean verifyTitle (String title){
			
			boolean a = false;
			try {
				if (driver.getTitle().equalsIgnoreCase(title)){
					a = true;
					System.out.println("Title matching");
				}
				}
					
				catch (NoSuchWindowException e) {
						System.out.println(" Title you gave" + title + "is not matching with current window title");
				}
			return a;
		}
		public void clickByXPath (String xpath){
		//verified	
			try {
				driver.findElementByXPath(xpath).click();
				}
					
				catch (NoSuchElementException e) {
						System.out.println(" Incorrect X Path" + xpath + "is given");
				}
		}
		public void clickByLinkText (String lt){
		//verified	
			try {
				driver.findElement(By.linkText(lt)).click();
				}
					
				catch (NoSuchElementException e) {
						System.out.println(" Incorrect link text" + lt + "is given");
				}
		}
		public void enterByName (String name , String value){
		//verified	
			try {
				driver.findElementByName(name).sendKeys(value);
				}
					
				catch (NoSuchElementException e) {
						System.out.println(" The element with name " + name + "is not found");
				}
		}
		public void enterById (String id , String value){
		//verified	
			try {
				driver.findElementById(id).sendKeys(value);
				}
					
				catch (NoSuchElementException e) {
						System.out.println(" The element with id " + id + "is not found");
				}
		}
		public void enterByClassName (String classname , String value){
			
			try {
				driver.findElementByClassName(classname).sendKeys(value);
				}
					
				catch (NoSuchElementException e) {
						System.out.println(" The element with classname " + classname + "is not found");
				}
		}
		public void clickByClassName (String classname ){
		//verified	
			try {
				driver.findElementByClassName(classname).click();
				}
					
				catch (NoSuchElementException e) {
						System.out.println(" The element with classname " + classname + "is not found");
				}
		}
	}
