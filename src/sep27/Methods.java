package sep27;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Methods {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
        driver.manage().window().maximize();
        driver.findElement(By.id("username")).sendKeys("reyaz0806");
        driver.findElement(By.name("password")).sendKeys("reyaz123");
        driver.findElement(By.name("login")).click();
        Thread.sleep(3000);
		
        driver.findElement(By.id("datepick_in")).clear();
        Thread.sleep(3000);
		
        driver.findElement(By.id("datepick_in")).sendKeys("29/09/2024");
        Thread.sleep(3000);
		
        driver.quit();
        

	}

}
