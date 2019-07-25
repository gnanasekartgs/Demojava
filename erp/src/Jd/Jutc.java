package Jd;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Jutc {
WebDriver d;
	@Before
 public void openapp()
 {
	d = new FirefoxDriver(); 
	
d.manage().window().maximize();
	d.get("http://brm.tremplintech.in/web_pages/login.aspx");

	
 }
	@Test
	public void test() {
		d.findElement(By.id("txt_unam")).sendKeys("sylix");
		d.findElement(By.name("txt_pass")).sendKeys("admin");
		d.findElement(By.name("Button3")).click();
	}
	
@Test
	
	public void test1() {
		d.findElement(By.id("txt_unam")).sendKeys("sylix");
		d.findElement(By.name("txt_pass")).sendKeys("admin1");
		d.findElement(By.name("Button3")).click();
	}

@After
public void closeapp()
{
	d.findElement(By.linkText("LOGOUT")).click();
d.close();
}
}
