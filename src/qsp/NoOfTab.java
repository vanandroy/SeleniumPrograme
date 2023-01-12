package qsp;

import java.awt.dnd.DragGestureEvent;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NoOfTab {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.xpath("//a[text()='actiTIME Inc.']")).click();
	
		Set<String> tab = driver.getWindowHandles();
		int count = tab.size();
		System.out.println(count);
		for(String t:tab) {
			System.out.println(t);
			driver.switchTo().window(t);
			List<WebElement> drop = driver.findElements(By.xpath("//span[text()='Features']/../../li/span"));
			for(WebElement d:drop) {
				String text = d.getText();
				System.out.println(text);
			}
			driver.close();
		}
		
	}

}
