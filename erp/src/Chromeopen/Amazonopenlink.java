package Chromeopen;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazonopenlink {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "F:\\chromedriver_win32\\chromedriver.exe");
	WebDriver d = new ChromeDriver();
	d.get("https://www.amazon.in/");
	d.manage().window().maximize();
	Thread.sleep(2000);
	String open = Keys.chord(Keys.CONTROL + "n",Keys.RETURN); 
	d.findElement(By.linkText("Today's Deals")).sendKeys(open);
	 ArrayList tabs = new ArrayList (d.getWindowHandles());
	    System.out.println(tabs.size());
	d.switchTo().window((String) tabs.get(1));
	
	String nw = d.getWindowHandle();
	for (String childWindowHandle : d.getWindowHandles()) {
		  //If window handle is not main window handle then close it 
		  if(!childWindowHandle.equals(nw))
		  {
		  d.switchTo().window(childWindowHandle);
	}
		  d.close();

		// to switch to parent window.
		//d.switchto.window(tabs.get(0));
}
}
}