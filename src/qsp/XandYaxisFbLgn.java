package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XandYaxisFbLgn {
static {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}
	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.get("https://www.facebook.com/");
int x = driver.findElement(By.name("login")).getLocation().getX();
int y = driver.findElement(By.name("login")).getLocation().getY();
System.out.println(x+"  and  "+y);
driver.close();
	}

}
