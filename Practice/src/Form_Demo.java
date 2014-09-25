import java.sql.Driver;

import javax.lang.model.element.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Form_Demo {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
		
		String url = "http://localhost:8080/portal/login?initialURI=%2Fportal%2Fintranet";
		
		driver.get(url);
		
		WebElement txtUserNameLogin = driver.findElement(By.id("username"));
		
		txtUserNameLogin.sendKeys("john");
		
		WebElement txtPasswordLogin = driver.findElement(By.id("UIPortalLoginFormControl"));
		
		txtPasswordLogin.sendKeys("gtn");
		
		driver.findElement(By.id("UIPortalLoginFormControl")).submit();
		
		driver.findElement(By.xpath("//div[@id='UISetupPlatformToolBarPortlet']/a")).click();
		
		driver.findElement(By.xpath("//div[@id='UISetupPlatformToolBarPortlet']//a[text()='Users']")).click();

		WebElement txtUserName = driver.findElement(By.id("username"));
		
		txtUserName.sendKeys("hatv");
		
		WebElement txtPassword = driver.findElement(By.id("password"));
		
		txtPassword.sendKeys("123456a@");
		
		WebElement txtConfirmPassword = driver.findElement(By.id("Confirmpassword"));
		
		txtConfirmPassword.sendKeys("123456a@");
		
		WebElement txtFirstName = driver.findElement(By.id("firstName"));
		
		txtFirstName.sendKeys("Ha");
		
		WebElement txtLastName = driver.findElement(By.id("lastName"));
		
		txtLastName.sendKeys("Tran Viet");
		
		WebElement txtDisplayName = driver.findElement(By.id("displayName"));
		
		txtDisplayName.sendKeys("Ha Tran");
		
		WebElement txtEmail = driver.findElement(By.id("email"));
		
		txtEmail.sendKeys("hatv@exoplatform.com");
		
		driver.findElement(By.xpath("//form[@id='UIAccountForm']//button[text()='Save']")).click();
		
		//driver.close();
	}

}
