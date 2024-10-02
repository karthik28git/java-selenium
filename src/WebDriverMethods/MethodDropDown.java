package WebDriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.decorators.WebDriverDecorator;

public class MethodDropDown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();
        /*driver.findElement(By.xpath("//*[@id=\"searchDropdownBox\"]/option[13]")).click(); */
        Thread.sleep(3000);
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("harry potter");
		
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		Thread.sleep(3000);
		
		System.out.println(driver.getTitle());

		  
        driver.quit();

	}

}
