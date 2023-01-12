package qsp;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CloseOnlyChild {
	static {
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://secure.indeed.com/");
		driver.findElement(By.id("apple-signin-button")).click();
		driver.findElement(By.id("login-facebook-button")).click();
		String pwh = driver.getWindowHandle();
		Set<String> allWh = driver.getWindowHandles();
        for(String wh:allWh) {
			driver.switchTo().window(wh);
			if((wh.equals(pwh))){
				driver.close();
			}
		}
	}

}
