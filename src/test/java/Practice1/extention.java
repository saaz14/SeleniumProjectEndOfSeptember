package Practice1;

import test.utilities.Driver;

public class extention extends Methods {
	
	public static void main(String[] args) throws InterruptedException {
		
		Driver.getDriver().get("http://demo.automationtesting.in/");
		
		sgnin();
		slctlogo();
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
