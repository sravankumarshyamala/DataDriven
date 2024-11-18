package config;

import java.time.Duration;
//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import applicationLayer.AdminLogin;
import applicationLayer.AdminLogout;

public class Base
{
public static WebDriver driver;

	@BeforeTest
	public static void launch()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
		driver.get("http://orangehrm.qedgetech.com/");
		AdminLogin login=PageFactory.initElements(driver,AdminLogin.class);
		login.verifylogin("Admin", "Qedge123!@#");
	}
	
	@AfterTest
	public static void close() throws InterruptedException
	{
		AdminLogout logout=PageFactory.initElements(driver,AdminLogout.class);
		logout.verifylogout();
		driver.close();
	}

}
