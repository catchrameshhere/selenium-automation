package test;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

public class BasicValidation extends Base{
  @Test
  public void urlValidation() {
	  String expectedUrl = "https://www.facebook.com/";
	  String actualUrl = driver.getCurrentUrl();
	  assertTrue(actualUrl.equals(expectedUrl), "Page url is not correct.");
	  
  }
  
  @Test
  public void pageTitleValidation() {
	  String expectedTitle = "Facebook – log in or sign up";
	  String actualTitle = driver.getTitle();
	  assertTrue(actualTitle.equals(expectedTitle), "Page title is not correct.");
  }
}
