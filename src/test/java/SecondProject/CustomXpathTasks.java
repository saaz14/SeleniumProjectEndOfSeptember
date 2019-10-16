package SecondProject;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

import test.utilities.BrowserUtils;
import test.utilities.ConfigurationReader;
import test.utilities.Driver;

public class CustomXpathTasks {
	
	@Before
	public void beforeMethod() {
		
		Driver.getDriver().get(ConfigurationReader.getProperty("url2"));
	}
	
	
	
	@Test
	public void customXpathSendKeys() {
		Driver.getDriver().findElement(By.xpath(ConfigurationReader.getProperty("searchBar"))).sendKeys("dresses");
		Driver.getDriver().findElement(By.xpath(ConfigurationReader.getProperty("searchButton"))).click();
		
		BrowserUtils.waitForVisibility(Driver.getDriver().findElement(By.xpath(ConfigurationReader.getProperty("ResultCheck"))), 5);
		
		System.out.println("Did the automation test search the website? " + Driver.getDriver().findElement(By.xpath(ConfigurationReader.getProperty("ResultCheck"))).isDisplayed());
		
		Driver.getDriver().findElement(By.xpath(ConfigurationReader.getProperty("Cart"))).click();
		System.out.println("Did the automation test clicked the Cart? " + Driver.getDriver().findElement(By.xpath(ConfigurationReader.getProperty("CartCheck"))).isDisplayed());
	}
	
	@After
	public void afterTest() {
		Driver.getDriver().close();
	}
	

}
