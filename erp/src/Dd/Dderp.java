package Dd;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Dderp {

	public static void main(String[] args) throws BiffException, IOException, InterruptedException
	{
		WebDriver d = new FirefoxDriver();
		d.manage().window().maximize();
		d.get("http://brm.tremplintech.in/web_pages/login.aspx");
		FileInputStream f = new FileInputStream("F:\\excel\\datadriven.xls\\");
Workbook w = Workbook.getWorkbook(f);
	Sheet s = w.getSheet(0);
	int rowcount = s.getRows();
	int g = 10, h = 20;
	for(int i = 0; i < rowcount  ; i++)
	{
		String un = s.getCell(0, i).getContents();
		String pwd = s.getCell(1, i).getContents();
			d.findElement(By.id("txt_unam")).sendKeys(un);
			d.findElement(By.id("txt_pass")).sendKeys(pwd);
			d.findElement(By.id("Button3")).click();
			Thread.sleep(1000);
			File scr = ((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(scr, new File("F:\\pic\\pic.jpeg"));
			
	if(g == 10)
			//if (d.getTitle().equalsIgnoreCase("http://brm.tremplintech.in/web_pages/ord_reg.aspx"));
			{
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
				
				
				
				Alert a = d.switchTo().alert();
				//String alertmsg = d.switchTo().alert().getText();
				//System.out.println(alertmsg);
				Thread.sleep(2000);
				a.accept();
				
				
			//	d.getTitle().equalsIgnoreCase("http://brm.tremplintech.in/web_pages/Customer.aspx");
				d.findElement(By.linkText("Customermanagement")).click();
				d.findElement(By.id("ContentPlaceHolder1_txt_compname")).sendKeys("Amazak");
				d.findElement(By.id("ContentPlaceHolder1_txt_addr")).sendKeys("dubai bus stand");
				Select mystate1 = new Select(d.findElement(By.id("ContentPlaceHolder1_ddl_state")));
				mystate1.selectByValue("Tamil Nadu");
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
				
				File scr2 = ((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(scr2, new File("F:\\pic\\pic2.jpeg"));
				
				Alert a1 = d.switchTo().alert();
				//String alertmsg1 = d.switchTo().alert().getText();
				//System.out.println(alertmsg1);
				Thread.sleep(4000);
				a1.accept();
				Thread.sleep(5000);
				d.switchTo().frame(0);
				d.findElement(By.id("LinkButton1")).click();
			}	
			else
			{
				System.out.println("error");
			}
			}}
		
			
	}
//d.findElement(By.linkText("LOGOUT")).click();
		/*			
			}
	else if (g < h)		
	//else if(d.getTitle().equalsIgnoreCase("http://brm.tremplintech.in/web_pages/ord_reg.aspx"))
			{
		*/
