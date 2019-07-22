import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\IBM_ADMIN\\Downloads\\chromedriver_win32(2)\\chromedriver.exe");
		//WebDriver ffdrv= new FirefoxDriver();
		WebDriver ffdrv= new ChromeDriver();
		ffdrv.manage().window().maximize();
		ffdrv.get("http://newtours.demoaut.com/mercurysignon.php");
		
		/*WebElement username=ffdrv.findElement(By.xpath("//*[@name='userName']"));
		username.sendKeys("sunil");
		WebElement password=ffdrv.findElement(By.xpath("//*[@name='password']"));
		password.sendKeys("sunil");
	
		ffdrv.findElement(By.name("login")).click();
		Thread.sleep(10000);*/
		List<WebElement> tot = ffdrv.findElements(By.tagName("a"));
		System.out.println("total link is:"+tot.size());
		//String[] totLinks = new String[tot.size()];
		String[] Ltext = new String[tot.size()];
		for (int i=0;i<tot.size();i++){
			System.out.println("Link Name is:"+tot.get(i).getText());
			Ltext[i]=tot.get(i).getAttribute("innerText");
			System.out.println("Inner text Name is:"+Ltext[i]);
		}
		String Underconst="Under Construction: Mercury Tours";
		
	for (int j=0;j<tot.size()-1;j++){
			
		if (Ltext[j]!="registration form") {
		ffdrv.findElement(By.linkText(Ltext[j])).click();
		Thread.sleep(3000);
		String a = ffdrv.getTitle();
		System.out.println("Title:"+a);
			if (ffdrv.getTitle().equals(Underconst))
			{
				System.out.println("Page is under construction for the Link for:"+Ltext[j]);
			}
			else {
				System.out.println("Page is available for the Link:"+Ltext[j]);
			}
			//ffdrv.navigate().back();
		}
	}
		
	}
}
