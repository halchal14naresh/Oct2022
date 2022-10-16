package amyjava001;

import java.util.Collections;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Class2 {
	
	@Test
	public void macys(){
	
	WebDriverManager.chromedriver().setup();
 
 
	ChromeOptions options = new ChromeOptions();
 
	options.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
	options.setExperimentalOption("useAutomationExtension", false);
	WebDriver driver = new ChromeDriver(options);
	 driver.manage().deleteAllCookies();
	driver.get ("https://www.macys.com");
	driver.findElement(By.xpath("//a[@href='/shop/womens-clothing?id=118&cm_sp=intl_hdr-_-women-_-118_women']/span")).click();
    Assert.assertEquals(driver.getTitle(), "Women's Clothing and Fashion - Macy's");
	//driver.findElement(By.xpath("//span[text()='Women']")).click();


	}

}
