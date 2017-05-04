package selenium;

import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Configuraciones {
	private WebDriver driver;
	private String baseUrl;
	private boolean acceptNextAlert = true;
	private StringBuffer verificationErrors = new StringBuffer();

	@Before
	public void setUp() throws Exception {
		driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), DesiredCapabilities.chrome());
		baseUrl = "http://sr-sigmafront-ad01/";
	}

	@Test
	public void testConfiguraciones() throws Exception {
		
		driver.get(baseUrl + "/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.name("email")).clear();
	    driver.findElement(By.name("email")).sendKeys("admin@gmail.com");
	    driver.findElement(By.name("password")).clear();
	    driver.findElement(By.name("password")).sendKeys("123456");
	    driver.findElement(By.cssSelector("button.btn.btn-primary")).click();
	    
	    driver.findElement(By.linkText("Toggle navigation")).click();
	    driver.findElement(By.xpath("//li[3]/a/span")).click();
	    
	    WebElement element = driver.findElement(By.xpath(".//*[@id='configuration-tabs']/li[2]/a"));
	    JavascriptExecutor executor = (JavascriptExecutor)driver;
	    executor.executeScript("arguments[0].click();", element);
	    
//	    WebElement comLectura = driver.findElement(By.xpath(".//*[@id='community_read']"));
//	    comLectura.clear();
//	    comLectura.sendKeys("2132123");
//	    
//	    WebElement ventaHabilitacion = driver.findElement(By.xpath(".//*[@id='time_limit']"));
//	    ventaHabilitacion.clear();
//	    ventaHabilitacion.sendKeys("123");
//	    
//	    WebElement prefiMac = driver.findElement(By.xpath(".//*[@id='mac-prefix-template']/div[1]/div/input"));
//	    prefiMac.clear();
//	    prefiMac.sendKeys("AAA113");
//	    //prefiMac.submit();
//	    //driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//	    	    
//	    //driver.findElement(By.xpath(".//*[@id='mac-prefix-template']/div[1]/div/span/button")).click();
	    
	    driver.findElement(By.xpath(".//*[@id='mac-prefix-template']/div[1]/div/span/button")).click();
	    
	    //boolean confirma = driver.findElement(By.xpath(".//*[@id='topAlert']/div")).isDisplayed();
	    
	    
				
	}

	@After
	public void tearDown() throws Exception {
		//driver.quit();
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
