package qsp;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HeadingOfActiTime {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.xpath("(//input[@type='password'])[1]")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		driver.findElement(By.xpath("(//div[@class='popup_menu_icon'])[4]")).click();
		driver.findElement(By.xpath("(//a[@class='item_link'])[13]")).click();
		Set<String> tab = driver.getWindowHandles();
		for(String t:tab) {
			driver.switchTo().window(t);
			Thread.sleep(3000);
			driver.findElement(By.linkText("Read Service Agreement")).click();
			Set<String> tab1 = driver.getWindowHandles();
			for(String tb:tab1) {
				driver.switchTo().window(tb);			
				List<WebElement> heading = driver.findElements(By.xpath("//h2"));
				for(WebElement head:heading) {
					String text = head.getText();
					System.out.println(text);
				}
				driver.close();
			}
		}
		driver.quit();
	}

}
