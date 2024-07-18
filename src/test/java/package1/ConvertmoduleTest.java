/**
* These are the 5 test cases for the covert modules 
* test is done using the Chrome browser and also using the TestNg framework
* this file can run all 5 test cases 
* 
* @author  Carter
* @since   18/7/2024 
*/
package package1;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ConvertmoduleTest {
	
	@BeforeTest
	public void BeforeMethod() {
		//uses WebDriverManager to set up the appropriate ChromeDriver version automatically
		WebDriverManager.chromedriver().setup();
	}
	
	@Test
	public void Test1() {
		ChromeDriver driver = new ChromeDriver();
		
		//Implicit Wait 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));	
		
		//navigate to website
		driver.get("https://www.xe.com/");
		
		//enter the amount eg:500
		driver.findElement(By.xpath("//*[@id=\"amount\"]")).sendKeys("500");
		
		//click the convert button
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div[4]/div[2]/section/div[2]/div/main/div/div[2]/button")).click();
		
		//get the webElement that shows the conversion
		WebElement amount_to_convert = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[4]/div[2]/section/div[2]/div/main/div/div[2]/div[1]/div/p[1]"));
		WebElement amount_converted = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[4]/div[2]/section/div[2]/div/main/div/div[2]/div[1]/div/p[2]"));
		
		//print out the text that is shown 
		System.out.println("---------------------Printed Text for Test1------------------------");
		System.out.println(amount_to_convert.getAttribute("innerText"));
		System.out.println(amount_converted.getAttribute("innerText"));
		driver.quit();
	}
	
	@Test
	public void Test2() {
		ChromeDriver driver = new ChromeDriver();
		
		//Implicit Wait 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));	
		
		//navigate to website
		driver.get("https://www.xe.com/");
		
		//enter the amount eg:500
		driver.findElement(By.xpath("//*[@id=\"amount\"]")).sendKeys("500");
		
		//press swap button
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div[4]/div[2]/section/div[2]/div/main/div/div[1]/div[6]/button")).click();
		
		//click the convert button
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div[4]/div[2]/section/div[2]/div/main/div/div[2]/button")).click();
		
		//get the webElement that shows the conversion
		WebElement amount_to_convert = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[4]/div[2]/section/div[2]/div/main/div/div[2]/div[1]/div/p[1]"));
		WebElement amount_converted = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[4]/div[2]/section/div[2]/div/main/div/div[2]/div[1]/div/p[2]"));
		
		//print out the text that is shown 
		System.out.println("---------------------Printed Text for Test2------------------------");
		System.out.println(amount_to_convert.getAttribute("innerText"));
		System.out.println(amount_converted.getAttribute("innerText"));
		driver.quit();
	}
	
	@Test
	public void Test3() {
		ChromeDriver driver = new ChromeDriver();
		
		//Implicit Wait 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));	
		
		//Go to the website
		driver.get("https://www.xe.com/");
		
		//Enter the amount eg:500
		driver.findElement(By.xpath("//*[@id=\"amount\"]")).sendKeys("1000000000000");
		
		//click the dropdown list From
		driver.findElement(By.xpath("//*[@id=\"midmarketFromCurrency\"]")).click();
		
		//click the AUD Australia option
		driver.findElement(By.xpath("//*[@id=\"midmarketFromCurrency-option-4\"]")).click();
		
		//click the dropdown list To
		driver.findElement(By.xpath("//*[@id=\"midmarketToCurrency\"]/div[2]/div/input")).click();
		
		//click the RM Malaysia option
		driver.findElement(By.xpath("//*[@id=\"midmarketToCurrency-option-21\"]")).click();
		
		//click the convert button
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div[4]/div[2]/section/div[2]/div/main/div/div[2]/button")).click();
		
		//get the webElement that shows the conversion
		WebElement amount_to_convert = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[4]/div[2]/section/div[2]/div/main/div/div[2]/div[1]/div/p[1]"));
		WebElement amount_converted = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[4]/div[2]/section/div[2]/div/main/div/div[2]/div[1]/div/p[2]"));
		
		//print out the text that is shown 
		System.out.println("---------------------Printed Text for Test3------------------------");
		System.out.println(amount_to_convert.getAttribute("innerText"));
		System.out.println(amount_converted.getAttribute("innerText"));
		driver.quit();
	}
	
	@Test
	public void Test4() {
		ChromeDriver driver = new ChromeDriver();
		
		//Implicit Wait 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));	
		
		//Go to the website
		driver.get("https://www.xe.com/");
		
		//Enter the amount eg:1000000000000 (trillion dollar)
		driver.findElement(By.xpath("//*[@id=\"amount\"]")).sendKeys("10.754443");
		
		//click the dropdown list From
		driver.findElement(By.xpath("//*[@id=\"midmarketFromCurrency\"]")).click();
		
		//click the GBP British Pound option
		driver.findElement(By.xpath("//*[@id=\"midmarketFromCurrency-option-3\"]")).click();
		
		//click the dropdown list To
		driver.findElement(By.xpath("//*[@id=\"midmarketToCurrency\"]/div[2]/div/input")).click();
		
		//click the AUD Australia option
		driver.findElement(By.xpath("//*[@id=\"midmarketToCurrency-option-4\"]")).click();
		
		//click the covert button
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div[4]/div[2]/section/div[2]/div/main/div/div[2]/button")).click();
		
		//get the webElement that shows the conversion
		WebElement amount_to_convert = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[4]/div[2]/section/div[2]/div/main/div/div[2]/div[1]/div/p[1]"));
		WebElement amount_converted = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[4]/div[2]/section/div[2]/div/main/div/div[2]/div[1]/div/p[2]"));
		//print out the text that is shown 
		System.out.println("---------------------Printed Text for Test4------------------------");
		System.out.println(amount_to_convert.getAttribute("innerText"));
		System.out.println(amount_converted.getAttribute("innerText"));
		driver.quit();
	}
	
	@Test
	public void Test5() {
		ChromeDriver driver = new ChromeDriver();
		
		//Implicit Wait 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));	
		
		//Go to the website
		driver.get("https://www.xe.com/");
		
		//Enter an invalid amount eg:&**^
		driver.findElement(By.xpath("//*[@id=\"amount\"]")).sendKeys("&**^");
		
		//check if button is clickable
		WebElement convertButton = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[4]/div[2]/section/div[2]/div/main/div/div[2]/button"));
		
		//check if the convert buttion is clickable
		if(convertButton.isEnabled()) {
			//System.out.println("Error handling failed: Button is still clickable despite invalid amount");
		}else {
			System.out.println("---------------------Printed Text for Test4------------------------");
			System.out.println("Error handling passed: Button is not clickable");
		}
		
		Assert.assertEquals(false, convertButton.isEnabled(), "Error handling failed: Button is still clickable despite invalid amount");
		driver.quit();
	}
		

}
