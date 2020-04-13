package Practice1;

import org.junit.Test;

import test.utilities.ConfigurationReader;
import test.utilities.Driver;

public class extention extends Methods {
	
	@Test
	public void Test1() throws InterruptedException {
		
		
		Driver.getDriver().get(ConfigurationReader.getProperty("url1"));
		
		sgnin();
	//	slctlogo();
		BaseInfo();
		Gender();
		Hobbies();
		Language();
		Skills();
		Countries();
		country2nd();
		DOB();
		Password();
		Submit();
		
		Driver.getDriver().close();
	}

}
