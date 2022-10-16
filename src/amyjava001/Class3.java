package amyjava001;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.Scanner;

import org.apache.hc.core5.util.Asserts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Class3 {
 

 
 
	@Test()
	public void aaaaa(){
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com");
		WebElement ele = driver.findElement(By.name("q"));
		 driver.navigate().refresh();
		 ele.clear();
		ele.sendKeys("HAPPY NEW YER");
	}




}
