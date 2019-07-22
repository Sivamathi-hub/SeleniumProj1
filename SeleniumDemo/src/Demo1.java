


//import java.sql.Driver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//System.setProperty("webdriver.gecko.driver", "C:\\Users\\IBM_ADMIN\\Downloads\\geckodriver-v0.24.0-win32\\geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\IBM_ADMIN\\Downloads\\chromedriver_win32(2)\\chromedriver.exe");
		//WebDriver ffdrv= new FirefoxDriver();
		WebDriver ffdrv= new ChromeDriver();
		ffdrv.manage().window().maximize();
		ffdrv.get("https://opensource-demo.orangehrmlive.com/");
		//String ExpectedTitle="OrangeHRM";
		//ffdrv.getCurrentUrl();
		//ffdrv.findElement(By.xpath("//*[@id='txtUsername']")).sendKeys("admin");
		ffdrv.findElement(By.xpath("//*[@name='txtUsername']")).sendKeys("admin");
		//ffdrv.findElement(By.id("txtUsername")).sendKeys("admin");
		ffdrv.findElement(By.id("txtPassword")).sendKeys("admin123");
		//ffdrv.findElement(By.xpath("[//*@id='txtPassword']")).sendKeys("admin123");
		
		//ffdrv.findElement(By.xpath("[//*@id='btnLogin']")).click();
		ffdrv.findElement(By.id("btnLogin")).click();
		Thread.sleep(3000);
	/*	String ActualTile=ffdrv.getTitle();
		System.out.println("Actual title is:"+ActualTile);
	if(ActualTile.equals(ExpectedTitle)) {
		
			//ffdrv.findElement(By.xpath("[//*@id='welcome']")).click();
			ffdrv.findElement(By.id("welcome")).click();
			Thread.sleep(3000);
			//ffdrv.findElement(By.linkText("Logout")).click();
			
			ffdrv.findElement(By.xpath("//*[@id='welcome-menu']/ul/li[2]/a")).click();
			ffdrv.close();
		}
		else
		{
			System.out.println("title is not the same");
			ffdrv.close();
		}*/
		
		List<WebElement> tot = ffdrv.findElements(By.tagName("a"));
		System.out.println("total link is:"+tot.size());
		//List <Webelement> tot = ffdrv.findElements(By.linkText(".*"));
	}

	
}