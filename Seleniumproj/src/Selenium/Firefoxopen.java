package Selenium;
import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.*;

public class Firefoxopen {

	public static void main(String[] args) throws InterruptedException {
		WebDriver d = new FirefoxDriver(); 
	
d.manage().window().maximize();
		d.get("http://brm.tremplintech.in/web_pages/login.aspx");
d.findElement(By.id("txt_unam")).sendKeys("sylix");
d.findElement(By.name("txt_pass")).sendKeys("admin");
d.findElement(By.name("Button3")).click();
d.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
d.findElement(By.linkText("Customermanagement")).click();
d.findElement(By.id("ContentPlaceHolder1_txt_compname")).sendKeys("Amazak");
d.findElement(By.id("ContentPlaceHolder1_txt_addr")).sendKeys("dubai bus stand");

Select mystate = new Select(d.findElement(By.id("ContentPlaceHolder1_ddl_state")));
mystate.selectByValue("Tamil Nadu");

d.findElement(By.id("ContentPlaceHolder1_txt_city")).sendKeys("Tirupur");
d.findElement(By.id("ContentPlaceHolder1_txt_compph")).sendKeys("9874563214");
d.findElement(By.name("ctl00$ContentPlaceHolder1$txt_compmbl")).sendKeys("9876543219");
d.findElement(By.id("ContentPlaceHolder1_txt_compemail")).sendKeys("haiman@gmail.com");
d.findElement(By.id("ContentPlaceHolder1_txt_fax")).sendKeys("9632587410");
d.findElement(By.id("ContentPlaceHolder1_txt_cntname")).sendKeys("Sekar");
d.findElement(By.id("ContentPlaceHolder1_txt_cntdsgn")).sendKeys("QA");
d.findElement(By.id("ContentPlaceHolder1_txt_cntemail")).sendKeys("gnana@gmail.com");
d.findElement(By.id("ContentPlaceHolder1_txt_cntmbl")).sendKeys("9994441475");
d.findElement(By.id("ContentPlaceHolder1_txt_cmts")).sendKeys("I am Professional");
d.findElement(By.id("ContentPlaceHolder1_txt_bllcntname")).sendKeys("arun");
d.findElement(By.id("ContentPlaceHolder1_txt_blldsgn")).sendKeys("TL");
d.findElement(By.id("ContentPlaceHolder1_txt_bllph")).sendKeys("9865321477");
d.findElement(By.id("ContentPlaceHolder1_txt_bllmbl")).sendKeys("8974563210");
d.findElement(By.id("ContentPlaceHolder1_txt_bllemail")).sendKeys("gopiman@gmail.com");

d.findElement(By.name("ctl00$ContentPlaceHolder1$Button2")).click();
d.switchTo().alert().accept();
/*String alertmsg = d.switchTo().alert().getText();
System.out.println(alertmsg);
d.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
a.accept();*/
d.findElement(By.linkText("LOGOUT")).click();
d.quit();

/*WebDriverWait w = new WebDriverWait(d, 10);
w.until(ExpectedConditions.presenceOfElementLocated(By.id("txt_unam")));


Select dropdown = new Select(d.findElement(By.id("ContentPlaceHolder1_ddl_state"))).selectByValue("Tamil Nadu");
*/
	}

}
