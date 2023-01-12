package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllLinks {
static {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	
}
	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.get("https://www.amazon.in/");
List<WebElement> allLinks = driver.findElements(By.xpath("//a"));
int count = allLinks.size();
System.out.println(count);

for(WebElement i:allLinks)
{
	String text = i.getText();
	System.out.println(text);
	
}
driver.close();

	}

}
