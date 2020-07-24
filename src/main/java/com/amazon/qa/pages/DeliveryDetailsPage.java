package com.amazon.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amazon.qa.actiondriver.Action;
import com.amazon.qa.base.TestBase;

public class DeliveryDetailsPage extends TestBase {
	@FindBy(xpath="(//input[@class='btn btn-primary'])[2]")
	WebElement proccedtocheckedbtn;
	
	public DeliveryDetailsPage() {
		PageFactory.initElements(driver, this);
	}
	
	public DeliveryMethodPage clickonCheckout() throws Throwable {
		Thread.sleep(3000);
		 Action.click(driver, proccedtocheckedbtn);
		 return new DeliveryMethodPage();
	}

}
