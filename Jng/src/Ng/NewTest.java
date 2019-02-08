package Ng;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest {
	 WebDriver d;
	String expectedTitle = null;
	String actualTitle= null;
	
	@BeforeTest
 public void openapp()
 {
	d = new FirefoxDriver(); 
d.manage().window().maximize();
	d.get("http://brm.tremplintech.in/web_pages/login.aspx");
 }
	
	@BeforeMethod
	public void Head()
	{
		expectedTitle = "http://brm.tremplintech.in/web_pages/login.aspx";
		actualTitle = d.getTitle();
		Assert.assertEquals(actualTitle, actualTitle);
	}
	
	@Test(priority = 1)
	public void Test1()
	{
		d.navigate().back();
	
	}
	
	@AfterMethod
	public void end()
	{
		d.navigate().refresh();
		
	}
	@Test(priority = 2, enabled = false, alwaysRun = true)
	public void test() 
	{
		d.findElement(By.id("txt_unam")).sendKeys("sylix");
		d.findElement(By.name("txt_pass")).sendKeys("admin");
		d.findElement(By.name("Button3")).click();
	}

	@Test(priority = 0)
	public void Tests() 
	{
		d.findElement(By.id("txt_unam")).sendKeys("sylix");
		d.findElement(By.name("txt_pass")).sendKeys("admin");
		d.findElement(By.name("Button3")).click();
	}

	@AfterTest
	public void closeapp()
	{
		
		d.close();
	}
		
}

