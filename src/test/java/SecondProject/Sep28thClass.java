package SecondProject;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Sep28thClass {
	
	static String projectPath = System.getProperty("user.dir");
	static WebDriver myFirstWebDriver;
	
	@Test
	public void test1() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", projectPath + "\\Drivers\\chromedriver.exe");
		
		WebDriver myFirstWebDriver = new ChromeDriver();
		
//		myFirstWebDriver.get("https://www.google.com");
//		
//		myFirstWebDriver.manage().window().maximize();
		
//		System.out.println("Title of this page is: " + myFirstWebDriver.getTitle());
//		System.out.println("URL of this page is: " + myFirstWebDriver.getCurrentUrl());
//		System.out.println("Page Source of this page is: " + myFirstWebDriver.getPageSource());
//		System.out.println("Windows Handle this page is: " + myFirstWebDriver.getWindowHandle());
		
		
		myFirstWebDriver.get("http://demo.automationtesting.in/Index.html");
		myFirstWebDriver.manage().window().maximize();
		System.out.println("Title of this page is: " + myFirstWebDriver.getTitle());
//		myFirstWebDriver.navigate().back();
//		myFirstWebDriver.navigate().forward();
		
	
		myFirstWebDriver.findElement(By.id("email")).sendKeys("aqeel.zaidi@gmail.com");
		myFirstWebDriver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		
		myFirstWebDriver.findElement(By.id("enterimg")).click();
		myFirstWebDriver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
		
		myFirstWebDriver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[1]/input")).sendKeys("Aqeel");
		myFirstWebDriver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
		
		myFirstWebDriver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[2]/input")).sendKeys("Zaidi");
		myFirstWebDriver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
		
		myFirstWebDriver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[2]/div/textarea")).sendKeys("ABC street 1, VA");
		myFirstWebDriver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
		
		myFirstWebDriver.findElement(By.xpath("//*[@id=\"eid\"]/input")).sendKeys("aqeel.zaidi@gmail.com");
		myFirstWebDriver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
		
		myFirstWebDriver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[4]/div/input")).sendKeys("1234567890");
		myFirstWebDriver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
		
		myFirstWebDriver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[5]/div/label[1]")).click();
		myFirstWebDriver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
		
		myFirstWebDriver.findElement(By.xpath("//*[@id=\"checkbox1\"]")).click();
		myFirstWebDriver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
		
		myFirstWebDriver.findElement(By.id("msdd")).click();
		myFirstWebDriver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		myFirstWebDriver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[7]/div/multi-select/div[2]/ul/li[40]")).click();
		
		myFirstWebDriver.findElement(By.xpath("//*[@id=\"Skills\"]")).sendKeys("Java");
		myFirstWebDriver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
		
		Select countriesDropDown = new Select(myFirstWebDriver.findElement(By.id("countries")));
		countriesDropDown.selectByVisibleText("Pakistan");
		myFirstWebDriver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
		
		myFirstWebDriver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[10]/div/span/span[1]/span")).click();
		myFirstWebDriver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		myFirstWebDriver.findElement(By.xpath("//*[@id=\"select2-country-results\"]/li[11]")).click();
		
		Select DOByear = new Select(myFirstWebDriver.findElement(By.id("yearbox")));
		DOByear.selectByVisibleText("1983");
		myFirstWebDriver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
		
		Select DOBmonth = new Select(myFirstWebDriver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[11]/div[2]/select")));
		DOBmonth.selectByVisibleText("February");
		myFirstWebDriver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
		
		Select DOBday = new Select(myFirstWebDriver.findElement(By.id("daybox")));
		DOBday.selectByVisibleText("18");
		myFirstWebDriver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
		
		myFirstWebDriver.findElement(By.id("firstpassword")).sendKeys("TechCircle@1");
		myFirstWebDriver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
		
		myFirstWebDriver.findElement(By.id("secondpassword")).sendKeys("TechCircle@1");
		myFirstWebDriver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
		
		myFirstWebDriver.findElement(By.id("submitbtn")).click();
		
//		myFirstWebDriver.close();
	}
	
	@Test
	public void loginTest() {
		
		
		
	}

}
