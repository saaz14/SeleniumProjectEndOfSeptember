package Homework30thSep;

import org.junit.Test;
import org.openqa.selenium.By;

import test.utilities.ConfigurationReader;
import test.utilities.Driver;

public class Task2 {
	
	@Test
	public void test() throws InterruptedException {
	
		Driver.getDriver().get(ConfigurationReader.getProperty("url"));
		Driver.getDriver().findElement(By.xpath("//*[@id=\"menu-item-50\"]/a")).click();
		Driver.getDriver().findElement(By.id("username")).sendKeys("abc@xyz.com");
		Driver.getDriver().findElement(By.id("password")).sendKeys("TechCircle1@2");
		Driver.getDriver().findElement(By.name("login")).click();
		Driver.getDriver().findElement(By.xpath("//*[@id=\"page-36\"]/div/div[1]/nav/ul/li[2]/a")).click();
		System.out.println("=============================================================================================");
		System.out.println("Can we see the Order screen? " + Driver.getDriver().findElement(By.xpath("//*[@id=\"page-36\"]/div/div[1]/div/div")).isDisplayed());
		System.out.println("=============================================================================================");
		Driver.getDriver().findElement(By.xpath("//*[@id=\"page-36\"]/div/div[1]/nav/ul/li[4]/a")).click();
		System.out.println("=============================================================================================");
		System.out.println("Can we see the BILLING ADDRESS screen? " + Driver.getDriver().findElement(By.xpath("//*[@id=\"page-36\"]/div/div[1]/div/div/div[1]/address")).isDisplayed());
		System.out.println("=============================================================================================");
		
		Driver.getDriver().close();
	}
}
