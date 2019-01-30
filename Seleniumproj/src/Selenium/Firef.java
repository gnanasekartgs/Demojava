package Selenium;
import java.sql.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.*;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Firef {

	public static void main(String[] args) throws InterruptedException {
		WebDriver d = new FirefoxDriver(); 
		
d.manage().window().maximize();
		d.get("https://timesofindia.indiatimes.com/");
		Thread.sleep(1000);
		d.switchTo().frame("html/body/div[1]/div[7]/div/div[11]/div[2]/div/div[1]/ul/li[1]/span");
//d.switchTo().frame((WebElement) By.xpath(".//*[@id='aw0']/amp-img/img"));
d.findElement(By.xpath("html/body/div[1]/div[7]/div/div[11]/div[2]/div/div[1]/ul/li[1]/span")).click();

WebDriverWait w = (WebDriverWait) new WebDriverWait(d, 10).until(ExpectedConditions.presenceOfElementLocated(By.id("")));


/*d.until(ExpectedConditions.visibilityOfElementLocated(By.id("")));
WebElement e = d.until(ExpectedConditions.visibilityOfElementLocated(By.id("")));
d.get("http://brm.tremplintech.in/web_pages/login.aspx");
		d.findElement(By.id("txt_unam")).sendKeys("sylix");
		d.findElement(By.name("txt_pass")).sendKeys("admin");
		d.findElement(By.tagName("input")).click();
		d.switchTo().frame(By.)
		//d.findElement(By.name("Button3")).click();
	*/	
		
	}
}