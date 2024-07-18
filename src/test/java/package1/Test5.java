package package1;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Test5 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		//Implicit Wait 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));	
		
		//Go to the website
		driver.get("https://www.xe.com/");
		
		//Enter an invalid amount eg:&**^
		driver.findElement(By.xpath("//*[@id=\"amount\"]")).sendKeys("&**^");
		
		//check if button is clickable
		WebElement convertButton = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[4]/div[2]/section/div[2]/div/main/div/div[2]/button"));
		if(convertButton.isEnabled()) {
			System.out.println("Error handling failed: Button is still clickable despite invalid amount");
		}else {
			System.out.println("Error handling passed: Button is not clickable");
		}
		driver.quit();
		
		
	}
}
