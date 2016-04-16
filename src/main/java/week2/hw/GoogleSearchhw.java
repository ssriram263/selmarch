package week2.hw;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchhw {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		int count = 0;
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeDriver driver= new ChromeDriver();
		
		driver.get("https://www.google.co.in/");
		
		driver.findElementById("lst-ib").sendKeys("sriram", Keys.ENTER);
		
		Thread.sleep(5000);
		
		List<WebElement> myname =driver.findElementsByTagName("a");
		
		for (WebElement iterator : myname) {
			
			if(iterator.getText().contains("Sriram") && iterator.getLocation().getX()>100 && iterator.getSize().getWidth()>20 )
			{
				System.out.println(iterator.getText());
				System.out.println("\n");
				count = count+1;
			}
			
		}
		System.out.println("The number of links with my name are " + count);
	}

}
