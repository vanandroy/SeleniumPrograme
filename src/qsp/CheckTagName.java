package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckTagName {
private static final String a = null;
static {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}
	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.get("https://demo.actitime.com/");
String tgname = driver.findElement(By.id("toPasswordRecoveryPageLink")).getTagName();

	System.out.println("TagName is : "+tgname);

driver.close();
	}

}
