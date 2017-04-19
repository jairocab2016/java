package com.notodocodigo.selenium.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NoTodoCodigoPage {

	private final WebDriver driver;

	public NoTodoCodigoPage(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 8);
		wait.until(ExpectedConditions.titleContains("No todo código"));
		this.driver = driver;
	}
	
	public String getTitle() {
		return driver.getTitle();
	}
	
}