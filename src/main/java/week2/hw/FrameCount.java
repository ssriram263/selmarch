package week2.hw;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		ChromeDriver driver= new ChromeDriver();
		
		driver.get("http://layout.jquery-dev.com/demos/iframes_many.html");
		
		driver.manage().window().maximize();
		System.out.println(driver.findElementByTagName("iframe").isDisplayed());
		List<WebElement> allFrames = driver.findElementsByTagName("iframe");
		
		int count = 0;
				
		for (WebElement iterator : allFrames) {
			
			driver.switchTo().frame(iterator);
			List<WebElement> childFrames = driver.findElementsByTagName("iframe");
			
			for (WebElement iterator1 : childFrames) {
				
				count++;
				driver.switchTo().defaultContent();
				
			}
			count++;
			driver.switchTo().defaultContent();
			
			
			/*if(IsElementPresent(iterator))
			{
				count++;
				driver.switchTo().defaultContent();
				break;
			}*/
			//if(driver.findElementByTagName("iframe") != null)
			//{
				//count = count +1;
			//}
				/*if(driver.findElementByTagName("iframe").isEnabled())
				{
					count++;
			
					driver.switchTo().defaultContent();
				}
				
				else {
					driver.switchTo().defaultContent();
				}*/
				
			
		
			
		
		
		}
		System.out.println("Total number of frames are :: " +count);
	}

	}

