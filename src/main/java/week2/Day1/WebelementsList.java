package week2.Day1;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebelementsList {

		public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeDriver driver= new ChromeDriver();
		
		driver.get("https://www.google.co.in/");
		
		List<WebElement> quote =driver.findElementsByTagName("a");
		
		//List<WebElement> links = driver.fin
		
		System.out.println(quote.size());
		
		for (WebElement iterator : quote) {
			
			System.out.println(iterator.getText());
			
			if(iterator.getText().contains("c") && (iterator.getLocation().getX()>50) && (iterator.getSize().getWidth()>20)){
				
				System.out.println(iterator.getText());
				
				iterator.click();
				
				break;
						
					}
				}
			}	
	}