package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlesFramesAlt {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/HP/Desktop/Notepad/page1.html");
		driver.findElement(By.id("t1")).sendKeys("a");
		Thread.sleep(3000);
		driver.switchTo().frame("f1");
		driver.findElement(By.id("t2")).sendKeys("b");
		Thread.sleep(3000);
		driver.switchTo().defaultContent();
		driver.findElement(By.id("t1")).sendKeys("c");
		Thread.sleep(3000);
		WebElement fr = driver.findElement(By.xpath("//iframe"));
		driver.switchTo().frame(fr);
		driver.findElement(By.id("t2")).sendKeys("d");
		Thread.sleep(3000);
		driver.close();
		
	}
}
