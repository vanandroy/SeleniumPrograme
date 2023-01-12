package qsp;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertWithTextBox {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.findElement(By.xpath("(//a[@class='analystic'])[3]")).click();
		driver.findElement(By.xpath("//button[.='click the button to demonstrate the prompt box ']")).click();
		Thread.sleep(4000);
		Alert a = driver.switchTo().alert();
		a.sendKeys("sarathe");
		a.accept();
		String text = driver.findElement(By.id("demo1")).getText();
		System.out.println(text);
		driver.close();
	}

}
