package Selenium;

import org.apache.http.annotation.ThreadSafe;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Jabang {

	public static void main(String[] args) throws InterruptedException {
		WebDriver d = new FirefoxDriver();
		d.manage().window().maximize();
		/*d.get("https://www.jabong.com/");
		Thread.sleep(1000);
		d.findElement(By.xpath(".//*[@id='user-salutation']/a[3]")).click();
		d.findElement(By.id("firstname")).sendKeys("gnanasekar");
		d.findElement(By.id("lastname")).sendKeys("T");
		d.findElement(By.id("email")).sendKeys("gnanal.com");
		d.findElement(By.id("accessKey")).sendKeys("3");
		d.findElement(By.id("mobile")).sendKeys("");
		Thread.sleep(1000);
		//d.findElement(By.className("custom-radio")).click();
		d.findElement(By.id("female")).click();
		d.findElement(By.id("btn-signup")).click();*/
		
		d.get("https://login.yahoo.com/?.src=ym&lang=&done=https%3A%2F%2Fmail.yahoo.com%2F");
		d.findElement(By.id("login-username")).sendKeys("@ymail.com");
		WebElement we = d.findElement(By.id("persistent"));
		for (int i = 0;  i<2; i++)
		{
			we.click();
			System.out.println(we.isSelected());
		}
		Thread.sleep(1000);		
		d.findElement(By.id("login-signin")).click();

	}

}
