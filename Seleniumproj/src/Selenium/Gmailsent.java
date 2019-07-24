package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Gmailsent {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver d = new FirefoxDriver();
		d.get("https://accounts.google.com/ServiceLogin");
	d.manage().window().maximize();
d.findElement(By.id("identifierId")).sendKeys("gnanasekar5500@gmail.com");
d.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div[2]/div/div/div[2]/div/div[2]/div/div[1]/div/content/span")).click();
Thread.sleep(1000);
d.findElement(By.xpath(".//*[@id='password']/div[1]/div/div[1]/input")).sendKeys("");
d.findElement(By.xpath(".//*[@id='passwordNext']/content/span")).click();

Thread.sleep(2000);
d.findElement(By.xpath("html/body/div[2]/c-wiz/div/div/div[5]/div[2]/c-wiz/div/div[1]/div/div[1]/div[2]/a[2]")).click();
Thread.sleep(3000);
d.findElement(By.className("T-I J-J5-Ji T-I-KE L3")).click();

//d.findElement(By.cssSelector(".T-I.J-J5-Ji.T-I-KE.L3.T-I-JO")).click();

//d.findElement(By.xpath(".//*[@id=':41']/div/div")).click();

//d.findElement(By.xpath("html/body/div[7]/div[3]/div/div[2]/div[1]/div[1]/div[1]/div[2]/div/div/div/div[1]/div/div")).click();
Thread.sleep(1000);
d.findElement(By.id(":6y")).sendKeys("gl.com");
d.findElement(By.id(":7g")).sendKeys("hai");
d.findElement(By.id(":7q")).click();
	}

}
