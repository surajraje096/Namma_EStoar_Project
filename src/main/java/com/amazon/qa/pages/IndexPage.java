package com.amazon.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amazon.qa.actiondriver.Action;
import com.amazon.qa.base.TestBase;

public class IndexPage extends TestBase {

	@FindBy(xpath = "//i[contains(@class,'fa fa-user')]")
	WebElement Profile;
	
	@FindBy(xpath = "(//ul[@class='dropdown-menu']//a)[1]")
	WebElement register;
	
	
	@FindBy(linkText = "Login")
	WebElement signin;

	@FindBy(xpath = "//img[@class='img-responsive logod']")
	WebElement logo;
	
	@FindBy(xpath = "//input[@class='form-control input-lg']")
	WebElement searchProductBox;
	
	@FindBy(xpath = "//i[@class='fa fa-search']")
	WebElement searchBtn;

	public IndexPage() {
		PageFactory.initElements(driver, this);
	}

	public LoginPage clickonsingin() throws Throwable {
		Action.click(driver, Profile);
		Thread.sleep(3000);
		Action.click(driver, signin);
		return new LoginPage();
	}
	
	public LoginPage clickonregister() throws Throwable {
		Action.click(driver, Profile);
		Action.click(driver, register);
		return new LoginPage();
	}
	
	
	
	

	public boolean validatelogo() throws Throwable {
		return Action.isDisplayed(driver, logo);
	}

	public String getmystoarTital() {
		String mystoarTital = driver.getTitle();
		return mystoarTital;
	}
	public SearchResultPage SearchProduct( String productname) throws Throwable {
		Action.type(searchProductBox, productname);
		Action.click(driver, searchBtn);
		Thread.sleep(5000);
		return new SearchResultPage();
	}
	
}
