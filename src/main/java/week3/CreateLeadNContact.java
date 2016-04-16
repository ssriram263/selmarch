package week3;

import org.junit.Test;

public class CreateLeadNContact extends Wrapper {
	
	
	@Test
	public void login() throws InterruptedException{
		
		launchApp("chrome","http://demo1.opentaps.org/opentaps/control/main");
		enterById("username", "DemoSalesManager");
		enterByName("PASSWORD", "crmsfa");
		clickByXPath("//*[@id='login']/p[3]/input");
		clickByXPath("//*[@id='label']/a");
		Thread.sleep(5000);
		clickByLinkText("Create Lead");
		enterById("createLeadForm_companyName", "TCS");
		enterById("createLeadForm_firstName", "sri");
		enterById("createLeadForm_lastName", "ram");
		clickByClassName("smallSubmit");
		clickByLinkText("My Home");
		clickByLinkText("Create Contact");
		enterById("firstNameField", "sri");
		enterById("lastNameField", "ram");
		clickByClassName("smallSubmit");
		
	}

}
