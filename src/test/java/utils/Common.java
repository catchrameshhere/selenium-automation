package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Common {

	WebDriver driver;
	public void setupBrowser(String browser, String url) {
		String currDir = System.getProperty("user.dir");
		
		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", currDir+"\\drivers\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		
		else if(browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", currDir+"\\drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
	
		driver.get(url);
	}
	
	public WebDriver getDriver() {
		return driver;
	}

}
