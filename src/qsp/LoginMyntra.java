package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginMyntra {
static {
System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}
	public static void main(String[] args) throws InterruptedException {
WebDriver driver=new ChromeDriver();
driver.get("https://www.flipkart.com/");
Thread.sleep(1000);
driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys("kvivekanand965@gmail.com");
Thread.sleep(1000);
driver.findElement(By.xpath("//input[@type='password']")).sendKeys("demo@123");
Thread.sleep(1000);
driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")).click();
Thread.sleep(1000);
driver.findElement(By.xpath("//div[@class='exehdJ']")).click();
	}

}

