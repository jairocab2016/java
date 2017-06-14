package selenium;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.*;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class TestSigmaViejo {

	public static void main(String[] arg) throws MalformedURLException {

		WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), DesiredCapabilities.chrome());
		String url = "https://192.168.5.45/";
		driver.get(url);
		driver.findElement(By.cssSelector("input[name=\"login\"]")).clear();
		driver.findElement(By.cssSelector("input[name=\"login\"]")).sendKeys("jcardozo");
		driver.findElement(By.cssSelector("input[name=\"password\"]")).clear();
		driver.findElement(By.cssSelector("input[name=\"password\"]")).sendKeys("jcardozo");
		driver.findElement(By.name("submitlogin")).click();
		
		driver.findElement(By.xpath(".//*[@id='Stm0p0i4eTX']")).click();
		driver.findElement(By.xpath(".//*[@id='Stm0p18i0eTX']")).click();
		
		for (int i = 0; i < 20; i++) {
			
			driver.findElement(By.name("usuario")).clear();
			driver.findElement(By.name("usuario")).sendKeys("jairo");
			driver.findElement(By.name("submitbusqueda")).click();
		}
		
		
		
	}

}