package week2.Day1;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		int count = 0;
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeDriver driver= new ChromeDriver();
		
		driver.get("https://www.google.co.in/");
		
		driver.findElementById("lst-ib").sendKeys("sriram", Keys.ENTER);
		
		Thread.sleep(5000);
		
		//driver.findElementByName("btnK").click();
		
		List<WebElement> myname =driver.findElementsByTagName("a");
		
		System.out.println(myname.size());
		
		for (WebElement iterator : myname) {
			
			if(iterator.getText().contains("sriram") || iterator.getText().contains("Sriram") ||iterator.getText().contains("SRIRAM") )
			{
				
				count = count+1;
				
				
			}
			
		}
		System.out.println("The number of links with my name are " + count);

	}

}
