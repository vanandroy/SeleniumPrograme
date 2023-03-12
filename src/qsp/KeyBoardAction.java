package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardAction {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://text-compare.com/");
		WebElement inpt1=driver.findElement(By.id("inputText1"));
		WebElement inpt2=driver.findElement(By.id("inputText2"));
		inpt1.sendKeys("welcome");
		Actions a=new Actions(driver);
		//ctrl+a
		a.keyDown(Keys.CONTROL);
		a.sendKeys("a");
		a.keyUp(Keys.CONTROL);
		a.perform();
		//ctrl+c
		a.keyDown(Keys.CONTROL);
		a.sendKeys("c");
		a.keyUp(Keys.CONTROL);
		a.perform();
		//press tab for change inpt1 to inpt2
		a.sendKeys(Keys.TAB);
		a.perform();
		//ctrl+v
		a.keyDown(Keys.CONTROL);
		a.sendKeys("v");
		a.keyUp(Keys.CONTROL);
		a.perform();
		if(inpt1.getAttribute("value").equals(inpt2.getAttribute("value")))
			System.out.println("text copied");
		else
			System.out.println("text not copied");
		
		driver.close();

	}

}
