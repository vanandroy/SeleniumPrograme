package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class ParticularScroll {
static {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.bbc.com/");
		int y=driver.findElement(By.xpath("//a[contains(text(),' New Tech Economy ')]")).getLocation().getY();
		RemoteWebDriver r=(RemoteWebDriver) driver;
		r.executeScript("window.scrollBy(0,"+y+")");
		Thread.sleep(3000);
		driver.close();
	}
}
