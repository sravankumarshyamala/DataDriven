package config;

import java.time.Duration;
//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

//import applicationLayer.AdminLogout;
import applicationLayer.StockLogout;

public class stockbase


{
	public static WebDriver driver;
	@BeforeTest
	public void stocklogin()
	{
		System.setProperty("WebDriver.chromedriver", "chromedriver.exe");
	    driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait((Duration.ofSeconds(0)));
		driver.get("http://webapp.qedgetech.com/login.php");
		driver.findElement(By.id("btnsubmit")).click();
		
	}
	
	@AfterTest
	public void stocklo()
	{
		StockLogout StockLog=PageFactory.initElements(driver,StockLogout.class);
		StockLog.stockl();
	}
	
	
	

}
