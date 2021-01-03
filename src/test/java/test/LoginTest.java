package test;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.Login;

public class LoginTest extends Base{
	Login login;

	String expectedErrorMsg = "The email address that you've entered doesn't match any account. Sign up for an account.";

	@BeforeClass
	public void beforeClass() {
		login = new Login(driver);
	}
	
	@Test
	public void invalidLoginTest() {

		login.login("batman12313234234242134234@gmail.com", "askdhkashdfklsjadhfkshdfkshdkhsdf");

		String actualErrorMsg = login.loginErrorMessage();
		assertTrue(actualErrorMsg.equals(expectedErrorMsg), "Displayed login error message is not correct.");
	}
}
