package week2.hw;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropdownFields {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeDriver driver= new ChromeDriver();
		
		driver.get("https://www.irctc.co.in/eticketing/userSignUp.jsf");
		
		int count = 0;
		
		
		List <WebElement> dropdown =  driver.findElementsByTagName("select");
		
					
		for (WebElement iterator : dropdown) {
			
			count = count +1;
			
				}
		System.out.println("The total number of drop downs are:: " + count);
	}

}
