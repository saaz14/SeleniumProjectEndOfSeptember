package SecondProject;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;

import test.utilities.ConfigurationReader;
import test.utilities.Driver;

public class Sep29thClass {
	
//	static String Path = System.getProperty("user.dir");
//	static WebDriver chrome;
	
	@Test
	public void test1() throws InterruptedException {
		
		Driver.getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Driver.getDriver().manage().window().fullscreen();
		Driver.getDriver().get(ConfigurationReader.getProperty("url"));
		
//		System.setProperty("webdriver.chrome.driver", Path + "\\Drivers\\chromedriver.exe");
		
		
//		
//		chrome = new ChromeDriver();
		
//		Driver.getDriver().get("http://practice.automationtesting.in/");
//		Driver.getDriver().manage().window().maximize();
		
		
		
		
		
		Driver.getDriver().findElement(By.xpath("//*[@id=\"menu-item-50\"]/a")).click();
		
		Driver.getDriver().findElement(By.id("username")).sendKeys("aqeel.zaidi@gmail.com");
		Driver.getDriver().findElement(By.id("password")).sendKeys("TechCircle@12");
		Driver.getDriver().findElement(By.xpath("//*[@id=\"customer_login\"]/div[1]/form/p[3]/input[3]")).click();
		Driver.getDriver().manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		
		System.out.println("===================================================================================\n\n");
		System.out.println(Driver.getDriver().findElement(By.xpath("//*[@id=\"page-36\"]/div/div[1]/nav/ul/li[1]/a")).isDisplayed());
		System.out.println("\n\n===================================================================================");
		
		Driver.getDriver().close();
		
	}
}
