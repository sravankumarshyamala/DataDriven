package applicationLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdminLogin 

{
	@FindBy(name="txtUsername")
	WebElement user;
	
	@FindBy(name="txtPassword")
	WebElement pass;
	
	@FindBy(id="btnLogin")
	WebElement button;
	
	
	public void verifylogin(String username,String password)
	{
		user.sendKeys(username);
		pass.sendKeys(password);
		button.click();
	}
	

}



