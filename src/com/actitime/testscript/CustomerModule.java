package com.actitime.testscript;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;

public class CustomerModule  extends BaseClass{
	@Test(priority=1,groups={"smoke test","regression test"})
	public void createCustomer() {
		Reporter.log("createCustomer",true);
	}
	@Test(priority=2,dependsOnMethods = "createCustomer",groups={"regression test"})
	public void modifyCustomer() {
		Reporter.log("modifyCustomer",true);
	}
	@Test(priority=3,dependsOnMethods = { "createCustomer","modifyCustomer"},groups={"smoke test"})
	public void deleteCustomer() {
		Reporter.log("deleteCustomer",true);
	}
}


