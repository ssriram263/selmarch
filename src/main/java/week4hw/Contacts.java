package week4hw;

import java.io.IOException;

import org.junit.Test;

public class Contacts extends WrapperClass {
@Test
	public void CreateContact() throws IOException{
		
		String browser = readCellFromExcel1("TC1",1,0); 
		String URL = readCellFromExcel1("TC1", 1, 1);
		String username = readCellFromExcel1("TC1", 1, 2);
		String pwd = readCellFromExcel1("TC1", 1, 3);
		String fname = readCellFromExcel1("TC1", 1, 4);
		String lname = readCellFromExcel1("TC1", 1, 5);
		launchapp(browser,URL);
		enterById("username", username);
		enterById("password", pwd);
		clickByClassName("decorativeSubmit");
		clickByLinkText("CRM/SFA");
		clickByLinkText("Create Contact");
		enterById("firstNameField", fname);
		enterById("lastNameField", lname);
		clickByClassName("smallSubmit");
		clickByLinkText("Find Contacts");
		enterByXpath("//div[@class='x-form-item x-tab-item'][2]/div/input", fname);
		System.out.println(readByLocator("//div[@class='x-form-item x-tab-item'][2]/div/input"));
		System.out.println("done");
		//clickByXpath("//div[@class='x-panel-footer x-panel-footer-noborder']/div/div/table/tbody/tr/td/table/tbody/tr/td[2]/em/button");
		//String cid = readByLocator("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a");
		//System.out.println(cid);
	}

}
