package PkU;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

class Demo
{
		static{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		}
		public static void main(String []args) throws InterruptedException{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.findElement(By.xpath("//div[@id='OKTab']/button[1]")).click();
		Alert a=driver.switchTo().alert();
		a.accept();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@id='OKTab']/button[1]/../../../div[1]/ul/li[2]")).click();
		driver.findElement(By.xpath("//div[@id='OKTab']/button[1]/../../../div[2]/div[2]")).click();
		a.accept();
		String text = driver.findElement(By.id("demo")).getText();
		System.out.println(text);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@id='OKTab']/button[1]/../../../div[1]/ul/li[3]")).click();
		driver.findElement(By.xpath("//div[@id='OKTab']/button[1]/../../../div[2]/div[3]")).click();
		a.sendKeys("ram");
		a.accept();
		String text1 = driver.findElement(By.id("demo1")).getText();
		System.out.println(text1);
	
		driver.close();
		}
		}




