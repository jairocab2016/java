package com.notodocodigo.selenium;

import java.net.MalformedURLException;
import java.net.URL;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;
import com.notodocodigo.selenium.pageobjects.GoogleHomePage;
import com.notodocodigo.selenium.pageobjects.GoogleResultsPage;
import com.notodocodigo.selenium.pageobjects.NoTodoCodigoPage;

public class BuscarNotodocodigoTestIT {
	
	private static final String NOTODO = "No todo c�digo";
	
	private WebDriver driver;
	
	@Before
	public void setUp() throws MalformedURLException {
		
		//this.driver = new InternetExplorerDriver();
		  driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), DesiredCapabilities.chrome());
	}
	
	@After
	public void tearDown() {
		driver.quit();
		driver = null;
	}
	
	/**
	 * Comprueba que buscando el nombre de la p�gina y pulsando en 
	 * 'Voy a tener suerte' va a la Web
	 */
	@Test
	public void testVoyATenerSuerte() {
		driver.get("http://www.google.com/webhp?complete=0");
		GoogleHomePage page = PageFactory.initElements(driver, GoogleHomePage.class);
		NoTodoCodigoPage noTodoCodigo = page.voyATenerSuerte(NOTODO);
		System.out.println(noTodoCodigo.getTitle());
		Assert.assertTrue(noTodoCodigo.getTitle().startsWith(NOTODO));
	}
	
	/**
	 * Comprueba que buscando el nombre de la p�gina aparece en primer lugar.
	 */
	@Test
	public void testPrimerResultado() {
		driver.get("http://www.google.com");
		GoogleHomePage page =  PageFactory.initElements(driver, GoogleHomePage.class);
		GoogleResultsPage result = page.buscar(NOTODO);
		Assert.assertTrue(result.notodocodigoPrimero());
	}

}