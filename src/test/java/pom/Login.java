package pom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login {
	
	WebDriver driver;
	WebDriverWait wait;
	
	@CacheLookup
	@FindBy(id = "email")
	WebElement email;
	
	@CacheLookup
	@FindBy(id = "pass")
	WebElement pass;
	
	@CacheLookup
	@FindBy(tagName = "button")
	WebElement loginBtn;
	
	@CacheLookup
	@FindBy(xpath = "//div[@class='_9ay7']")
	WebElement loginErrorMsg;	
	
	public Login(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		 wait = new WebDriverWait(driver, 30);
	}
	

	public void login(String username, String password) {
		email.clear();
		email.sendKeys(username);
		
		pass.clear();
		pass.sendKeys(password);
		
		loginBtn.click();
	}
	
	public String loginErrorMessage() {
		wait.until(ExpectedConditions.visibilityOf(loginErrorMsg));
		return loginErrorMsg.getText();
	}
	
}
