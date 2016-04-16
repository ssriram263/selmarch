package week1.hw;

import org.openqa.selenium.firefox.FirefoxDriver;

public class DeveloperForce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FirefoxDriver driver = new FirefoxDriver();
		
		// TO ENTER URL
		
		driver.get("https://developer.salesforce.com");
		
		//TO MAXIMIZE WINDOW
		driver.manage().window().maximize();
		
		// to click sign up
		
		driver.findElementByXPath("/html/body/div[3]/header/div/div/div/div[1]/div[1]/div[1]/a").click();
		
		driver.findElementById("first_name").sendKeys("sri");
		
		driver.findElementById("last_name").sendKeys("ram");
		
		driver.findElementById("email").sendKeys("test@gmail.com");
		
		driver.findElementById("job_role").sendKeys("Business Manager/Executive");
		
		driver.findElementById("company").sendKeys("TCS");
		
		driver.findElementById("country").sendKeys("India");
		
		driver.findElementById("postal_code").sendKeys("600004");
		
		driver.findElementById("username").sendKeys("test@gmail.com");
		
		driver.findElementById("eula").click();
		
		driver.findElementById("submit_btn").click();
		
	}

}
