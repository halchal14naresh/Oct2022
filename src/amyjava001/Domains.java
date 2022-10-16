package amyjava001;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Domains {
	 //@Parameters ({"mypara"})
	 //public void method1(@Optional String a){

	
	WebDriver driver;
	
	@BeforeClass(groups={"SmokeTest","Regression"}) 
	public void init(){
		driver = BrowserLaunch.driver; 
	}
	
	
	@BeforeMethod(groups={"SmokeTest","Regression"}) 
	public void homePage( ){
		driver.get("https://www.iana.org/domains");
	} 
	@Test(groups="SmokeTest")  
	public void overview( ){
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//a[text()='Overview'  and @href='/domains']"))).click().build().perform();
		String myTitle_OverView = driver.getTitle();  
		Assert.assertEquals(myTitle_OverView, "Domain Name Services", "Title is not matched for Domain Name Services page");
		driver.findElement(By.linkText("Performance")).click();
		
	}
	@Test (groups="Regression")
	public void rootZoneManagment(){
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//a[text()='Root Zone Management']"))).click().build().perform();
		String myTitle_RZM = driver.getTitle();  
		Assert.assertEquals(myTitle_RZM, "Root Zone Management", "Title is not matched for Root Zone Management page");
	}
}
