package amyjava001;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Protocols {
	 //@Parameters ({"mypara"})
	 //public void method1(@Optional String a){
	
	WebDriver driver;
	
	@BeforeClass
	public void init(){
 		driver = BrowserLaunch.driver; 
	}
	
	@BeforeMethod 
	public void homePage( ){
		driver.get("https://www.iana.org/protocols");
	} 
	@Test 
	public void protocolRegistries( ){
		driver.findElement(By.linkText("Protocol Registries")).click();
		String myTitle_PR= driver.getTitle();  
		Assert.assertEquals(myTitle_PR, "Protocol Registries");
	 
		
	}
	@Test 
	public void performance(){
		driver.findElement(By.linkText("Performance")).click();
		String myTitle_PR = driver.getTitle();  
		Assert.assertEquals(myTitle_PR, "IETF Statistics Reporting");
	}
}
