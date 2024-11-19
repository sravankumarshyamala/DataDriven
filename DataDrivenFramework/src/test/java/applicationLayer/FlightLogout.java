package applicationLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FlightLogout 
{
	@FindBy(xpath="//i[@class=\"fa fa-gear\"]")
	WebElement setting;
	
	@FindBy(xpath="//i[@class=\"fa fa-lock\"]")
	WebElement signout;
	
	public void verifyou() throws InterruptedException
	{
		setting.click();
		//Thread.sleep(2000);
		signout.click();
	}

}
