package Selenium;
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

public class Gopi {

	
	public static void main(String[] args) throws BiffException,  InterruptedException, IOException {
		WebDriver d= new FirefoxDriver();
		d.get("http://www.brm.tremplintech.in/");
		FileInputStream f= new FileInputStream("F:\\\\excel\\\\datadriven.xls\\");
		Workbook w = Workbook.getWorkbook(f);
		Sheet s = w.getSheet(0);
		int rowcount = s.getRows();
	
		Sheet k=w.getSheet(1);
	try {
		for (int i=0;i < rowcount;i++) {
			String un=s.getCell(0, i).getContents();
			String pd=s.getCell(1, i).getContents();
			//String z=un;
			//String b=pd;
				//System.out.println(z);
				//System.out.println(b);
			d.findElement(By.id("txt_unam")).sendKeys(un);
			d.findElement(By.name("txt_pass")).sendKeys(pd);
			Thread.sleep(2000);
			
			if (un.equals("sylix")&&pd.equals("admin")) {
				
			d.findElement(By.id("Button3")).click();
				Thread.sleep(5000);
			d.findElement(By.linkText("Customermanagement")).click();
			
			
			
				String cmpname=k.getCell(0, i).getContents();
				String add=k.getCell(1, i).getContents();
				String states=k.getCell(2, i).getContents();
				String cty=k.getCell(3, i).getContents();
				String phno=k.getCell(4, i).getContents();
				String mobno=k.getCell(5, i).getContents();
				String em=k.getCell(6, i).getContents();
				String fax=k.getCell(7, i).getContents();
				String name=k.getCell(8, i).getContents();
				String desig=k.getCell(9, i).getContents();
				String email=k.getCell(10, i).getContents();
				String mn=k.getCell(11, i).getContents();
				String name1=k.getCell(12, i).getContents();
				String desig1=k.getCell(13, i).getContents();
				String phno1=k.getCell(14, i).getContents();
				String mn1=k.getCell(15, i).getContents();
				String email1=k.getCell(16, i).getContents();
				String cmts=k.getCell(17, i).getContents();
				
				d.findElement(By.id("ContentPlaceHolder1_txt_compname")).sendKeys(cmpname);
				d.findElement(By.id("ContentPlaceHolder1_txt_addr")).sendKeys(add);
				Select state=new Select(d.findElement(By.id("ContentPlaceHolder1_ddl_state")));
				state.selectByValue(states);
				d.findElement(By.id("ContentPlaceHolder1_txt_city")).sendKeys(cty);
				d.findElement(By.id("ContentPlaceHolder1_txt_compph")).sendKeys(phno);
				d.findElement(By.id("ContentPlaceHolder1_txt_compmbl")).sendKeys(mobno);
				d.findElement(By.id("ContentPlaceHolder1_txt_compemail")).sendKeys(em);
				d.findElement(By.id("ContentPlaceHolder1_txt_fax")).sendKeys(fax);
				d.findElement(By.id("ContentPlaceHolder1_txt_cntname")).sendKeys(name);
				d.findElement(By.name("ctl00$ContentPlaceHolder1$txt_cntdsgn")).sendKeys(desig);
				d.findElement(By.name("ctl00$ContentPlaceHolder1$txt_cntemail")).sendKeys(email);
				d.findElement(By.id("ContentPlaceHolder1_txt_cntmbl")).sendKeys(mn);
				d.findElement(By.id("ContentPlaceHolder1_txt_bllcntname")).sendKeys(name1);
				d.findElement(By.id("ContentPlaceHolder1_txt_blldsgn")).sendKeys(desig1);
				d.findElement(By.id("ContentPlaceHolder1_txt_bllph")).sendKeys(phno1);
				d.findElement(By.id("ContentPlaceHolder1_txt_bllmbl")).sendKeys(mn1);
				d.findElement(By.id("ContentPlaceHolder1_txt_bllemail")).sendKeys(email1);
				d.findElement(By.id("ContentPlaceHolder1_txt_cmts")).sendKeys(cmts);
				d.findElement(By.id("ContentPlaceHolder1_Button2")).click();
				
				//Alert a=
						d.switchTo().alert().accept();
				//String alertmsg=d.switchTo().alert().getText();
				//System.out.println(alertmsg);
				//a.accept();
				
				Thread.sleep(2000);
			
		
			d.findElement(By.linkText("LOGOUT")).click();
			 	
			 	}else {
			 		d.findElement(By.xpath("html/body/form/div[3]/table/tbody/tr[3]/td/table/tbody/tr[4]/td[1]/input")).click();
			 	}
		 	
			 
			 	}
	}catch (Exception e)
	{
		System.out.println("Exp error " +e.getMessage());
	}				
		}
		
	}
