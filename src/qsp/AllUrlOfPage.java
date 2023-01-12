package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AllUrlOfPage {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
public static void main(String []args) {

	WebDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in/");
	List<WebElement> nks = driver.findElements(By.xpath("//a"));
	int count =nks .size();
	System.out.println(count);
	for(WebElement n:nks ) {
		String text = n.getText();
		System.out.println(text);
	}
	driver.close();
}
}
