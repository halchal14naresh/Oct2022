package amyjava001;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class BrowserLaunch {
	

	static WebDriver driver;
	
	@BeforeTest(groups={"SmokeTest","Regression"}) 
	@Parameters ({"browserType"})
	public void login(String browserType){
		System.out.println("Hello i am before Test");
		
		if(browserType.equalsIgnoreCase("Chrome")){
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}else{
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		driver.get("https://www.stealmylogin.com/demo.html");
		driver.manage().window().maximize();
		driver.findElement(By.name("username")).sendKeys("MyUser");
		driver.findElement(By.name("password")).sendKeys("MyPassword");
		driver.findElement(By.xpath("//input[@value='login']")).click();
		driver.findElement(By.partialLinkText("More information")).click();
		String myTitle = driver.getTitle();  
		Assert.assertEquals(myTitle, "IANA-managed Reserved Domains", "Title is not matched for moreinfo page");
		String myUrl = driver.getCurrentUrl();  
		Assert.assertEquals(myUrl, "https://www.iana.org/domains/reserved", "URL is not matched for moreinfo page");
	}
	
	@AfterTest(groups={"SmokeTest","Regression"}) 
	public void close(){
		driver.close();
	}
	
	@BeforeSuite(groups={"SmokeTest","Regression"}) 
	public void mysuite(){
		System.out.println("Hi I am before Suite");
	}
	
	
	

}
