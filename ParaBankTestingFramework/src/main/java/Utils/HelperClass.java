package Utils;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HelperClass {
	
	private static HelperClass helperclass;
	private static WebDriver driver;
	public final static int TIMEOUT =5;
	
	public HelperClass() {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TIMEOUT));
		
	}
	
	public static void openUrl(String url) {
		

		driver.get(url);
		
	}
	
	public static WebDriver getDriver() {
		return driver;
		
	}
	
	public static void setUpDriver() {
		
		if(helperclass == null) {
			helperclass = new HelperClass();
			
		}
	}

	public static void tearDown() {

			if(driver != null) {
				//driver.close();
				driver.quit();
			}
			helperclass=null;
		
		
	}

}
