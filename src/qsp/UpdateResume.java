package qsp;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UpdateResume {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.naukri.com/");
		driver.findElement(By.id("login_Layer")).click();
		
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("kvivekanand965@gmail.com");
		driver.findElement(By.xpath("(//input[@type='password'])[1]")).sendKeys("naukri@123");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		driver.findElement(By.xpath("//div[@class='btn btn-block btn-large white-text']")).click();
		
		File f=new File("C:\\Users\\HP\\eclipse-workspace\\Automation\\data\\vkfinalres.pdf");
		String path = f.getAbsolutePath();
		
		driver.findElement(By.id("attachCV")).sendKeys(path);
		driver.close();
	}

}
