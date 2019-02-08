package Dd;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


public class For_if {

	public static void main(String[] args) {

		
		WebDriver driver = new FirefoxDriver(); 
		driver.manage().window().maximize(); 
		driver.get("www.google.co.in");

		String newWindow = driver.getWindowHandle();

	driver.findElement(By.xpath(".//*[@id='viewport']")).sendKeys(Keys.CONTROL+"t");
		driver.get("www.facebook.com");
int a=4;
for (int i=0; i<=a; ++i)
{
	if (i>0)
	{
		System.out.println("with in limit");
	}
	else
	{
		System.out.println("out of limit");
	}
}

	}

}
