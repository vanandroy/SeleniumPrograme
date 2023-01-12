package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FontSizeAndType {
static {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}
	public static void main(String[] args) throws InterruptedException {
WebDriver driver=new ChromeDriver();
driver.get("https://www.facebook.com/");
Thread.sleep(1000);
String s=driver.findElement(By.linkText("Forgotten password?")).getCssValue("font-size");
String t = driver.findElement(By.linkText("Forgotten password?")).getCssValue("font-family");

System.out.println(s+" and "+t );
driver.close();
	}

}
