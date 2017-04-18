package com.notodocodigo.selenium.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class GoogleHomePage {

	private final WebDriver driver;

	@FindBy(how = How.NAME, using="q")
	private WebElement campoDeBusqueda;
	
	@FindBy(how = How.NAME, using="btnG")
	private WebElement botonBuscar;
	
	@FindBy(how = How.NAME, using="btnI")
	private WebElement botonVoyATenerSuerte;
	
	public GoogleHomePage(WebDriver driver) {
		this.driver = driver;
		// Comprueba que nos encontramos en la pagina inicial de Google.
		if (!"Google".equals(driver.getTitle())) {
			throw new IllegalStateException("Esta no es la página inicial de Google!");
		}
	}

	public GoogleResultsPage buscar(String cadena) {
		campoDeBusqueda.sendKeys(cadena);
		botonBuscar.submit();
		return  PageFactory.initElements(driver, GoogleResultsPage.class);
	}

	public NoTodoCodigoPage voyATenerSuerte(String searchTerms) {
		campoDeBusqueda.sendKeys(searchTerms);
		botonVoyATenerSuerte.submit();
		return new NoTodoCodigoPage(driver);
	}
	
}