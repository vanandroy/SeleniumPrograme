package qsp;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class FrameHandlingPractice {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
		
		driver.findElement(By.id("name")).sendKeys("hello");
		WebElement frm1 = driver.findElement(By.id("frm1"));
		driver.switchTo().frame(frm1);
		WebElement dpd = driver.findElement(By.id("selectnav1"));
		Select s1=new Select(dpd);
		WebElement alap = s1.getWrappedElement();
		String text1 = alap.getText();
		System.out.println(text1);
		
		System.out.println("++++++++++++++++++++++++++");
		WebElement course = driver.findElement(By.id("course"));
		Select s2=new Select(course);
		List<WebElement> allops = s2.getOptions();
		for(int i=0;i<allops.size();i++) {
			String text2 = allops.get(i).getText();
			System.out.println(text2);
		}
		System.out.println("++++++++++++++++++++++++++");
		WebElement ide1= driver.findElement(By.id("ide"));
		Select s3=new Select(ide1);
		List<WebElement> idao11 = s3.getOptions();
		for(int i=0;i<idao11.size();i++)
		{
			String text3 = idao11 .get(i).getText();
			System.out.println(text3);
		}
		System.out.println("+++++++++++++++++++++++++++");
		driver.switchTo().parentFrame();
		WebElement beforeframe = driver.findElement(By.id("name"));
		beforeframe.clear();
		beforeframe.sendKeys("ok");
		
		System.out.println("no prnt statmnt");
		WebElement frm2 = driver.findElement(By.id("frm2"));
		driver.switchTo().frame(frm2);
		driver.findElement(By.id("firstName")).sendKeys("vivek");
		driver.findElement(By.id("lastName")).sendKeys("kumar");
		driver.findElement(By.id("englishchbx")).click();
		driver.findElement(By.id("hindichbx")).click();
		driver.findElement(By.id("chinesechbx")).click();
		//driver.findElement(By.id("clearbtn")).submit();
		//driver.findElement(By.id("navigateHome")).click();
		
		//driver.switchTo().defaultContent();
		driver.switchTo().parentFrame();
		driver.findElement(By.id("name")).sendKeys("ok1");
		System.out.println("+++++++++++++++++++++++++");
		WebElement frm3 = driver.findElement(By.id("frm3"));
		driver.switchTo().frame(frm3);
		driver.findElement(By.id("name")).sendKeys("frm3");
		WebElement frm3of1 = driver.findElement(By.id("frm1"));
		driver.switchTo().frame(frm3of1);
		WebElement crse = driver.findElement(By.id("course"));
		Select s4=new Select(crse);
		List<WebElement> ao = s4.getOptions();
		for(int i=0;i<ao.size();i++)
		{
			String text4 = ao.get(i).getText();
			System.out.println(text4);
		}
		System.out.println("+++++++++++++++++++++++++");
		WebElement ide112= driver.findElement(By.id("ide"));
		Select s5=new Select(ide112);
		List<WebElement> idao = s5.getOptions();
		for(int i=0;i<idao.size();i++)
		{
			String text5 = idao .get(i).getText();
			System.out.println(text5);
		}
		
		
		driver.close();
		
		
	}
}

