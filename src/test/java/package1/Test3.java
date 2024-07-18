package package1;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		//Implicit Wait 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));	
		
		//Go to the website
		driver.get("https://www.xe.com/");
		
		//Enter the amount eg:1000000000000 (trillion dollar)
		driver.findElement(By.xpath("//*[@id=\"amount\"]")).sendKeys("1000000000000");
		
		//click the dropdown list From
		driver.findElement(By.xpath("//*[@id=\"midmarketFromCurrency\"]")).click();
		
		//click the AUD Australia option
		driver.findElement(By.xpath("//*[@id=\"midmarketFromCurrency-option-4\"]")).click();
		
		//click the dropdown list To
		driver.findElement(By.xpath("//*[@id=\"midmarketToCurrency\"]/div[2]/div/input")).click();
		
		//click the MYR Malaysia option
		driver.findElement(By.xpath("//*[@id=\"midmarketToCurrency-option-21\"]")).click();
		
		
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div[4]/div[2]/section/div[2]/div/main/div/div[2]/button")).click();
		WebElement amount_to_convert = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[4]/div[2]/section/div[2]/div/main/div/div[2]/div[1]/div/p[1]"));
		WebElement amount_converted = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[4]/div[2]/section/div[2]/div/main/div/div[2]/div[1]/div/p[2]"));
		System.out.println(amount_to_convert.getAttribute("innerText"));
		System.out.println(amount_converted.getAttribute("innerText"));
		driver.quit();
	}

}
