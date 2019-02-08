package Ng1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Dd1 {
  @Test
  public void f() {
	  WebDriver d = new FirefoxDriver();
	  d.manage().window().maximize();
	  Reporter.log("d");
	  d.get("http://brm.tremplintech.in/web_pages/login.aspx");
	  d.close();  
  }
}
