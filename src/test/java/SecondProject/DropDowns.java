package SecondProject;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import test.utilities.BrowserUtils;
import test.utilities.ConfigurationReader;
import test.utilities.Driver;

public class DropDowns {
	
	@Before
	public void beforeMtd() {
		
	//	Driver.getDriver().get(ConfigurationReader.getProperty("url4"));
	//	Driver.getDriver().get(ConfigurationReader.getProperty("url5"));
	//	Driver.getDriver().get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
		Driver.getDriver().get("https://www.seleniumeasy.com/test/jquery-dropdown-search-demo.html");
		
		Driver.getDriver().manage().window().maximize();
	}
	
	
//	
//	@Test
//	public void staticDropDown() {
//		
//		Select staticDropDown = new Select(Driver.getDriver().findElement(By.xpath(ConfigurationReader.getProperty("staticDropDown"))));
//		staticDropDown.selectByIndex(3);
//		BrowserUtils.waitFor(3);
//		staticDropDown.selectByValue("INR");
//		BrowserUtils.waitFor(3);
//		staticDropDown.selectByVisibleText("AED");
//		
//		WebElement Crncy = Driver.getDriver().findElement(By.xpath(ConfigurationReader.getProperty("staticDropDown")));
//		List<WebElement> options = Crncy.findElements(By.tagName("option"));
//		Iterator<WebElement> Crncyitr = options.iterator();
//		while (Crncyitr.hasNext()) {
//			System.out.println(Crncyitr.next().getAttribute("Value"));
//			}
//	}
//	
//	@Test
//	public void dynamicDropDowns() {
//		
//		Driver.getDriver().findElement(By.id(ConfigurationReader.getProperty("DynamicDeparture"))).click();
//		BrowserUtils.waitFor(2);
//		Driver.getDriver().findElement(By.xpath(ConfigurationReader.getProperty("DynamicDepartureCity"))).click();
//		Driver.getDriver().findElement(By.xpath(ConfigurationReader.getProperty("DynamicArrivalCity"))).click();
//		BrowserUtils.waitFor(2);
//		Driver.getDriver().findElement(By.xpath(ConfigurationReader.getProperty("DynamicDate"))).click();
//	}
//	
//	@Test
//	public void dropAndClickDropDown() {
//		Driver.getDriver().findElement(By.id(ConfigurationReader.getProperty("DropAndClickDropDown"))).click();
//		BrowserUtils.waitFor(3);
//		
//		int number = 1;
//		while (number<5) {
//			Driver.getDriver().findElement(By.id(ConfigurationReader.getProperty("DropAndClickDropDown1"))).click();
//		number++;
//		}
//		BrowserUtils.waitFor(3);
//		Driver.getDriver().findElement(By.id(ConfigurationReader.getProperty("DropAndClickDropDown2"))).click();
//	}
	
//	@Test
//	public void autoSuggestionDropDowns() {
//		
//		Driver.getDriver().findElement(By.xpath(ConfigurationReader.getProperty("autoDropDownDeparture"))).click();
//		Driver.getDriver().findElement(By.xpath(ConfigurationReader.getProperty("DropDownTextField"))).clear();
//		Driver.getDriver().findElement(By.xpath(ConfigurationReader.getProperty("DropDownTextField"))).sendKeys("LHE");
//		Driver.getDriver().findElement(By.xpath(ConfigurationReader.getProperty("firstSuggesstedCity"))).click();
//		
//		BrowserUtils.waitFor(3);
//		
//		Driver.getDriver().findElement(By.xpath(ConfigurationReader.getProperty("autoDropDownArrival"))).click();
//		Driver.getDriver().findElement(By.xpath(ConfigurationReader.getProperty("DropDownTextField1"))).clear();
//		Driver.getDriver().findElement(By.xpath(ConfigurationReader.getProperty("DropDownTextField1"))).sendKeys("LHR");
//		Driver.getDriver().findElement(By.xpath(ConfigurationReader.getProperty("firstSuggesstedCity1"))).click();
//		
//	}
	
//	@Test
//	public void aletMethdAssert() {
//		
//		Driver.getDriver().findElement(By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[2]/div[2]/button")).click();
//		BrowserUtils.waitFor(2);
//		System.out.println(Driver.getDriver().switchTo().alert().getText());
//		Driver.getDriver().switchTo().alert().dismiss();
//		
//		Assert.assertEquals(Driver.getDriver().findElement(By.id("confirm-demo")).getText(), "You pressed Cancel!");
//	}
	
	@Test
	public void arrayListMethod() {
	    WebElement cntry = Driver.getDriver().findElement(By.id("files"));
        List<WebElement> options = cntry.findElements(By.tagName("option"));
        Iterator<WebElement> cntryitr = options.iterator();
        while (cntryitr.hasNext()) {
            //System.out.println(cntryitr.next().getAttribute("Value"));
            System.out.println(cntryitr.next().getText());
        }
	}
		
	
	
	@After
	public void afterMtd() {
		
	//	Driver.getDriver().quit();
	}
	

}
