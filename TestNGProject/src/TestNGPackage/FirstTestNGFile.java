package TestNGPackage;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;

public class FirstTestNGFile {

	public String url = "http://localhost:8080/portal/login?initialURI=%2Fportal%2Fintranet%2F";
	public WebDriver driver;
	
	@BeforeTest
	public void setURL(){
		driver = new FirefoxDriver();
		driver.get(url);
	}
	
	@Test
	public void verifyLoginPageTitle(){
		String expectedTitle = "Login";
		String actualTitle =driver. getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
	}
	
	@AfterTest
	public void endSession(){
		driver.quit();
	}
}
