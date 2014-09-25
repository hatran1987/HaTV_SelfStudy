import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Link_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		
		String url = "localhost:8080/portal/acme/";
		       		
		driver.get(url);
		
		String registerLink = driver.findElement(By.linkText("Register")).getText();
		
		System.out.println();
		
		System.out.println("Register: " + registerLink);
		
		System.out.println();
		
		driver.findElement(By.linkText("Register")).click();
		
		System.out.println("The title of this page is " + driver.getTitle());
		
		driver.close();
	}

}
