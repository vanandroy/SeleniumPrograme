package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsExamp {
	static{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.vtiger.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Actions a=new Actions(driver);
		
		WebElement prdt = driver.findElement(By.partialLinkText("Products"));
		a.moveToElement(prdt).perform();
		driver.findElement(By.partialLinkText("What's New")).click();
		String title = driver.getTitle();
		System.out.println(title);
		WebElement search = driver.findElement(By.id("search"));
		a.doubleClick(search).perform();
		Thread.sleep(6000);
		WebElement tpt = driver.findElement(By.partialLinkText("Take product tour"));
				a.contextClick(tpt).perform();
				//Thread.sleep(3000);
		driver.close();
	}

}
