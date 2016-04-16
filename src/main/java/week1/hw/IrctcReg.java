package week1.hw;

import org.openqa.selenium.firefox.FirefoxDriver;

public class IrctcReg {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		FirefoxDriver driver = new FirefoxDriver();
		
		// TO ENTER URL
		
		driver.get("https://www.irctc.co.in/eticketing/userSignUp.jsf");
		
		//TO MAXIMIZE WINDOW
		driver.manage().window().maximize();
		
		driver.findElementById("userRegistrationForm:userName").sendKeys("ssri263");
		driver.findElementById("userRegistrationForm:password").sendKeys("gmailpass@");
		driver.findElementById("userRegistrationForm:confpasword").sendKeys("gmailpass@");
		driver.findElementById("userRegistrationForm:securityQ").sendKeys("What make was your first car or bike?");
		driver.findElementById("userRegistrationForm:securityAnswer").sendKeys("splendor");
		driver.findElementById("userRegistrationForm:prelan").sendKeys("English");
		driver.findElementById("userRegistrationForm:firstName").sendKeys("sriram");
		driver.findElementById("userRegistrationForm:lastName").sendKeys("somasundaram");
		driver.findElementById("userRegistrationForm:gender:0").click();
		driver.findElementById("userRegistrationForm:maritalStatus:0").click();
		driver.findElementById("userRegistrationForm:dobDay").sendKeys("26");
		driver.findElementById("userRegistrationForm:dobMonth").sendKeys("MAR");
		driver.findElementById("userRegistrationForm:dateOfBirth").sendKeys("1989");
		driver.findElementById("userRegistrationForm:occupation").sendKeys("Professional");
		driver.findElementById("userRegistrationForm:email").sendKeys("abc@gmail.com");
		driver.findElementById("userRegistrationForm:mobile").sendKeys("9876543210");
		driver.findElementById("userRegistrationForm:nationalityId").sendKeys("India");
		driver.findElementById("userRegistrationForm:address").sendKeys("4/64, car street");
		driver.findElementById("userRegistrationForm:countries").sendKeys("India");
		driver.findElementById("userRegistrationForm:pincode").sendKeys("600004");
		driver.findElementByTagName("body").click();
		Thread.sleep(5000);
		driver.findElementById("userRegistrationForm:cityName").sendKeys("Chennai");
		driver.findElementByTagName("body").click();
		Thread.sleep(5000);
		driver.findElementById("userRegistrationForm:postofficeName").sendKeys("Mylapore H.O");
		driver.findElementById("userRegistrationForm:landline").sendKeys("9876543210");
		
		

	}

}
