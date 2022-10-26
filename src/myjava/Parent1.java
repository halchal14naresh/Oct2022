package myjava;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Parent1 {
	int i=50;
	
	
	public void myhome(){
		
		System.out.println(" This is Home of Parent1 Class");
	}
	
static public void myStatic(){
		
		System.out.println(" This is myStatic of Parent1 Class");
	}

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		//WebDriver driver = new ChromeDriver();
 		
		//WebDriver driver1 = new ChromeDriver(); // Which browser will launch ?
		
		// Selenium ka Word 
		// in Java team - Class , Method , 
		// WebDriver ? Interface 
		// Object - NO
		

	}

}
