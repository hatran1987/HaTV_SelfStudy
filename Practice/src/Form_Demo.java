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
		
		driver.findElement(By.id("username")).sendKeys("john");
		
		driver.findElement(By.id("UIPortalLoginFormControl")).sendKeys("gtn");
		
		driver.findElement(By.id("UIPortalLoginFormControl")).submit();
		
		driver.close();
	}

}
