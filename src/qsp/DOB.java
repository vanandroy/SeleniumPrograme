package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DOB {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		driver.findElement(By.linkText("Create New Account")).click();
		Thread.sleep(3000);
		WebElement dateList = driver.findElement(By.id("day"));
		Select s=new Select(dateList);
		s.selectByIndex(5);
		//s.selectByValue("7");
		//s.selectByVisibleText("8");
		//Thread.sleep(3000);
		WebElement monthList = driver.findElement(By.id("month"));
		Select m=new Select(monthList);
		//m.selectByIndex(1);
		m.selectByValue("3");
		//m.selectByVisibleText("Apr");
		//Thread.sleep(3000);
		WebElement yearList = driver.findElement(By.id("year"));
		Select y=new Select(yearList);
		//y.selectByIndex(12);
		//y.selectByValue("1998");
		y.selectByVisibleText("1999");

Thread.sleep(5000);
		driver.close();

	}

}
