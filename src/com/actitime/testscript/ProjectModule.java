package com.actitime.testscript;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ProjectModule {
		@Test(priority=1,groups={"smoke test","regression test"})
		public void createProject() {
			Reporter.log("createProject",true);
		}
		@Test(priority=2,dependsOnMethods = "createProject",groups={"smoke test"})
		public void modifyProject() {
			Reporter.log("modifyProject",true);
		}
		@Test(priority=3,dependsOnMethods = { "createProject","modifyProject"},groups={"regression test"})
		public void deleteProject() {
			Reporter.log("deleteProject",true);
		}
		}


