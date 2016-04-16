package week1;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.firefox.*;
public class LoginOpenTaps_WebDriver {

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
		
		//TO PRINT PAGE TITLE
		System.out.println(driver.getTitle());
		
		// TO ENTER USERNAME
		driver.findElementById("username").sendKeys("DemoSalesManager");
		
		// TO ENTER PWD
		driver.findElementByName("PASSWORD").sendKeys("crmsfa");
		
		// TO CLICK LOGIN BUTTON
		driver.findElementByClassName("decorativeSubmit").click();
		
		// TO CLICK LOGOUT BUTTON
		driver.findElementByXPath("//*[@id='logout']/input").click();
		
		// TO PRINT PAGE TITLE
		System.out.println(driver.getTitle());
		
		// TO CLOSE THE BROWSER
		driver.close();
	}

}
