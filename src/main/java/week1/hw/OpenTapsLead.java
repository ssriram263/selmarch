package week1.hw;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenTapsLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// To open firefox browser
				FirefoxDriver driver = new FirefoxDriver();
				
				// TO ENTER URL
				
				driver.get("http://demo1.opentaps.org");
				
				//TO MAXIMIZE WINDOW
				driver.manage().window().maximize();
				
				//TO WAIT TILL PAGE LOADS
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				
				// TO ENTER USERNAME
				driver.findElementById("username").sendKeys("DemoSalesManager");
				
				// TO ENTER PWD
				driver.findElementByName("PASSWORD").sendKeys("crmsfa");
				
				// TO CLICK LOGIN BUTTON
				driver.findElementByClassName("decorativeSubmit").click();
				
				// to click CRM / SFA
				
				driver.findElementByLinkText("CRM/SFA").click();
				
				// to click create lead
				
				driver.findElementByLinkText("Create Lead").click();
				
				// to enter company name
				
				driver.findElementById("createLeadForm_companyName").sendKeys("TCS");
				
				// to enter first name
				
				driver.findElementById("createLeadForm_firstName").sendKeys("SRI");
						
				// to enter last name
				
				driver.findElementById("createLeadForm_lastName").sendKeys("RAM");	
				
				// to click create lead button
				
				driver.findElementByName("submitButton").click();
	}

}
