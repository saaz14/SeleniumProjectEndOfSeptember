package SecondProject;

import java.util.Iterator;
import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import test.utilities.Driver;

public class UsingLoop {

	@Test
	public void test() throws InterruptedException {
		
		Driver.getDriver().get("http://demo.automationtesting.in/Register.html");
		
		Driver.getDriver().findElement(By.id("Skills")).sendKeys("Tech Support");
		
		WebElement dropdown = Driver.getDriver().findElement(By.id("Skills"));
		
		 List<WebElement> options = dropdown.findElements(By.tagName("option"));

		 Iterator<WebElement> it=options.iterator();

		   while(it.hasNext())
		    {
			   
		      System.out.println(it.next().getAttribute("Value"));
		        	  
		    }
		   
	
		 
// --------------------------------------------------------------------------------------------------------
		   
		   WebElement x= Driver.getDriver().findElement(By.id("daybox"));

		   List<WebElement> Option = x.findElements(By.tagName("option"));

		   for(int i=0;i<Option.size();i++)

		   {
			   System.out.println(i);

		   if(Option.get(i).getText().equalsIgnoreCase("25"))

		   {

		   Option.get(i).click();

		   }
		   

		   }
}
}
