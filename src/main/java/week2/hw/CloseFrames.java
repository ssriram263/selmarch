package week2.hw;

import org.openqa.selenium.chrome.ChromeDriver;

public class CloseFrames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeDriver driver= new ChromeDriver();
		
		driver.get("http://layout.jquery-dev.com/demos/iframe_local.html");
		
		driver.findElementByXPath("/html/body/div[1]/p[1]/button").click();
		
		driver.findElementByXPath("/html/body/div[2]/p/button").click();
		
		driver.switchTo().frame("childIframe");
		
		driver.findElementByXPath("/html/body/div[2]/p/button").click();
		
		driver.findElementByXPath("/html/body/div[3]/p/button").click();
	}

}
