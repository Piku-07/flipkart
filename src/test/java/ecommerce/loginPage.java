package ecommerce;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class loginPage {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		
		
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement fashion=driver.findElement(By.xpath("//span[text()='Fashion']"));
	
		Actions a =new Actions(driver);
		 a.moveToElement(fashion).perform(); 
	        Thread.sleep(2000);
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	       WebElement All= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='All']")));
	        All.click();
	        
	}

}
