import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\IBM_ADMIN\\Downloads\\chromedriver_win32(2)\\chromedriver.exe");
		//WebDriver ffdrv= new FirefoxDriver();
		WebDriver ffdrv= new ChromeDriver();
		ffdrv.manage().window().maximize();
		ffdrv.get("http://newtours.demoaut.com/mercurysignon.php");
		Thread.sleep(2000);
		ffdrv.findElement(By.linkText("Cruises")).click();
		Thread.sleep(2000);
		ffdrv.navigate().back();
		Thread.sleep(2000);
		ffdrv.navigate().forward();
		Thread.sleep(2000);
		ffdrv.navigate().refresh();
		Thread.sleep(2000);
		ffdrv.close();
		
		
	}

}
