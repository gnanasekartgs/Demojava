package Dd;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
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

public class Ddifelse {

	public static void main(String[] args) throws BiffException, IOException, InterruptedException
	{
		WebDriver d = new FirefoxDriver();
		d.manage().window().maximize();
		d.get("http://brm.tremplintech.in/web_pages/login.aspx");
		FileInputStream f = new FileInputStream("F:\\excel\\datadriven.xls\\");
		Workbook w = Workbook.getWorkbook(f);
		Sheet s = w.getSheet(0);
		Sheet s1 = w.getSheet(1);
	int rowcount = s.getRows();
	try
	{
	for(int i = 0; i < rowcount  ; i++)
	{
			String un = s.getCell(0, i).getContents();
			String pwd = s.getCell(1, i).getContents();
			d.findElement(By.id("txt_unam")).sendKeys(un);
			d.findElement(By.id("txt_pass")).sendKeys(pwd);
			
		
			if(un.equals("sylix") && pwd.equals("admin"))
			//if (d.getCurrentUrl().equalsIgnoreCase("http://brm.tremplintech.in/web_pages/ord_reg.aspx"))
			{
				
				d.findElement(By.id("Button3")).click();
				Thread.sleep(1000);
		d.findElement(By.linkText("Customermanagement")).click();
			
			String cname = s1.getCell(0, i).getContents();
			String addr = s1.getCell(1, i).getContents();
			String state = s1.getCell(2, i).getContents();
			String city = s1.getCell(3, i).getContents();
			String mno = s1.getCell(4, i).getContents();
			String pno = s1.getCell(5, i).getContents();
			String email = s1.getCell(6, i).getContents();
			String fax = s1.getCell(7, i).getContents();
			String cname1 = s1.getCell(8, i).getContents();
			String dest = s1.getCell(9, i).getContents();
			String cemail = s1.getCell(10, i).getContents();
			String cpno = s1.getCell(11, i).getContents();
			String cmt = s1.getCell(12, i).getContents();
			String bname = s1.getCell(13, i).getContents();
			String bdesg = s1.getCell(14, i).getContents();
			String bpno = s1.getCell(15, i).getContents();
			String bmno = s1.getCell(16, i).getContents();
			String bemail = s1.getCell(17, i).getContents();
			
		
			
				d.findElement(By.id("ContentPlaceHolder1_txt_compname")).sendKeys(cname);
				d.findElement(By.id("ContentPlaceHolder1_txt_addr")).sendKeys(addr);
				//Select mystate = new Select(d.findElement(By.id("ContentPlaceHolder1_ddl_state")));
				//mystate.selectByValue(state);
				d.findElement(By.id("ContentPlaceHolder1_txt_city")).sendKeys(city);
				d.findElement(By.id("ContentPlaceHolder1_txt_compph")).sendKeys(mno);
				d.findElement(By.name("ctl00$ContentPlaceHolder1$txt_compmbl")).sendKeys(pno);
				d.findElement(By.id("ContentPlaceHolder1_txt_compemail")).sendKeys(email);
				d.findElement(By.id("ContentPlaceHolder1_txt_fax")).sendKeys(fax);
				d.findElement(By.id("ContentPlaceHolder1_txt_cntname")).sendKeys(cname1);
				d.findElement(By.id("ContentPlaceHolder1_txt_cntdsgn")).sendKeys(dest);
				d.findElement(By.id("ContentPlaceHolder1_txt_cntemail")).sendKeys(cemail);
				d.findElement(By.id("ContentPlaceHolder1_txt_cntmbl")).sendKeys(cpno);
				d.findElement(By.id("ContentPlaceHolder1_txt_cmts")).sendKeys(cmt);
				d.findElement(By.id("ContentPlaceHolder1_txt_bllcntname")).sendKeys(bname);
				d.findElement(By.id("ContentPlaceHolder1_txt_blldsgn")).sendKeys(bdesg);
				d.findElement(By.id("ContentPlaceHolder1_txt_bllph")).sendKeys(bpno);
				d.findElement(By.id("ContentPlaceHolder1_txt_bllmbl")).sendKeys(bmno);
				d.findElement(By.id("ContentPlaceHolder1_txt_bllemail")).sendKeys(bemail);
				d.findElement(By.name("ctl00$ContentPlaceHolder1$Button2")).click();
				
				d.switchTo().alert().accept();
				
				File scr = ((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(scr, new File("F:\\pic\\pic1.jpeg"));
			d.findElement(By.linkText("LOGOUT")).click();
			}	
		else
		{
			System.out.println("error");
		}
	}
	}
			catch (Exception e)
			{
				System.out.println("Exp error " +e.getMessage());
			}	
	}		
	}

