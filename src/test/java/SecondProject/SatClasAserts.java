package SecondProject;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.testng.Assert;

import test.utilities.Driver;

public class SatClasAserts {
	@Before
	public void beforeMethod() {
		
		Driver.getDriver().get("https://the-internet.herokuapp.com/");
		Driver.getDriver().manage().window().maximize();
	}
	
	@Test
	public void Satclass() {
			
		System.out.println(Driver.getDriver().findElement(By.xpath("//*[@id=\"content\"]/h1")).getText());
		Assert.assertEquals("Welcome to the-internet" , Driver.getDriver().findElement(By.xpath("//*[@id=\"content\"]/h1")).getText());
		
	
	}
	
	@After
	public void afterTest() {
		Driver.getDriver().close();
	}
	
}
