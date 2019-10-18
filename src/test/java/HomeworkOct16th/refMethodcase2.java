package HomeworkOct16th;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import test.utilities.BrowserUtils;
import test.utilities.ConfigurationReader;
import test.utilities.Driver;

public class refMethodcase2 {
	
	public static void navigate() {
//		1. Navigate to https://phptravels.com/
		Driver.getDriver().get(ConfigurationReader.getProperty("HMurl2"));
		Driver.getDriver().manage().window().maximize();
	}
	
	public void DemoTab() {
//		2. Click tab 'Demo' and Navigate to the page
		Driver.getDriver().findElement(By.xpath("//*[@id=\"ShopifyMainNav\"]/ul[1]/li[1]/a")).click();
	}

	public static void captureUserPass() {
//		3. Capute the Username and Password of 'Homepage Front-End'
		
		String username = Driver.getDriver().findElement(By.xpath("//*[@id=\"Main\"]/section[2]/div/div/div[2]/div/div/div[2]/div[2]/div/div[3]/div[2]/div/strong[1]")).getText();
		String password = Driver.getDriver().findElement(By.xpath("//*[@id=\"Main\"]/section[2]/div/div/div[2]/div/div/div[2]/div[2]/div/div[3]/div[2]/div/strong[2]")).getText();
		System.out.println("Homepage Front-end Username is: " + username + "\nHomepage Front-end Password is: " + password);
	}
	
	public static void navToNewpage() {
//		4. Navigate to 'https://www.phptravels.net/' by clicking on the button
		Driver.getDriver().findElement(By.xpath("//*[@id=\"Main\"]/section[2]/div/div/div[2]/div/div/div[2]/div[2]/div/div[1]/div/a")).click();
	}
	
	public static void switchWindow() {
//		5. switch your window to the childWindow
		Driver.getDriver().switchTo().window(Driver.getDriver().getWindowHandles().iterator().next());
		BrowserUtils.waitFor(8);
		
	}
	
	public static void MyAccountLogin() {
//		6. click on "MY ACCOUNT" and click on 'login'
		BrowserUtils.waitForVisibility(Driver.getDriver().findElement(By.xpath("(//*[@id=\"li_myaccount\"]/a)[2]")), 5).click();
		Driver.getDriver().findElement(By.xpath("//*[@id=\"li_myaccount\"]/ul/li[1]/a")).click();
	}
	
	public static void SignIn() {
//		7. sign in using Captured Credentials
		Driver.getDriver().findElement(By.name("username")).sendKeys(ConfigurationReader.getProperty("CapUser"));
		Driver.getDriver().findElement(By.name("password")).sendKeys(ConfigurationReader.getProperty("CapPass"));
		Driver.getDriver().findElement(By.xpath("//*[@id=\"loginfrm\"]/button")).click();
	}
	
	public static void Verifygreeting() {
//		8. verify 'Hi, Demo User' on the page	
		String validate = Driver.getDriver().findElement(By.xpath("//*[@id=\"body-section\"]/div[1]/div/div/div[1]/h3")).getText();
		Assert.assertTrue(validate.contains("Hi, Demo User"));
	}
	
	public static void closeBrowser() {
		Driver.getDriver().close();
	}

}
