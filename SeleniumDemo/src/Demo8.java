import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Demo8 {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\IBM_ADMIN\\Downloads\\chromedriver_win32(2)\\chromedriver.exe");
		WebDriver ffdrv= new ChromeDriver();
		ffdrv.manage().window().maximize();
		ffdrv.get("http://realestate.upskills.in/wp-admin/");
		String hurl=ffdrv.getCurrentUrl();
		System.out.println("Home URL is:"+hurl);
		Thread.sleep(2000);		
		
		ffdrv.findElement(By.id("user_login")).sendKeys("admin");
		ffdrv.findElement(By.id("user_pass")).sendKeys("adminuser@12345");
		
		ffdrv.findElement(By.xpath("//*[@type='submit' and @name='login']")).click();
					
		Thread.sleep(2000);
		
		WebElement DB=ffdrv.findElement(By.xpath("//*[@src='http://0.gravatar.com/avatar/97843bee845c4609e1b32d095f64d7bb?s=26&d=mm&r=g']"));
		//xpath=//*[contains(text(),'Howdy')]
		//xpath=//*[text()='Howdy, ']
		Actions MO= new Actions(ffdrv);	
		Action Mouseac = MO.contextClick(DB).build();
		Mouseac.perform();
		Robot rb=new Robot();
		rb.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(1000);
		rb.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		rb.keyPress(KeyEvent.VK_CONTROL);
		Thread.sleep(1000);
		rb.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(1000);
		String url=ffdrv.getCurrentUrl();
		System.out.println("URL is next tab is"+url);
		if (url.equals(hurl)) 
			System.out.println("URL are same");
		else
			System.out.println("URL are not same");
	}

}
