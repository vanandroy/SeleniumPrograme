package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsResource {
	static{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.vtiger.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Actions a=new Actions(driver);
		WebElement resources = driver.findElement(By.partialLinkText("Resources"));
		a.moveToElement(resources).perform();
		driver.findElement(By.partialLinkText("Contact Us")).click();
		
		WebElement dbclk = driver.findElement(By.partialLinkText("Login"));
		a.doubleClick(dbclk).perform();
	String etitle=driver.getTitle();
	String atitle="Login - Vtiger";
	System.out.println(etitle);
	if(atitle==etitle) 
	
		System.out.println("ALL IS WELL");
	
	else 
		System.out.println("bsdk");
	
	driver.close();
	}

}
