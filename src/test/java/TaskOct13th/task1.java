package TaskOct13th;

import java.util.Iterator;
import java.util.Set;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

import test.utilities.BrowserUtils;
import test.utilities.Driver;

public class task1 {
	
	@Before
	public void beforetest () {
		Driver.getDriver().get("https://the-internet.herokuapp.com");
		Driver.getDriver().manage().window().maximize();
	}
	
	@Test
	public void test () {
		Driver.getDriver().findElement(By.xpath("//*[@id=\"content\"]/ul/li[33]/a")).click();
		System.out.println("<<<<<<<<<<<<<<<<<< Title of the main window >>>>>>>>>>>>>>>>>>>>>>>");
		System.out.println(Driver.getDriver().getTitle());	
		Driver.getDriver().findElement(By.xpath("//*[@id=\"content\"]/div/a")).click();
		Set<String> str = Driver.getDriver().getWindowHandles();
		Iterator<String> itr = str.iterator();
		String parentId = itr.next();
		String childId = itr.next();
		Driver.getDriver().switchTo().window(childId);
		System.out.println("<<<<<<<<<<<<<<<<<< Title of the new tab window >>>>>>>>>>>>>>>>>>>>>");
		System.out.println(Driver.getDriver().getTitle());
		Driver.getDriver().switchTo().window(parentId);
		System.out.println("<<<<<<<<<<<<<<<<<< Title of the main window again>>>>>>>>>>>>>>>>>>>");
		System.out.println(Driver.getDriver().getTitle());
	}
	
	@After
	public void Aftertest () {
		Driver.getDriver().close();
	}

}
