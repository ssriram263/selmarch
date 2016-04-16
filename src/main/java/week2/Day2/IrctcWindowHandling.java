package week2.Day2;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class IrctcWindowHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		ChromeDriver driver= new ChromeDriver();
		
		driver.get("https://www.irctc.co.in/eticketing/loginHome.jsf");
		
		driver.findElementByLinkText("Contact Us").click();
		
		Set <String> allWindows = driver.getWindowHandles();
		
		System.out.println("No of windows" +allWindows.size());
		
		for (String eachWindow : allWindows) {
			
			driver.switchTo().window(eachWindow);
			System.out.println(driver.getWindowHandle());
			
		}

		System.out.println(driver.getCurrentUrl());
	}

}
