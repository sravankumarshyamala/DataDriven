package applicationLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdminLogout
{

	@FindBy(id="welcome")
	WebElement welcome;
	
	@FindBy(linkText="Logout")
	WebElement logout;
	
	public void verifylogout() throws InterruptedException
	{
	   welcome.click();
	   Thread.sleep(2000);
	   logout.click();
	}

}



