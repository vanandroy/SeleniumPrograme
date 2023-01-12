package qsp;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleALLUrlLink {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.google.co.in/");
		driver.findElement(By.xpath("(//input[@name='q'])[1]")).sendKeys("wipro jobs");
		driver.findElement(By.xpath("(//span[text()='wipro jobs'])[1]")).click();
		Thread.sleep(4000);
       List<WebElement> link = driver.findElements(By.xpath("//h3[contains(text(),'Wipro ')]"));
		int count = link.size();
		System.out.println(count);
		for(int i=0;i<count;i++) {
			String text = link.get(i).getText();
			System.out.println(text);
		}
		driver.close();
	}
}
