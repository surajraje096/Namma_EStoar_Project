package com.amazon.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amazon.qa.actiondriver.Action;
import com.amazon.qa.base.TestBase;

public class shipingPage extends TestBase{
	
	@FindBy(xpath="(//input[@class='btn btn-primary'])[3]")
	WebElement proccedtocheckedbtn;
	
	public shipingPage() {
		PageFactory.initElements(driver, this);
	}
	
	public PaymentPage clickonCheckout() throws Throwable {
		Thread.sleep(3000);
		 Action.click(driver, proccedtocheckedbtn);
		 Thread.sleep(3000);
		 return new PaymentPage();
	}

}
