package WebDriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Methods2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
        driver.manage().window().maximize();
        driver.findElement(By.name("login")).click();
        System.out.println(driver.findElement(By.id("username_span")).getText());
        Thread.sleep(3000);
        System.out.println(driver.findElement(By.id("username_span")).getAttribute("name"));
        driver.quit();
        

	}

}
