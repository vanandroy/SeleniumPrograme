package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintHtmalSourceCode {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
	public static void main(String[] args) {
		{
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.google.com/");
			String html = driver.getPageSource();
			System.out.println(html);
			driver.close();
		}

	}

}
