import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriver_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		String loginUrl = "localhost:8080/portal/intranet/";
		String expectedTitle = "Login";
		String actualTitle = "";
		
		//Launch Firefox
		driver.get(loginUrl);
		
		//Get actualTitle
		actualTitle = driver.getTitle();
		
		//Compare actualTitle with expectedTitle
		if (actualTitle.contentEquals(expectedTitle)){
			System.out.println("Pass");
		} else {
			System.out.println ("Failed");
		}
					
		//close Firefox
		driver.close();
	}
}