package com.actitime.testscript;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class GroupingCls2 {
	@Test(priority=1,groups={"smoke test","regression test"})
	public void createProject() {
		Reporter.log("createProject",true);
	}
	@Test(priority=2,groups={"smoke test"})
	public void modifyProject() {
		Reporter.log("modifyProject",true);
	}
	@Test(priority=3,groups={"regression test"})
	public void deleteProject() {
		Reporter.log("deleteProject",true);
	}
			}




