package qsp;

import java.security.Key;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CopyPaste {
static {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}
	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.get("https://opensourcebilling.org/");
driver.findElement(By.id("email")).sendKeys(Keys.CONTROL+"ac");
driver.findElement(By.id("password")).sendKeys(Keys.CONTROL+"av");
driver.close();
	}

}
