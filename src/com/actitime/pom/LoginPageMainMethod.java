package com.actitime.pom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPageMainMethod {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		LoginPage lg=new LoginPage(driver);
		lg.setUser("admin");
		lg.setpwd("manager");
		lg.setlgn();
		Thread.sleep(3000);
		LogoutPage lgo=new LogoutPage(driver);
		lgo.setlgout();
		driver.close();
		System.out.println("ok");
	}

}
