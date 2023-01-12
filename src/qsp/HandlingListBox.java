package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingListBox {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.linkText("Create New Account")).click();
		Thread.sleep(3000);
		WebElement yearlist = driver.findElement(By.id("year"));
		Select sy=new Select(yearlist);
		sy.selectByVisibleText("1995 ");
		WebElement monthListbx = driver.findElement(By.id("month"));
		Select s=new Select(monthListbx);
		s.selectByIndex(0);
		WebElement dlst = driver.findElement(By.id("day"));
		Select sd=new Select(dlst);
		sd.selectByIndex(5);
		Thread.sleep(8000);
		driver.close();
		
}
}
