package com.actitime.testscript;

import org.testng.Reporter;
import org.testng.annotations.Test;
public class GroupingCls1  {
	@Test(priority=1,groups={"smoke test","regression test"})
	public void createCustomer() {
		Reporter.log("createCustomer",true);
	}
	@Test(priority=2,groups={"regression test"})
	public void modifyCustomer() {
		Reporter.log("modifyCustomer",true);
	}
	@Test(priority=3,groups={"smoke test"})
	public void deleteCustomer() {
		Reporter.log("deleteCustomer",true);
	}
}



