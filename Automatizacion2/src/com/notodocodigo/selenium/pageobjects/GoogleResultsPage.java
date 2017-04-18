package com.notodocodigo.selenium.pageobjects;

import java.util.List;

import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GoogleResultsPage {

	private final WebDriver driver;
	
	@FindBy(how = How.XPATH, using="//h3[@class='r']/a")
	List<WebElement> resultsTitle;
	
	public GoogleResultsPage(WebDriver driver) {
		this.driver = driver;
		
		try { 
			WebDriverWait wait = new WebDriverWait(this.driver, 8);
			wait.until(ExpectedConditions.titleContains("Buscar con Google"));
		} catch (TimeoutException e) {
			throw new IllegalStateException("No es Google!");
		}
	}

	public boolean notodocodigoPrimero() {
		return resultsTitle.get(0).getText().startsWith("No todo código");
	}
	
}