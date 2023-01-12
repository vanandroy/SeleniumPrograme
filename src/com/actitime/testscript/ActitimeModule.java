package com.actitime.testscript;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClassSoftCore;

public class ActitimeModule extends BaseClassSoftCore {
	@Test
	public void actiTime() {
		Reporter.log("Acti time",true);

	}
}
