package AssignmentSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assigment1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		//Assignment-1
		/*driver.get("https://adactinhotelapp.com/");
        driver.manage().window().maximize();
        driver.findElement(By.id("login")).click();
        Thread.sleep(3000);
        driver.findElement(By.linkText("Forgot Password?")).click();
        System.out.println(driver.getTitle());
        Thread.sleep(3000);
        driver.navigate().back();
        driver.findElement(By.linkText("New User Register Here")).click();
        System.out.println(driver.getTitle());
        Thread.sleep(3000);
        driver.navigate().back();
        //Go to Build 2 
        driver.findElement(By.linkText("Go to Build 2")).click();
        System.out.println(driver.getTitle());
        Thread.sleep(3000);
        driver.navigate().back();
        driver.findElement(By.linkText("info@adactin.com")).click();
        System.out.println(driver.getTitle());
        Thread.sleep(3000);
        driver.navigate().back();
        driver.quit();*/
		/*Assignment -2
		driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.findElement(By.linkText("Sell on Amazon")).click();
        System.out.println(driver.getTitle());
        Thread.sleep(3000);
        driver.navigate().back();
        driver.findElement(By.linkText("Sell under Amazon Accelerator")).click();
        System.out.println(driver.getTitle());
        Thread.sleep(3000);
        driver.navigate().back();
        driver.findElement(By.linkText("Protect and Build Your Brand")).click();
        System.out.println(driver.getTitle());
        Thread.sleep(3000);
        driver.navigate().back();
        driver.findElement(By.linkText("Amazon Global Selling")).click();
        System.out.println(driver.getTitle());
        Thread.sleep(3000);
        driver.navigate().back();
        driver.findElement(By.linkText("Supply to Amazon")).click();
        System.out.println(driver.getTitle());
        Thread.sleep(3000);
        driver.navigate().back();
        driver.findElement(By.linkText("Become an Affiliate")).click();
        System.out.println(driver.getTitle());
        Thread.sleep(3000);
        driver.navigate().back();
        driver.findElement(By.linkText("Fulfilment by Amazon")).click();
        System.out.println(driver.getTitle());
        Thread.sleep(3000);
        driver.navigate().back();
        driver.findElement(By.linkText("Advertise Your Products")).click();
        System.out.println(driver.getTitle());
        Thread.sleep(3000);
        driver.navigate().back();
        driver.findElement(By.linkText("Amazon Pay on Merchants")).click();
        System.out.println(driver.getTitle());
        Thread.sleep(3000);
        driver.navigate().back();
        driver.quit();*/
		//Assignment-3
		driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.findElement(By.linkText("Create new account")).click();
        Thread.sleep(3000);
        /*WebElement drop= driver.findElement(By.id("day"));
		 
		 Select s1=new Select(drop);
		 
		 s1.selectByIndex(12);*/
		
		
		new Select(driver.findElement(By.id("day"))).selectByIndex(27);
		Thread.sleep(3000);
		new Select(driver.findElement(By.id("month"))).selectByIndex(5);

		Thread.sleep(3000);
		new Select(driver.findElement(By.id("year"))).selectByIndex(24);
		Thread.sleep(3000);
		
		driver.quit();
		 
		
        
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
           
        
        
        
	}

}
