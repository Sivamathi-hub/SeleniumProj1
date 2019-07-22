import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.*;

public class Demo5 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\IBM_ADMIN\\Downloads\\chromedriver_win32(2)\\chromedriver.exe");
		//WebDriver ffdrv= new FirefoxDriver();
		WebDriver ffdrv= new ChromeDriver();
		ffdrv.manage().window().maximize();
		ffdrv.get("http://newtours.demoaut.com/mercurysignon.php");
		Thread.sleep(2000);
		WebElement link=ffdrv.findElement(By.linkText("Cruises"));//Cruises
		
		Actions MO= new Actions(ffdrv);
		
		Action Mouseov = MO.moveToElement(link).build();
		Mouseov.perform();
		
		MO.sendKeys(link, Keys.ENTER).perform();
		//this also will click on the link
	//	MO.sendKeys(link, Keys.RETURN).perform();
		Thread.sleep(2000);
		//ffdrv.quit();
		
		
	}

}
