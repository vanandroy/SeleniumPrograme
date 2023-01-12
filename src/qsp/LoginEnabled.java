package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginEnabled {
static {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}
	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.get("https://www.facebook.com/");
boolean lgnbtn = driver.findElement(By.name("login")).isEnabled();
if(lgnbtn==true){
System.out.println("login button is enabled ");
	}
else {
	System.out.println("login button is not enabled");
}
driver.close();
	}

}
