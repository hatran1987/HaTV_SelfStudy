import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.List;

import org.openqa.selenium.*;

public final class LinkTable_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new FirefoxDriver();
		
		String url = "localhost:8080/portal/acme/";
		       		
		driver.get(url);
		
				        		
		// Test if all the links present within the page are working.
		// Tao mot List ten linkElements, cac phan tu co kieu la WebElement
		List<WebElement> linkElements = driver.findElements(By.tagName("a"));
		
			
		// Khai bao mot mang kieu String, co so phan tu bag kich thuoc cua linkElements
		String[] linkTexts = new String[linkElements.size()];
		
		// Duyet qua list linkElements, lay tung phan tu cua list, roi chuyen thanh kieu String,
		// sau do gan vao phan tu tuog ung cua mang linkTexts
		int i=0;
			
		for (WebElement e: linkElements){
			linkTexts[i] = e.getText();
			if (linkTexts[i].length()!=0){
			System.out.println(linkTexts[i]);
			}
			i++;
		}
	
		//test each link	
        for (String t : linkTexts) {
        	if (driver.findElement(By.linkText(t)).getText().length()!=0){
            driver.findElement(By.linkText(t)).click();
            System.out.println(t + " is working.");
        	}
            
            driver.navigate().back();
        }
        
		driver.close();
	}
}
