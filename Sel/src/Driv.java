import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driv {

	public static void main(String[] args) 
	{
	System.setProperty("webdriver.chrome.driver","F:\\chromedriver_win32\\chromedriver.exe");
WebDriver d = new ChromeDriver();
d.get("https://www.facebook.com/");
	}
}



