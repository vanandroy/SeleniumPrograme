package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoLogin {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		Thread.sleep(1000);	
		driver.findElement(By.name("username")).sendKeys("admin");
		Thread.sleep(1000);	
		driver.findElement(By.name("pwd")).sendKeys("manager");
		Thread.sleep(1000);	
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		Thread.sleep(1000);	
		driver.findElement(By.id("logoutLink")).click();
		Thread.sleep(1000);	
		driver.close();


	}

}
