package TestNGPackage;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

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
		String expectedTitle = "Home Page";
		String actualTitle =driver. getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
	}
	
	@Test
	public void Login(){
		WebElement txtUsername = driver.findElement(By.id("username"));
		txtUsername.sendKeys("john");
		
		WebElement txtPassword = driver.findElement(By.id("UIPortalLoginFormControl"));
		txtPassword.sendKeys("gtn");
		
		WebElement btnLogin = driver.findElement(By.xpath("//div[@id='UIPortalLoginFormAction']/button"));
		btnLogin.click();
	}
	
	@AfterTest
	public void endSession(){
		driver.quit();
	}
}
