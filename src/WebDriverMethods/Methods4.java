package WebDriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Methods4 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        driver.findElement(By.className("_9vtf")).submit();
        Thread.sleep(3000);
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("harry potter");
		
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		Thread.sleep(3000);
		
		System.out.println(driver.getTitle());

		  
        driver.quit();
        

	}

}
