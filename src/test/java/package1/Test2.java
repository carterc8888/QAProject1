package package1;

import java.time.Duration;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Test2 {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		//Implicit Wait 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));	
		
		driver.get("https://www.xe.com/");
		driver.findElement(By.xpath("//*[@id=\"amount\"]")).sendKeys("500");
		
		//press swap button
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div[4]/div[2]/section/div[2]/div/main/div/div[1]/div[6]/button")).click();
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div[4]/div[2]/section/div[2]/div/main/div/div[2]/button")).click();
		WebElement amount_to_convert = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[4]/div[2]/section/div[2]/div/main/div/div[2]/div[1]/div/p[1]"));
		WebElement amount_converted = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[4]/div[2]/section/div[2]/div/main/div/div[2]/div[1]/div/p[2]"));
		System.out.println(amount_to_convert.getAttribute("innerText"));
		System.out.println(amount_converted.getAttribute("innerText"));
		driver.quit();
	}
}
