package selenium;

//import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
//import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.support.ui.Select;

public class AutomatizacionModuloConfiguracion {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "https://sr-sigmafront-ad01/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testAutomatizacionModuloConfiguracion() throws Exception {
    driver.get(baseUrl + "/auth/login");
    driver.findElement(By.name("email")).clear();
    driver.findElement(By.name("email")).sendKeys("admin@gmail.com");
    driver.findElement(By.name("password")).clear();
    driver.findElement(By.name("password")).sendKeys("123456");
    driver.findElement(By.name("remember")).click();
    driver.findElement(By.cssSelector("button.btn.btn-primary")).click();
    driver.findElement(By.linkText("Toggle navigation")).click();
    driver.findElement(By.xpath("//li[3]/a/span")).click();
    driver.findElement(By.linkText("Transponder")).click();
    driver.findElement(By.id("community_read")).clear();
    driver.findElement(By.id("community_read")).sendKeys("wqereq");
    driver.findElement(By.id("time_limit")).clear();
    driver.findElement(By.id("time_limit")).sendKeys("1345");
    driver.findElement(By.name("prefijo")).clear();
    driver.findElement(By.name("prefijo")).sendKeys("1234");
    driver.findElement(By.xpath("(//button[@type='button'])[3]")).click();
    driver.findElement(By.xpath("//button[@type='submit']")).click();
    
    for (int second = 0;; second++) {
    	if (second >= 60) fail("timeout");
    	try { 
    		if (isElementPresent(By.xpath("//div[@id='topAlert']/div"))) break; 
    	} catch (Exception e) {
    		
    	}
    	Thread.sleep(1000);
    }

    try {
      assertEquals("Se actualiza la informacion.", driver.findElement(By.cssSelector("div.errorText > div")).getText());
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    
    String mensaje = driver.findElement(By.cssSelector("div.errorText > div")).getText();
    
    driver.findElement(By.cssSelector("button.close")).click();
    driver.findElement(By.xpath("//li/a/span")).click();
    driver.findElement(By.linkText("Salir")).click();
  }

  @After
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}
