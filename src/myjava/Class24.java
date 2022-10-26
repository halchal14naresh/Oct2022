package myjava;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Class24 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://google.com");
		
		try{
		driver.findElement(By.name("q")).sendKeys("Selenium Automation"); // 
		driver.switchTo().alert(); // nosuchAlert
		
		}  catch(Exception aaaaa){
			System.out.println("I am Inside Catch");
			System.out.println(aaaaa);
		}
		System.out.println("HEllo Java ");

	}

}
