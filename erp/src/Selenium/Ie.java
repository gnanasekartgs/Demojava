package Selenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Ie {

	public static void main(String[] args) {

		System.setProperty("webdriver.ie.driver","F:\\chromedriver_win32\\chromedriver.exe");
		WebDriver d = new InternetExplorerDriver();
		d.get("https://www.facebook.com/");
			

	}

}
