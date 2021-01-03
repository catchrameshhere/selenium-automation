package test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import utils.Common;

public class Base {

	Common common;
	public static WebDriver driver;
  @BeforeSuite
  public void beforeSuite() {
	  common = new Common();
	  common.setupBrowser("chrome", "https://www.fb.com");
	  driver = common.getDriver();
  }

  @AfterSuite
  public void afterSuite() {
	  driver.quit();
  }

}
