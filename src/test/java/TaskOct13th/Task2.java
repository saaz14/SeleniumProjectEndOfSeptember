package TaskOct13th;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import test.utilities.BrowserUtils;
import test.utilities.Driver;

public class Task2 {
	
	@Before
	public void Bfrtsk () {
		//Navigating to the web page
		Driver.getDriver().get("https://www.toolsqa.com/iframe-practice-page/");
		Driver.getDriver().manage().window().maximize();
		
		//close header accept
        Driver.getDriver().findElement(By.xpath("//*[@id=\"cookie_action_close_header\"]")).click();
	}
	
	@Test
	public void tsk2 () {
		
		//create java script scroll to "Practice your Skills"
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        WebElement Element = Driver.getDriver().findElement(By.xpath("//*[@id=\"content\"]/p[4]"));
        js.executeScript("arguments[0].scrollIntoView();", Element);
        BrowserUtils.waitFor(2);
        
        //Stepping in to iFrame2
        Driver.getDriver().switchTo().frame("IF2");
        BrowserUtils.waitFor(2);
        
        //Clicking on droppable.
        Driver.getDriver().findElement(By.xpath("//*[@id=\"sidebar\"]/aside[1]/ul/li[4]/a")).click();
        BrowserUtils.waitFor(2);
        
      
        //create java script scroll to "Drop here"
        WebElement Elmt1 = Driver.getDriver().findElement(By.xpath("//*[@id=\"droppable\"]/p"));
        js.executeScript("arguments[0].scrollIntoView();", Elmt1);
        BrowserUtils.waitFor(2);
        
      //drag and drop
        WebElement source = Driver.getDriver().findElement(By.xpath("//*[@id=\"draggable\"]"));
        WebElement target = Driver.getDriver().findElement(By.xpath("//*[@id=\"droppable\"]"));
      
        BrowserUtils.dragAndDrop(source, target);
        
		
	}
	
	@After
	public void aftrtask2 () {
		Driver.getDriver().close();
	}

}
