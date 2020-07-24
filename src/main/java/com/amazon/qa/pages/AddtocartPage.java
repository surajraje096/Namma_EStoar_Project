package com.amazon.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.amazon.qa.actiondriver.Action;
import com.amazon.qa.base.TestBase;
import com.amazon.qa.pages.OrderPage;

public class AddtocartPage extends TestBase{
	
	@FindBy(id="quantity_wanted") 
	WebElement quantity;
	
	@FindBy(xpath="(//i[contains(@class,'fa fa-shopping-basket')])[1]") 
	WebElement cart;
	
	@FindBy(xpath="(//a[contains(@class,'btn btn-default')])[2]") 
	WebElement checkout;
	
	@FindBy(id="group_1")
	WebElement size;
	
	@FindBy(xpath="(//a[contains(@class,'btn btn-default')])[2]")
	WebElement addtocartbtn;
	
	@FindBy(xpath="//*[@id=\"layer_cart\"]//h2/i")
	WebElement addtocartmsg;
	

	
	public AddtocartPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void EnterQuantity(String quantity1) throws Throwable {
		 Action.type(quantity, quantity1);
	}
	
	public void selectsize() throws Throwable {
		Select select = new Select(driver.findElement(By.id("group_1")));
		select.selectByVisibleText("L");
	}

	public  LoginPage clicktocartbtn() throws Throwable {
		   Thread.sleep(3000);
	    Action.click(driver, cart);
	    Thread.sleep(3000);
	    Action.click(driver, checkout);
	    return new LoginPage();
	}
	
	public boolean validatetocart() throws Throwable {
		Thread.sleep(5000);
	   return Action.isDisplayed(driver, addtocartmsg);
	}
	


}
