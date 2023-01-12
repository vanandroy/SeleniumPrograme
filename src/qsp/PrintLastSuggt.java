package qsp;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintLastSuggt {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("kvivekanand965@gmail.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Flipkart@123");
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
		Thread.sleep(5000);
		driver.findElement(By.name("q")).sendKeys("iphone");
		Thread.sleep(5000);
		List<WebElement> autoaggst = driver.findElements(By.xpath("//li[contains(.,'iphone')]"));
		Thread.sleep(5000);
		int count=autoaggst.size();
		System.out.println(count);
/*
		for(int i=0;i<count;i++) 
		{
			String text = autoaggst.get(i).getText();
			System.out.println(text);
		}

*/
		for(WebElement i:autoaggst)
		{
			String text = i.getText();
			System.out.println(text);
		}
		
		driver.close();
	}

}
