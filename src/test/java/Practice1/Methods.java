package Practice1;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import test.utilities.Driver;

public class Methods {
	
	
	public static void sgnin() throws InterruptedException {
		Driver.getDriver().findElement(By.id("email")).sendKeys("abc.xyz.com");
		Driver.getDriver().findElement(By.id("enterimg")).click();
	}
	
	
	public static void slctlogo() throws InterruptedException {
		WebElement uploadElement = Driver.getDriver().findElement(By.id("imagesrc"));
        uploadElement.sendKeys("C:\\Users\\Aqeel\\Desktop\\TechCircle LOGO_PNG.webp");
        
        
	}
	
	public static void BaseInfo() throws InterruptedException {
		Driver.getDriver().findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[1]/input")).sendKeys("ABC");
		Driver.getDriver().findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[2]/input")).sendKeys("XYZ");
		Driver.getDriver().findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[2]/div/textarea")).sendKeys("15 abc st. Virginia.");
		Driver.getDriver().findElement(By.xpath("//*[@id=\"eid\"]/input")).sendKeys("abc@xyz.com");
		Driver.getDriver().findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[4]/div/input")).sendKeys("1234567890");
		
	}
	
	
	public static void Gender() throws InterruptedException {
		Driver.getDriver().findElement(By.name("radiooptions")).click();
	}
	
	public static void Hobbies() throws InterruptedException {
		Driver.getDriver().findElement(By.xpath("//*[@id=\"checkbox1\"]")).click();
		Driver.getDriver().findElement(By.xpath("//*[@id=\"checkbox2\"]")).click();
		Driver.getDriver().findElement(By.xpath("//*[@id=\"checkbox3\"]")).click();
	}
	
	
	public static void Language() throws InterruptedException {
	Driver.getDriver().findElement(By.id("msdd")).click();
	Driver.getDriver().findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[7]/div/multi-select/div[2]/ul/li[40]")).click();
	Driver.getDriver().findElement(By.xpath("//*[@id=\"eid\"]/input")).click();
	}

	
	public static void Skills() throws InterruptedException {
		System.out.println("\n=====================================================================================\nSKILLS LIST::");
		Select skillsDropDown = new Select(Driver.getDriver().findElement(By.id("Skills")));
		skillsDropDown.selectByVisibleText("Java");
		WebElement dropdown = Driver.getDriver().findElement(By.id("Skills"));
		List<WebElement> options = dropdown.findElements(By.tagName("option"));
		Iterator<WebElement> it = options.iterator();
		while (it.hasNext()) {
			System.out.println(it.next().getAttribute("Value"));
		}
		System.out.println("\n=====================================================================================");
	}
	
	
	public static void Countries() throws InterruptedException {
		System.out.println("\n=====================================================================================\nCOUNTRIES LIST::");
		Select countriesDropDown = new Select(Driver.getDriver().findElement(By.id("countries")));
		countriesDropDown.selectByVisibleText("Pakistan");
		WebElement cntry = Driver.getDriver().findElement(By.id("countries"));
		List<WebElement> options = cntry.findElements(By.tagName("option"));
		Iterator<WebElement> cntryitr = options.iterator();
		while (cntryitr.hasNext()) {
			System.out.println(cntryitr.next().getAttribute("Value"));
		}
		System.out.println("\n=====================================================================================");
	}
	
	public static void country2nd() throws InterruptedException {
		Driver.getDriver().findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[10]/div/span/span[1]/span")).click();
		Driver.getDriver().findElement(By.xpath("//*[@id=\"select2-country-results\"]/li[2]")).click();
		Driver.getDriver().findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[4]/div/input")).click();
	}
	

	public static void DOB() throws InterruptedException {
		WebElement x = Driver.getDriver().findElement(By.id("yearbox"));
		List<WebElement> Year = x.findElements(By.tagName("option"));
		for (int i = 0; i < Year.size(); i++) {
			if (Year.get(i).getText().equalsIgnoreCase("1983")) {
				Year.get(i).click();
				break;
			}
		}
		
		Driver.getDriver().findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[11]/div[2]/select")).sendKeys("February");;

		System.out.println("\n=====================================================================================\nDAYS LIST ::");
		WebElement z = Driver.getDriver().findElement(By.id("daybox"));
		List<WebElement> Day = z.findElements(By.tagName("option"));
		for (int i = 0; i < Day.size(); i++) {
			System.out.println(i);
			if (Day.get(i).getText().equalsIgnoreCase("18")) {
				Day.get(i).click();
			}
		}
		System.out.println("\n=====================================================================================");
	}
	
	
	public static void Password() throws InterruptedException {
		Driver.getDriver().findElement(By.id("firstpassword")).sendKeys("TechCircle@1");
		Driver.getDriver().manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
		
		Driver.getDriver().findElement(By.id("secondpassword")).sendKeys("TechCircle@1");
		Driver.getDriver().manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
	}
	
	
	public static void Submit() throws InterruptedException {
		Driver.getDriver().findElement(By.id("submitbtn")).click();
	}
}
