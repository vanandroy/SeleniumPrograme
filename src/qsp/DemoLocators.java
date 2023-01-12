package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoLocators{static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

}
	public static void main(String[] args) throws InterruptedException {
WebDriver driver=new ChromeDriver();
driver.get("file:///C:/Users/HP/Desktop/demo.html");
Thread.sleep(1000);
driver.findElement(By.tagName("a")).click();
Thread.sleep(1000);
driver.navigate().back();
Thread.sleep(1000);
driver.findElement(By.id("d1")).click();
Thread.sleep(1000);
driver.navigate().back();
Thread.sleep(1000);
driver.findElement(By.name("c1")).click();
driver.close();

	}

}

	
