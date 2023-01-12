package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintHeightWidth {
static {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}
	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.get("https://www.facebook.com/");
WebElement loginbtn = driver.findElement(By.name("login"));
int height = loginbtn.getSize().getHeight();
int width = loginbtn.getSize().getWidth();
System.out.println("Height : "+height);
System.out.println("Width : "+width);
driver.close();
	}

}
