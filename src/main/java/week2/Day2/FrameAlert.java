/**
 * 
 */
package week2.Day2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author Sriram
 *
 */
public class FrameAlert {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeDriver driver= new ChromeDriver();
		
		driver.get("http://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
		
		driver.switchTo().frame("iframeResult");
		
		driver.findElementByTagName("button").click();
		
		Alert a = driver.switchTo().alert();
		
		a.dismiss();
		
		System.out.println(driver.findElementById("demo").getText());
			
	}

}
