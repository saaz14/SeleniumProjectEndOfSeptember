package SecondProject;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

import test.utilities.ConfigurationReader;
import test.utilities.Driver;

public class CheckBoxTest {

		@Before
		public void beforeMethod() {
			
			Driver.getDriver().get(ConfigurationReader.getProperty("url3"));
		
	}
		
		@Test
		public void radioButtonAndcheckBoxes() {
			Driver.getDriver().findElement(By.xpath(ConfigurationReader.getProperty("CheckBoxes"))).click();
			
			boolean CheckBox1Selected = Driver.getDriver().findElement(By.xpath(ConfigurationReader.getProperty("checkBox1"))).isSelected();
			boolean CheckBox2Selected = Driver.getDriver().findElement(By.xpath(ConfigurationReader.getProperty("checkBox2"))).isSelected();
			
			if (CheckBox1Selected) {
				System.out.println("First Checkbox is already selected!");
			} else {
				Driver.getDriver().findElement(By.xpath(ConfigurationReader.getProperty("checkBox1"))).click();
				System.out.println("First CheckBox was just checked now");
			}
			
			if (CheckBox2Selected) {
				System.out.println("Second Checkbox is already selected!");
			} else {
				Driver.getDriver().findElement(By.xpath(ConfigurationReader.getProperty("checkBox2"))).click();
			}

}
}
