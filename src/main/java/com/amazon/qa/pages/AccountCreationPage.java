package com.amazon.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amazon.qa.actiondriver.Action;
import com.amazon.qa.base.TestBase;

public class AccountCreationPage extends TestBase{
	@FindBy(xpath="//h1[text()='Create an account']")
	WebElement fromtital;
	
	
	public AccountCreationPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void validateAccountCreatpage() throws Throwable {
		Thread.sleep(3000);
		driver.findElement(By.id(prop.getProperty("first"))).sendKeys(config.getProperty("first"));
		driver.findElement(By.id(prop.getProperty("last"))).sendKeys(config.getProperty("last"));
		driver.findElement(By.id(prop.getProperty("email"))).sendKeys(config.getProperty("Email"));
		driver.findElement(By.xpath(prop.getProperty("phone"))).sendKeys(config.getProperty("Phone"));
		driver.findElement(By.id(prop.getProperty("pass"))).sendKeys(config.getProperty("Password"));
		driver.findElement(By.id(prop.getProperty("password"))).sendKeys(config.getProperty("ConPass"));
		driver.findElement(By.xpath(prop.getProperty("subs"))).click();
		driver.findElement(By.xpath(prop.getProperty("turm"))).click();
	}

}
