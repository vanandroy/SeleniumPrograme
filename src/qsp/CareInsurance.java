package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CareInsurance {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.careinsurance.com/rhicl/proposalcp/renew/index-care");
		driver.findElement(By.id("policynumber")).sendKeys("123");
		driver.findElement(By.id("dob")).click();
		WebElement monthList = driver.findElement(By.xpath("(//select)[1]"));
		Select s=new Select(monthList);
		s.selectByIndex(0);
		WebElement yearList = driver.findElement(By.xpath("(//select)[2]"));
		Select y=new Select(yearList);
		y.selectByValue("2000");
		driver.findElement(By.xpath("(//a)[13]")).click();
		driver.findElement(By.id("alternative_number")).sendKeys("9845098450");
		driver.findElement(By.id("renew_policy_submit")).click();
		boolean txt = driver.findElement(By.id("policynumberError")).isDisplayed();
		System.out.println(txt);
		driver.close();
	}

}
