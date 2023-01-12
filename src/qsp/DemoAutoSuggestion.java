package qsp;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoAutoSuggestion {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone");

		List<WebElement> autosugg = driver.findElements(By.xpath("//div[@id='nav-flyout-searchAjax']/div[2]/div"));
		Thread.sleep(3000);
		int count = autosugg.size();
		System.out.println("No.Of Auto-Suggestion : "+count);

		for(WebElement i:autosugg)
		{
			String text = i.getText();
			System.out.println(text);
		}
		driver.close();
	}

}
