package qsp;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartIphone {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("(//div/button)[2]")).click();
		driver.findElement(By.name("q")).sendKeys("apple iphone 14 pro max");
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//span[contains(text(),'apple iphone 14 pro max')])[1]")).click();
		List<WebElement> phname = driver.findElements(By.xpath("//div[contains(text(),'APPLE iPhone 14 Pro Max')]"));
		int countPh = phname.size();
		System.out.println("Total phone  "+countPh);
		List<WebElement> price= driver.findElements(By.xpath("//div[contains(text(),'APPLE iPhone 14 Pro Max')]/../../div[2]/div[1]/div[1]"));
		int count = price.size();
		System.out.println("Total price count  "+count);
		String text1 = null;
		String text = null;
		for(int i=0;i<count;i++) {
			text = price.get(i).getText();
			text1 = phname.get(i).getText();
			System.out.println(text1+"=======>"+text);
		}


		driver.close();
	}

}
