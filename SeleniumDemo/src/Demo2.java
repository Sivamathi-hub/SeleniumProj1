import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo2 {

	public static void main(String[] args) throws InterruptedException {
		//System.setProperty("webdriver.gecko.driver", "C:\\Users\\IBM_ADMIN\\Downloads\\geckodriver-v0.24.0-win32\\geckodriver.exe");
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\IBM_ADMIN\\Downloads\\chromedriver_win32(2)\\chromedriver.exe");
				//WebDriver ffdrv= new FirefoxDriver();
				WebDriver ffdrv= new ChromeDriver();
				ffdrv.manage().window().maximize();
				ffdrv.get("http://newtours.demoaut.com/mercurysignon.php");
				
				WebElement username=ffdrv.findElement(By.xpath("//*[@name='userName']"));
				username.sendKeys("sunil");
				WebElement password=ffdrv.findElement(By.xpath("//*[@name='password']"));
				password.sendKeys("sunil");
				String strname = username.getAttribute("value");
				System.out.println("User name is:"+strname);

				ffdrv.findElement(By.name("login")).click();
				Thread.sleep(10000);	
				
				ffdrv.findElement(By.xpath("//*[@value='oneway' and @name='tripType']")).click();
				WebElement dd=ffdrv.findElement(By.xpath("//*[@name='passCount']"));
				Select sel = new Select(dd);
				List<WebElement> opts = sel.getOptions();
				System.out.println("No of option is:"+opts.size());
				for (int i=0;i<opts.size();i++)
					System.out.println("Options are:"+opts.get(i).getText());
				sel.selectByIndex(3);
				Thread.sleep(3000);
				sel.selectByVisibleText("1");
				Thread.sleep(3000);
				System.out.println("Selected value is:"+dd.getAttribute("value"));
				
				ffdrv.findElement(By.xpath("//*[@value='Business' and @name='servClass']")).click();
				ffdrv.findElement(By.xpath("//*[@name='findFlights']")).click();
				
				ffdrv.findElement(By.xpath("//*[@name='reserveFlights']")).click();
				Thread.sleep(3000);
				ffdrv.findElement(By.xpath("//*[@name='passFirst0']")).sendKeys("Test");
				ffdrv.findElement(By.xpath("//*[@name='passLast0']")).sendKeys("user1");
				ffdrv.findElement(By.xpath("//*[@name='creditnumber']")).sendKeys("9876543210912345");
				List<WebElement> chkbox = ffdrv.findElements(By.xpath("//*[@name='ticketLess']"));
				
				for (int i=0;i<chkbox.size();i++) {
				//	e.click();
	
				//chkbox.contains("Same as Billing Address").Click();
				
					System.out.println("checkbox is:"+chkbox.get(i).getText());
					/*if (a== "Ticketless Travel") {
						chkbox.get(i).click();	
					}*/
				}
				//ffdrv.findElement(By.xpath("//*[@name='ticketLess' and @contain='Ticketless Travel']")).click();
				//ffdrv.findElement(By.xpath("//*[@name='ticketLess' and @contain='Same as Billing Address']")).click();
				
	}

}
