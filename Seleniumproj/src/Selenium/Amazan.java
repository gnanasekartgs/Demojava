package Selenium;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class Amazan {

	
	public static void main(String[] args) throws InterruptedException {
		WebDriver d = new FirefoxDriver();
		d.manage().window().maximize();
		d.get("https://www.amazon.in/");
		d.findElement(By.xpath(".//*[@id='nav-link-yourAccount']/span[1]")).click();
			d.findElement(By.id("ap_email")).sendKeys("gnanasekar69@gmail.com");
		d.findElement(By.id("continue")).click();
		d.findElement(By.id("ap_password")).sendKeys("9994551183@Psk");
		d.findElement(By.id("signInSubmit")).click();
		d.findElement(By.id("twotabsearchtextbox")).sendKeys("skull headset");
		d.findElement(By.className("nav-input")).click();
		Thread.sleep(1000);
		d.findElement(By.xpath("html/body/div[1]/div[2]/div/div[3]/div[2]/div/div[4]/div[1]/div/ul/li[1]/div/div/div/div[2]/div[1]/div[1]/a/h2")).click();
		Thread.sleep(2000);
		d.findElement(By.className("a-button-input")).click();
		//d.findElement(By.linkText("Add to Cart")).click();
		//d.findElement(By.xpath(".//*[@id='add-to-cart-button']")).click();
		
		//d.findElement(By.xpath("html/body/div[2]/div[2]/div[5]/div[4]/div[3]/div/div/div/form/div/div/div/div/div[2]/div/div[18]/div/span/span/input")).click();
		//d.findElement(By.cssSelector("#add-to-cart-button")).click();
		
	}

}
