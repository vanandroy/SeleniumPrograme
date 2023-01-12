package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllContent {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/HP/Desktop/Demo.html");
		List<WebElement> content= driver.findElements(By.tagName("a"));
		for(WebElement i:content)
		{
			String text = i.getText();
			System.out.println(text);
		}
		
		driver.close();
		

	}

}
