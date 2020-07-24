package com.amazon.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amazon.qa.actiondriver.Action;
import com.amazon.qa.base.TestBase;

public class AddressPage extends TestBase{
	
	@FindBy(xpath="//input[@class='btn btn-primary']")
	WebElement proccedtocheckedbtn;
	
	public AddressPage() {
		PageFactory.initElements(driver, this);
	}
	
	public DeliveryDetailsPage clickonCheckout() throws Throwable {
		Thread.sleep(3000);
		 Action.click(driver, proccedtocheckedbtn);
		 return new DeliveryDetailsPage();
	}

}
