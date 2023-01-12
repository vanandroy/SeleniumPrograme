package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BbcLatestNews {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.bbc.com/");
		driver.findElement(By.xpath("(//span[@class='top-list-item__bullet'])[1]"));
		String text1 = driver.findElement(By.xpath("(//span[@class='top-list-item__bullet'])[1]/../h3")).getText();
		System.out.println("buisness news 1: "+text1);
		driver.findElement(By.xpath("(//span[@class='top-list-item__bullet'])[2]"));
		String text2 = driver.findElement(By.xpath("(//span[@class='top-list-item__bullet'])[2]/../h3")).getText();
		System.out.println("buisness news 2: "+text2);
		driver.findElement(By.xpath("(//span[@class='top-list-item__bullet'])[3]"));
		String text3 = driver.findElement(By.xpath("(//span[@class='top-list-item__bullet'])[3]/../h3")).getText();
		System.out.println("buisness news 3: "+text3);
		driver.findElement(By.xpath("(//span[@class='top-list-item__bullet'])[4]"));
		String text4 = driver.findElement(By.xpath("(//span[@class='top-list-item__bullet'])[4]/../h3")).getText();
		System.out.println("buisness news 4: "+text4);
		driver.findElement(By.xpath("(//span[@class='top-list-item__bullet'])[5]"));
		String text5 = driver.findElement(By.xpath("(//span[@class='top-list-item__bullet'])[5]/../h3")).getText();
		System.out.println("buisness news 5: "+text5);

		driver.close();
	}

}
