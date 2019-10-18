package HomeworkOct16th;

import org.junit.Assert;
import org.openqa.selenium.By;

import test.utilities.ConfigurationReader;
import test.utilities.Driver;

public class RefMethodscase1 {
	
	public static void Navigate() {
		//1. Navigate to https://s2.demo.opensourcecms.com/orangehrm/symfony/web/index.php/auth/login
				Driver.getDriver().get(ConfigurationReader.getProperty("HMurl"));
				Driver.getDriver().manage().window().maximize();
	}
	
	public static void Login() {
       //2. Login using valid Credentials provided
				Driver.getDriver().findElement(By.id("txtUsername")).sendKeys(ConfigurationReader.getProperty("username"));
				Driver.getDriver().findElement(By.id("txtPassword")).sendKeys(ConfigurationReader.getProperty("password"));
				Driver.getDriver().findElement(By.id("btnLogin")).click();
	}

	public static void ValidateWellcome() {
		//3. Validate you're logged in by verifying "Welcome Admin"
				String validate = Driver.getDriver().findElement(By.xpath("//*[@id=\"option-menu\"]/li[1]")).getText();
				Assert.assertTrue(validate.contains("Welcome Admin"));
	}
	
	public static void AdminLink() {
		//4. Click on 'ADMIN' to navigate to the page
				Driver.getDriver().findElement(By.xpath("//*[@id=\"admin\"]/a/span")).click();
	}
	
	public static void verifyGenInfo() {
		//5. Verify 'General Information'
				Driver.getDriver().switchTo().frame("rightMenu");
				String varify = Driver.getDriver().findElement(By.id("genInfoHeading")).getText();
				Assert.assertTrue(varify.contains("General Information"));
	}
	
	public static void navBack() {
		//6. Navigate back to previous page
				Driver.getDriver().navigate().back();
	}
	
	public static void logout() {
	//7. Log Out
			Driver.getDriver().findElement(By.xpath("//*[@id=\"option-menu\"]/li[3]/a")).click();
	}
	
	public static void VerifyLogout() {
		//8. Verify you logout
				String logoutconfirm = Driver.getDriver().findElement(By.xpath("//*[@id=\"logInPanelHeading\"]")).getText();
				Assert.assertTrue(logoutconfirm.contains("LOGIN Panel"));
	}
	
	public static void closeBrowser() {
		Driver.getDriver().close();
	}
}
