/**
 * 
 */
package com.amazon.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amazon.qa.actiondriver.Action;
import com.amazon.qa.base.TestBase;


public class HomePage extends TestBase {
	
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnProfile() throws Throwable {
		driver.findElement(By.xpath("//i[contains(@class,'fa fa-user')]")).click();
		driver.findElement(By.xpath("(//ul[@class='dropdown-menu']//a)[1]")).click();
	}
	
	public void fillForm() throws InterruptedException {
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


	public String currenturl() {
		String currenturl=driver.getCurrentUrl();
		return currenturl;
		
	}


}
