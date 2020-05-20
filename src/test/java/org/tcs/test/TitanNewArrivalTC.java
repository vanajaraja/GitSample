package org.tcs.test;

import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TitanNewArrivalTC {
	public static WebDriver driver;
	public Date startTime;
	public Date endTime;
	
	@BeforeClass
	public static void browserLaunch() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\RAJAPPA\\Desktop\\Vanaja\\MavenProjects\\SamProject\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(5000);
		driver.get("https://www.titan.co.in/");
	}
	
	@AfterClass
	public static void quiteBrowser() {
		driver.quit();
	}
	
	@Before
	public void startTime() {
		startTime = new Date();
		System.out.println(startTime);
	}
	@After
	public void EndTime() {
		endTime = new Date();
		System.out.println(endTime);
		
		}
	@Test
	public void titanLogIn() {
		
		WebElement lnkLogIn = driver.findElement(By.id("loginPath"));
		lnkLogIn.click();
		
		String title = driver.getTitle();
		Assert.assertEquals("Verifying the page title", "MyAccount", title);
		WebElement txtUserName = driver.findElement(By.id("username"));
		txtUserName.sendKeys("vanajasadasivam@gmail.com");
		
		
	}	
	

}
