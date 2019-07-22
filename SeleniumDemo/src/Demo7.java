import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo7 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\IBM_ADMIN\\Downloads\\chromedriver_win32(2)\\chromedriver.exe");
		WebDriver ffdrv= new ChromeDriver();
		ffdrv.manage().window().maximize();
		ffdrv.get("http://retail.upskills.in/admin/");
		Thread.sleep(2000);		
		
		ffdrv.findElement(By.id("input-username")).sendKeys("admin");
		ffdrv.findElement(By.id("input-password")).sendKeys("admin@123");
		
		ffdrv.findElement(By.xpath("//*[@type='submit' and @class='btn btn-primary']")).click();
		WebElement DB=ffdrv.findElement(By.id("menu-catalog"));
		
		Actions MO= new Actions(ffdrv);		
		MO.moveToElement(DB).click().perform();				
		Thread.sleep(3000);
	}

}
