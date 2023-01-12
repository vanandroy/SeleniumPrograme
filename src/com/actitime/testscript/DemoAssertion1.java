package com.actitime.testscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class DemoAssertion1 {
static {
	//System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	System.setProperty("webdriver.edge.driver", "./driver/msedgedriver.exe");
}
@Test
public void verifyTitle() {
	//WebDriver driver=new ChromeDriver();
	WebDriver driver=new EdgeDriver();
	driver.get("https://www.google.com/");
	String eTitle = "Google";
	String aTitle = driver.getTitle();
	SoftAssert s=new SoftAssert();
	s.assertEquals(eTitle, aTitle);
	driver.close();
	s.assertAll();
}
}
