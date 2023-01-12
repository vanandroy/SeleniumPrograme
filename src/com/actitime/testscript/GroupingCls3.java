package com.actitime.testscript;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class GroupingCls3 {
	@Test(priority=1,groups={"smoke test","regression test"})
	public void createModule() {
		Reporter.log("createModule",true);
	}
	@Test(priority=2,groups={"smoke test"})
	public void modifyModule() {
		Reporter.log("modifyModule",true);
	}
	@Test(priority=3,groups={"regression test"})
	public void deleteModule() {
		Reporter.log("deleteModule",true);
	}
	}
