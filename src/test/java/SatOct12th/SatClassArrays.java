package SatOct12th;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import test.utilities.BrowserUtils;
import test.utilities.ConfigurationReader;
import test.utilities.Driver;

public class SatClassArrays {

	@Before
	public void beforeTest() {
		
		Driver.getDriver().get(ConfigurationReader.getProperty("arrayUrl"));
		Driver.getDriver().manage().window().maximize();
	}
	
//	@Test
//	public void AraayTest() {
//		
//		Driver.getDriver().findElement(By.id("search_query_top")).sendKeys("Dress");
//		Driver.getDriver().findElement(By.name("submit_search")).click();
//		
//		//Verify that we are now in search results
//		String searchcheck = Driver.getDriver().findElement(By.xpath("//*[@id=\"center_column\"]/h1/span[2]")).getText();
//		Assert.assertTrue(searchcheck.contains("results have been found."));
//		
//		String [] reqText = {"Summer" , "Dress" , "In stock"};
//		
//		List<WebElement> products = Driver.getDriver().findElements(By.xpath("//*[@id=\"center_column\"]/ul/li"));
//		
//		for (int i = 0 ; i < products.size() ; i++) {
//			
//			String name = products.get(i).getText();
//			System.out.println(name + " -- " + i);
//			
//			if (name.contains(reqText[0]) && name.contains(reqText[1]) && name.contains(reqText[2])) {
//				
//				 BrowserUtils.hover(Driver.getDriver().findElements(By.xpath("//span[@class=\"available-now\"]")).get(i));
//				 
//				 Driver.getDriver().findElements(By.xpath("//a[@class=\"button ajax_add_to_cart_button btn btn-default\"]")).get(i).click();
//				 BrowserUtils.waitFor(2);
//				 
//				 Driver.getDriver().findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/span")).click();
//				 BrowserUtils.waitFor(2);
//			}
//			
//		}
//		
//	}
	
//	@Test
//	public void actionclass() {
//        
//        //hoverOver
//        BrowserUtils.hover(Driver.getDriver().findElement(By.xpath("//a[@title=\"Women\"]")));
//        
//        BrowserUtils.waitFor(2);
//        
//        Assert.assertTrue(Driver.getDriver().findElement(By.xpath("(//a[@title=\"T-shirts\"])[1]")).isDisplayed());
//        
//        //drag and drop--
//        Driver.getDriver().get("https://demoqa.com/droppable/");
//                
//        WebElement source = Driver.getDriver().findElement(By.xpath("//*[@id=\"draggable\"]/p"));
//        WebElement target = Driver.getDriver().findElement(By.xpath("//*[@id=\"droppable\"]"));
//        
//        BrowserUtils.dragAndDrop(source, target);
//        BrowserUtils.waitFor(2);
//        
//        
//        
//        //DoubleClick
//        
//        Driver.getDriver().findElement(By.xpath("//*[@id=\"menu-top\"]/li[4]/a")).click();
//        
//        BrowserUtils.doubleClick(Driver.getDriver().findElement(By.id("doubleClickBtn")));
//        
//        System.out.println(Driver.getDriver().switchTo().alert().getText());
//        
//        Driver.getDriver().switchTo().alert().accept();
//        
//	}
	
//	@Test
//	public void windowHandles() {
//		
//		Driver.getDriver().get("https://demoqa.com/automation-practice-switch-windows/");
//        
//	    //firstWindow
//	        Driver.getDriver().findElement(By.xpath("//*[@id=\"button1\"]")).click();
//	        System.out.println("Before Switching");
//            System.out.println(Driver.getDriver().getTitle());
//            
//            Set<String>ids1=Driver.getDriver().getWindowHandles();
//            Iterator<String> it1 = ids1.iterator();
//            String parentId1 = it1.next();
//            String childID1 = it1.next();
//            Driver.getDriver().switchTo().window(childID1);
//            
//            System.out.println("After Switching");
//            System.out.println(Driver.getDriver().getTitle());
//            //
//            Driver.getDriver().switchTo().window(parentId1);
//            System.out.println("Switching Back To Parent");
//            System.out.println(Driver.getDriver().getTitle());
//		
//	    //SecondWindow
//	        //Driver.getDriver().findElement(By.xpath("//*[@id=\"content\"]/div[2]/button[2]")).click();
//	    //ThirdLink    
//	        Driver.getDriver().findElement(By.xpath("//*[@id=\"content\"]/div[2]/button[3]")).click();
//	        
//	            System.out.println("Before Switching");
//	            System.out.println(Driver.getDriver().getTitle());
//	            
//	            Set<String>ids=Driver.getDriver().getWindowHandles();
//	            Iterator<String> it = ids.iterator();
//	            String parentId = it.next();
//	            String childID = it.next();
//	            Driver.getDriver().switchTo().window(childID);
//	            
//	            System.out.println("After Switching");
//	            System.out.println(Driver.getDriver().getTitle());
//	            //
//	            Driver.getDriver().switchTo().window(parentId);
//	            System.out.println("Switching Back To Parent");
//	            System.out.println(Driver.getDriver().getTitle());
//	}
	
	
	@Test
	public void iFramePractice() {
		
		 Driver.getDriver().get("https://www.toolsqa.com/iframe-practice-page/");
	        
	        Driver.getDriver().manage().window().maximize();
	        
	        //close header accept
	        Driver.getDriver().findElement(By.xpath("//*[@id=\"cookie_action_close_header\"]")).click();
	        
	        //create java script scroll diver
	        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
	        
	        BrowserUtils.waitFor(2);
	        
	        Driver.getDriver().switchTo().frame("IF1");
	        BrowserUtils.waitFor(3);
	        
	        //Click on link
	        Driver.getDriver().findElement(By.xpath("//*[@id=\"primary-menu\"]/li[7]/ul/li[4]/a/span/span")).click();

	        //scroll
	        WebElement Element = Driver.getDriver().findElement(By.xpath("//*[@id=\"content\"]/p[4]"));
	        js.executeScript("arguments[0].scrollIntoView();", Element);
	        
	        
	        Driver.getDriver().switchTo().frame("IF2");
	        BrowserUtils.waitFor(3);
	        
	        //Click on Radio Button link
	        Driver.getDriver().findElement(By.xpath("//*[@id=\"sidebar\"]/aside[2]/ul/li[16]/a")).click();
	}
	
//	@After
//	public void Aftertest() {
//		Driver.getDriver().close();
//	}

}
