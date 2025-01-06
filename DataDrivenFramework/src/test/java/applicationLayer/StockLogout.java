package applicationLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class StockLogout 

{
	@FindBy(id="logout")
	WebElement lout;
	
	@FindBy(xpath="//button[text()=\"OK!\"]")
	WebElement ok;
	
	public void stockl()
	{
		lout.click();
		ok.click();
	}
	
	

}
