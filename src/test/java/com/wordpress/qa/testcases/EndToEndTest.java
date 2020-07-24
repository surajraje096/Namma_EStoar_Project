package com.wordpress.qa.testcases;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.amazon.qa.base.TestBase;
import com.amazon.qa.pages.AddressPage;
import com.amazon.qa.pages.AddtocartPage;
import com.amazon.qa.pages.DeliveryDetailsPage;
import com.amazon.qa.pages.DeliveryMethodPage;
import com.amazon.qa.pages.IndexPage;
import com.amazon.qa.pages.OrderPage;
import com.amazon.qa.pages.PaymentPage;
import com.amazon.qa.pages.SearchResultPage;
import com.amazon.qa.pages.shipingPage;

import com.amazon.qa.util.testUtil;
import com.amazon.qa.pages.LoginPage;
import com.amazon.qa.pages.OrdearSummaryPage;
import com.amazon.qa.pages.OrderConfirmationPage;
public class EndToEndTest extends TestBase{
	
	IndexPage IndexPag;
	SearchResultPage SearchResultPage;
	AddtocartPage AddtocartPage;
	OrderPage OrderPage;
	LoginPage LoginPage;
	AddressPage AddressPage;
	shipingPage shipingPage;
    PaymentPage PaymentPage;
    OrdearSummaryPage OrdearSummaryPage; 
    OrderConfirmationPage OrderConfirmationPage;
    DeliveryDetailsPage DeliveryDetailsPage;
    DeliveryMethodPage DeliveryMethodPage;
 
    
	@BeforeMethod
	public void setup() {
		initialization();
	}

	@AfterMethod
	public void teardown() {
		driver.quit();
	}

	@Test(priority=1)
	public void EndtoEndTest() throws Throwable {
		IndexPag = new IndexPage();
		SearchResultPage = IndexPag.SearchProduct(prop.getProperty("Product"));
		AddtocartPage = SearchResultPage.clickonProduct();
		LoginPage=AddtocartPage.clicktocartbtn();
	
		Thread.sleep(3000);
		
		AddressPage=LoginPage.login1();
		DeliveryDetailsPage=AddressPage.clickonCheckout();
		DeliveryMethodPage=DeliveryDetailsPage.clickonCheckout();
		shipingPage=DeliveryMethodPage.clickonCheckout();
		PaymentPage=shipingPage.clickonCheckout();
		OrderConfirmationPage=PaymentPage.clickonCheckout();
		OrderConfirmationPage.validateconfurmmsg();
	
	}
	
}
