package com.amazon.qa.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amazon.qa.actiondriver.Action;
import com.amazon.qa.base.TestBase;

public class SearchResultPage extends TestBase{
	@FindBy(xpath="(//img[@class='img-responsive'])[1]")
	WebElement productresult;
	
	@FindBy(xpath="(//button[contains(@class,'btn btn-primary')])[1]")
	WebElement addTocart;
	
	@FindBy(xpath="//button[contains(@class,'btn btn-primary')]")
	WebElement cartbtn;
	
	@FindBy(xpath="(//a[contains(@class,'btn btn-default')])[2]")
	WebElement Checkout;
	
	public SearchResultPage() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean isproductavailable() throws Throwable {
		return Action.isDisplayed(driver, productresult);
	}
	
	public AddtocartPage clickonProduct() throws Throwable {
	
		Action.click(driver, addTocart);
		Thread.sleep(3000);
		Action.click(driver, cartbtn);
		return new AddtocartPage();
	}

}
