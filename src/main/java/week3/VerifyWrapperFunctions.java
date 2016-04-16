package week3;

import org.junit.Test;

public class VerifyWrapperFunctions extends Wrapper {
	
	@Test
	public void verifyFunctions() throws InterruptedException{
		
		//launchApp("chrome", "https://www.irctc.co.in/eticketing/userSignUp.jsf");
		
		//selectValueByIndex("userRegistrationForm:securityQ", 3);
		
		//launchApp("chrome", "http://layout.jquery-dev.com/demos/iframe_local.html");
		
		//switchToFirstFrame();
		
		//switchToFrameByElement("childIframe");
		
		//clickByXPath("/html/body/div[2]/p/button");
		
		launchApp("chrome", "http://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
		
		switchToFrameByElement("iframeResult");
		
		clickByXPath("/html/body/button");
		
		Thread.sleep(1000);
		
		//acceptAlert();
		
		dismissAlert();
		
		
	}

}
