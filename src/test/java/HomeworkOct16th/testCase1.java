package HomeworkOct16th;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import test.utilities.Driver;
public class testCase1 extends RefMethodscase1 {

	@Before
	public void b4Test() {
		Navigate();
	}

	@Test
	public void case1() {
		Login();
		ValidateWellcome();
		AdminLink();
		verifyGenInfo();
		navBack();
		logout();
		VerifyLogout();
	}

	@After
	public void AfterTest() {
		closeBrowser();
	}
}
