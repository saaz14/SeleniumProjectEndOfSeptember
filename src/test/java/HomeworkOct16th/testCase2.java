package HomeworkOct16th;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class testCase2 extends refMethodcase2{
	@Before
	public void b4Test2() {
		navigate();
	}

	@Test
	public void case2() {
		DemoTab();
		captureUserPass();
		navToNewpage();
		switchWindow();
		MyAccountLogin();
		SignIn();
		Verifygreeting();
	}

	@After
	public void AfterTest2() {
		closeBrowser();
	}
}
