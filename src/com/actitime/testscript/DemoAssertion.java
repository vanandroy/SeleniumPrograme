package com.actitime.testscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoAssertion {
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
	Assert.assertEquals(eTitle, aTitle);
	driver.close();
}
}
