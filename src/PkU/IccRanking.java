package PkU;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class IccRanking {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.icc-cricket.com/homepage");
		WebElement ranking = driver.findElement(By.xpath("//nav[@class='main-navigation__desktop-list js-desktop-nav']/../../div/nav/ul/li[3]"));
		Actions a=new Actions(driver);
		a.moveToElement(ranking).perform();
		driver.findElement(By.xpath("(//a[contains(text(),'Overview')])[1]")).click();
		String title = driver.getTitle();
		System.out.println(title);
		
		//after this stale element refrence exception
		/*
		a.moveToElement(ranking).perform();
		driver.findElement(By.xpath("(//a[contains(text(),'Overview')])[2]")).click();
		String title1=driver.getTitle();
		System.out.println(title1);
		Thread.sleep(5000);
		*/
		driver.close();
		
	}

}
