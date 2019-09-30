package Homework30thSep;

import org.junit.Test;
import org.openqa.selenium.By;

import test.utilities.ConfigurationReader;
import test.utilities.Driver;

public class Task1 {
	
	@Test
	public void test() throws InterruptedException {
	
		Driver.getDriver().get(ConfigurationReader.getProperty("url"));
		Driver.getDriver().findElement(By.xpath("//*[@id=\"menu-item-50\"]/a")).click();
		Driver.getDriver().findElement(By.id("reg_email")).sendKeys(" . ");
		Driver.getDriver().findElement(By.id("reg_password")).sendKeys("TechCircle@12");
		Driver.getDriver().findElement(By.name("register")).click();
		
		Driver.getDriver().close();
		
	}

}
