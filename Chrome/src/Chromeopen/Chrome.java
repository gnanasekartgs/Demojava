package Chromeopen;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class Chrome {
public static void main(String[] args) throws InterruptedException
{
	//Map<String, Object> prefs = new HashMap<String, Object>();
    
    // Set the notification setting it will override the default setting
//prefs.put("profile.default_content_setting_values.notifications", 2);

    // Create object of ChromeOption class
ChromeOptions options = new ChromeOptions();
options.addArguments("--disable-notifications");
    // Set the experimental option
//options.setExperimentalOption("prefs", prefs);
	
	System.setProperty("webdriver.chrome.driver", "F:\\chromedriver_win32\\chromedriver.exe");
	WebDriver d = new ChromeDriver();
	d.get("https://www.facebook.com");
	d.manage().window().maximize();
	d.findElement(By.id("email")).sendKeys("gnanasekar69");
	d.findElement(By.id("pass")).sendKeys("9345444780@Home");
	d.findElement(By.id("u_0_2")).click();
	
	String tit = d.getTitle();
	System.out.println(tit);
	d.switchTo().alert().dismiss();
}
}
