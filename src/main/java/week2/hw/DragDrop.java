package week2.hw;

import org.openqa.selenium.chrome.ChromeDriver;

public class DragDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Set the system properties
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			
		// Launch Browser - Google Chrome
			ChromeDriver driver = new ChromeDriver();

		// Maximize the browser
			driver.manage().window().maximize();

		// Navigate to URL
			driver.get("http://jqueryui.com/");
			
		// click draggable
			driver.findElementByLinkText("Draggable").click();
			
		// switch to draggable frame
			driver.switchTo().frame(driver.findElementByClassName("demo-frame"));
			
		// print contents inside draggable frame
			System.out.println(driver.findElementByTagName("p").getText());
			
		// go to browser
			driver.switchTo().defaultContent();
			
		//click droppable
			driver.findElementByLinkText("Droppable").click();
			
	}

}
