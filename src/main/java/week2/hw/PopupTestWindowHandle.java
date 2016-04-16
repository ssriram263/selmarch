package week2.hw;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class PopupTestWindowHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		ChromeDriver driver= new ChromeDriver();
		
		driver.get("http://popuptest.com/");
		
		//System.out.println(driver.getWindowHandle());
		
		driver.findElementByLinkText("Multi-PopUp Test #2").click();
		
		String parentWindow = driver.getWindowHandle();
		
		//System.out.println(parentWindow);
		
		
		Set <String> allWindows = driver.getWindowHandles();
		
		System.out.println("No of windows :: " +allWindows.size());
		
		for (String eachWindow : allWindows) {
			
			driver.switchTo().window(eachWindow);
			
			System.out.println("Handle of each window :: " + driver.getWindowHandle());
			if (!driver.getWindowHandle().equals(parentWindow))
			{
				driver.close();
			}
		
			
		}
		driver.switchTo().window(parentWindow);
		
		System.out.println("The title of parent window is :: "+ driver.getTitle());
		
		System.out.println("The handle of parent window is :: " + parentWindow);

	}

}
