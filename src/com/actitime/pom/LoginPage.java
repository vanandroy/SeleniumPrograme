package com.actitime.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	private WebElement unbtx; //declaration
	private WebElement pwbtx;
	private WebElement lgbtn;
	public LoginPage(WebDriver driver) {
		unbtx=driver.findElement(By.id("username")); //initialization
		pwbtx=driver.findElement(By.name("pwd"));
		lgbtn=driver.findElement(By.xpath("//div[text()='Login ']"));
	}
	public void setUser(String un) {
		unbtx.sendKeys(un);  //utilization
	}
	public void setpwd(String pw) {
		pwbtx.sendKeys(pw);
	}
	public void setlgn() {
		lgbtn.click();
	}
}
