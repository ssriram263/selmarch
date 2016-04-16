package week1;

import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginOpenTaps {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "http://demo1.opentaps.org/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testLogin() throws Exception {
    driver.get(baseUrl + "/opentaps/control/main");
    driver.findElement(By.id("username")).clear();
    driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
    driver.findElement(By.id("password")).clear();
    driver.findElement(By.id("password")).sendKeys("crmsfa");
    driver.findElement(By.cssSelector("input.decorativeSubmit")).click();
    driver.findElement(By.cssSelector("input.decorativeSubmit")).click();
  }

  @After
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }
}

