package selenium;

//import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
//import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.support.ui.Select;

public class TestCase1 {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\jjcardozo\\Downloads\\seleniumjava\\chromedriver.exe");
    driver = new ChromeDriver();
    baseUrl = "http://sr-sigmafront-ad01/";
    driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
  }

  @Test
  public void testCase2() throws Exception {
    driver.get(baseUrl + "/auth/login");
    driver.findElement(By.name("email")).clear();
    driver.findElement(By.name("email")).sendKeys("admin@gmail.com");
    driver.findElement(By.name("password")).clear();
    driver.findElement(By.name("password")).sendKeys("123456");
    driver.findElement(By.cssSelector("button.btn.btn-primary")).click();
    driver.findElement(By.linkText("Toggle navigation")).click();
    driver.findElement(By.linkText("Administración")).click();
    driver.findElement(By.linkText("CTMS")).click();
    driver.findElement(By.id("cmts-search")).clear();
    driver.findElement(By.id("cmts-search")).sendKeys("CMT2.CBS1-E6K");
    driver.findElement(By.id("cmts-search")).sendKeys(Keys.ENTER);
    
    driver.findElement(By.id("cmts-search")).clear();
    driver.findElement(By.id("cmts-search")).sendKeys("10.100.152.17");
    driver.findElement(By.id("cmts-search")).sendKeys(Keys.ENTER);
    driver.findElement(By.id("cmts-search")).clear();
    driver.findElement(By.id("cmts-search")).sendKeys("10.100.150.176");
    driver.findElement(By.id("cmts-search")).sendKeys(Keys.ENTER);
    
    driver.findElement(By.id("cmts-search")).clear();
    driver.findElement(By.id("cmts-search")).sendKeys("test");
    driver.findElement(By.id("cmts-search")).sendKeys(Keys.ENTER);
    
    driver.findElement(By.id("cmts-search")).clear();
    driver.findElement(By.id("cmts-search")).sendKeys("testing");
    driver.findElement(By.id("cmts-search")).sendKeys(Keys.ENTER);
    
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

  @SuppressWarnings("unused")
private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  @SuppressWarnings("unused")
private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  @SuppressWarnings("unused")
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