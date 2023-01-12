package com.actitime.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LogoutPage {
private WebElement lgout;

public LogoutPage(WebDriver driver) {
	lgout=driver.findElement(By.id("logoutLink"));
}
public void setlgout() {
	lgout.click();
}
}
