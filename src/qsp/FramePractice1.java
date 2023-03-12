package qsp;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FramePractice1 {

	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
        driver.findElement(By.id("name")).sendKeys("hello");
        
		WebElement frame3 = driver.findElement(By.id("frm3"));
		driver.switchTo().frame(frame3);
		
		driver.findElement(By.id("name")).sendKeys("frame3");
		WebElement frame1 = driver.findElement(By.id("frm1"));
		driver.switchTo().frame(frame1);
		WebElement slct = driver.findElement(By.id("course"));
		Select s1=new Select(slct);
		s1.selectByVisibleText("Java");
		List<WebElement> alopt = s1.getOptions();
		for(int i=0;i<alopt.size();i++) {
			s1.selectByIndex(i);
		}
		Thread.sleep(3000);
		driver.switchTo().defaultContent();
		 driver.findElement(By.id("name")).clear();
		 driver.findElement(By.id("name")).sendKeys("good");
		 driver.switchTo().frame(frame3);
		 driver.findElement(By.id("name")).sendKeys("frame3");
		 driver.switchTo().frame(frame1);
		 WebElement ide = driver.findElement(By.id("ide"));
		 Select s2=new Select(ide);
		 List<WebElement> alopt1 = s2.getOptions();
		 for(int i=0;i<alopt1.size();i++) {
			 s2.selectByIndex(i);
		 }
		 Thread.sleep(5000);
		 for(int i=alopt1.size()-1;i>=0;i--) {
			 s2.deselectByIndex(i);
		 }
			Select s3=new Select(slct);
			WebElement withoutloop = s3.getWrappedElement();
			String text = withoutloop.getText();
			System.out.println(text);
		 
		 
			
		 driver.close();
		
	}
}
