package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyUrl {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.selenium.org");
		String url = driver.getCurrentUrl();
		if(url.equals("https://www.selenium.dev/")) {
			System.out.println("URL is Navigating and Pass");
		}else
		{
			System.out.println("URL is Not Navigating and Fail");
		}
		driver.close();
	}

}
