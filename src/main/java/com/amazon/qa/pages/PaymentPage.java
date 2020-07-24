package com.amazon.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amazon.qa.actiondriver.Action;
import com.amazon.qa.base.TestBase;

public class PaymentPage extends TestBase{
	@FindBy(xpath="(//input[@class='btn btn-primary'])[3]")
	WebElement proccedtocheckedbtn;
	
	@FindBy(xpath="//input[@type='checkbox']")
	WebElement turm;
	
	
	
	public PaymentPage() {
		PageFactory.initElements(driver, this);
	}
	
	public OrderConfirmationPage clickonCheckout() throws Throwable {
		Thread.sleep(3000);
		Action.click(driver, turm);
		Thread.sleep(3000);
		 Action.click(driver, proccedtocheckedbtn);
		 return new OrderConfirmationPage();
	}


	

}
