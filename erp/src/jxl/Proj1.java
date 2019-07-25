package jxl;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Proj1 {

	public static void main(String[] args) 
	{
	WebDriver d = new FirefoxDriver();  /*webdriver is selenium class , wd directly comm with firefox driver, java class*/
	d.get("https://www.facebook.com/");

	}

}
