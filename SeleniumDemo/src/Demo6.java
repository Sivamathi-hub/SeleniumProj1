import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.*;

public class Demo6 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\IBM_ADMIN\\Downloads\\chromedriver_win32(2)\\chromedriver.exe");
		WebDriver ffdrv= new ChromeDriver();
		ffdrv.manage().window().maximize();
		ffdrv.get("https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(2000);		
		
		ffdrv.findElement(By.xpath("//*[@name='txtUsername']")).sendKeys("admin");
		ffdrv.findElement(By.id("txtPassword")).sendKeys("admin123");
		
		WebElement login=ffdrv.findElement(By.id("btnLogin"));
		
		Actions MO= new Actions(ffdrv);		
		//Action Mouseov = MO.moveToElement(login).build();
				
		MO.sendKeys( Keys.ENTER).perform();
		Thread.sleep(3000);
		//MO.sendKeys(Keys.TAB,Keys.TAB,Keys.TAB,Keys.ENTER).perform();
		MO.sendKeys(Keys.TAB).perform();
		Thread.sleep(1000);
		MO.sendKeys( Keys.TAB).perform();
		Thread.sleep(1000);
		MO.sendKeys(Keys.TAB).perform();
		Thread.sleep(1000);
		MO.sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);
		//ffdrv.quit();
		
		
	}

}
