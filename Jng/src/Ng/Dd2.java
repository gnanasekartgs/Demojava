package Ng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Dd2 {
  @Test
  public void f() {
  WebDriver d = new FirefoxDriver();
  d.manage().window().maximize();
  Reporter.log("Hai");
  d.get("http://brm.tremplintech.in/web_pages/login.aspx");
  Reporter.log("BYe");
  d.close();
  
  }
}
