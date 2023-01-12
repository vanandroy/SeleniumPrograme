package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleAutoSugg {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://google.com/");
		driver.findElement(By.name("q")).sendKeys("qspiders");
		Thread.sleep(4000);
		List<WebElement> sugg = driver.findElements(By.xpath("//li[@class='sbct']"));
		int count = sugg.size();
		System.out.println("Total Count Of Auto Suggestion : "+count);
		String text;
		//String text = null;
		for(int i=0;i<count;i++) 
		{
			text = sugg.get(count-2).getText();
			//System.out.println(text);

		}
		//System.out.println(text);

		/* 
		for(WebElement i:sugg)
		{
			String text = i.getText();
			System.out.println(text);
		}

		 */

		driver.close();
	}

}
