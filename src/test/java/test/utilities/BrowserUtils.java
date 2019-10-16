package test.utilities;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Function;

public class BrowserUtils {
	/*
	 * Switch to new window by the exact title
	 */
//---------------------------------------------------------------------------------------------
	public static WebElement waitForVisibility(WebElement element, int timeToWaitinSec) {
		WebDriverWait wait = new WebDriverWait(Driver.getDriver(), timeToWaitinSec);
		return wait.until(ExpectedConditions.visibilityOf(element));
	}
//---------------------------------------------------------------------------------------------	
	public static WebElement waitForVisibility(By locator, int timeout) {
		WebDriverWait wait = new WebDriverWait(Driver.getDriver(), timeout);
		return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}
//---------------------------------------------------------------------------------------------	
	public static WebElement waitForClickablility(WebElement element, int timeout) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), timeout);
        return wait.until(ExpectedConditions.elementToBeClickable(element));
    }
//---------------------------------------------------------------------------------------------
    public static WebElement waitForClickablility(By locator, int timeout) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), timeout);
        return wait.until(ExpectedConditions.elementToBeClickable(locator));
    }
//---------------------------------------------------------------------------------------------
    public static WebElement fluentWait(final WebElement webElement, int timeinsec) {
        FluentWait<WebDriver> wait = new FluentWait<WebDriver>(Driver.getDriver()).withTimeout(timeinsec, TimeUnit.SECONDS).pollingEvery(timeinsec, TimeUnit.SECONDS).ignoring(NoSuchElementException.class);
        WebElement element = wait.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver) {
                return webElement;
            }
        });
        return element;
    }   
 //---------------------------------------------------------------------------------------------    
    public static void hover(WebElement element) {
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(element).perform();
    }
 //---------------------------------------------------------------------------------------------  
    public static void dragAndDrop(WebElement source , WebElement target) {
        Actions actions = new Actions(Driver.getDriver());
        actions.dragAndDrop(source, target).perform();
    }
 //---------------------------------------------------------------------------------------------  
    public static void doubleClick(WebElement source) {
        Actions actions = new Actions(Driver.getDriver());
        actions.doubleClick(source).perform();
    }
 //---------------------------------------------------------------------------------------------  
    public static void waitFor(int sec) {
        try {
        	Thread.sleep(sec * 1000);
        } catch (InterruptedException e) {
        	e.printStackTrace();
        }
    }
    
}
