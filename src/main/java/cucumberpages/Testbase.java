package cucumberpages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testbase {
	protected static WebDriver driver;

public static void init() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\vanga\\eclipse-sep 2021\\cucumber\\driver\\driver\\chromedriver.exe");
	try {
		driver=new ChromeDriver();
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	driver.manage().deleteAllCookies();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	//driver.get("https://techfios.com/test/billing/?ng=admin/");
	
	
}

}
