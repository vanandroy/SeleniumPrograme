package com.actitime.testscript;

import org.testng.Reporter;
import org.testng.annotations.*;

public class CustomerModuleAnno {
	@BeforeClass
	public void openBrowser() {
		Reporter.log("Open Browser",true);
	}
	@AfterClass
	public void closeBrowser() {
		Reporter.log("Close Browser",true);
	}
	@BeforeMethod
	public void login() {
		Reporter.log("login",true);
	}
	@AfterMethod
	public void logout() {
		Reporter.log("logout",true);
	}
	@Test(priority=1,invocationCount = 2)
	public void editCustomer() {
		Reporter.log("Edit Customer",true);
	}
	@Test
	public void registerCustomer() {
		Reporter.log("Register Customer",true);
	}
	@Test
	public void deleteCustomer() {
		Reporter.log("Delete Customer",true);
	}

}
