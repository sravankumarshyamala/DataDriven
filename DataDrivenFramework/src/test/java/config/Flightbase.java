package config;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import applicationLayer.FlightLogin;
import applicationLayer.FlightLogout;

public class Flightbase 

{
	public static WebDriver driver;
	@BeforeTest
	public static void login()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
		driver.get("https://flights.qedgetech.com/login.html");
		
		
		FlightLogin login=PageFactory.initElements(driver, FlightLogin.class);
		login.verifyin("sravankumar.shamala@gmail.com","Sravan@1234");
		
	}
	
	@AfterTest
	public static void logout() throws InterruptedException
	{
		FlightLogout logout=PageFactory.initElements(driver, FlightLogout.class);
		logout.verifyou();
		driver.close();
	}

}