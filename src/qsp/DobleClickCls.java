package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DobleClickCls {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.vtiger.com/");
		WebElement rsc = driver.findElement(By.partialLinkText("Resources"));

		Actions a=new Actions(driver);
		a.moveToElement(rsc).perform();
		driver.findElement(By.partialLinkText("Customers")).click();
		WebElement dbc = driver.findElement(By.partialLinkText("15 DAYS FREE TRIAL"));
		a.doubleClick(dbc).perform();
		 String title = driver.getTitle();
		 driver.close();
	}
}
