package applicationLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FlightLogin 
{
   @FindBy(name="email")
   WebElement user;
   
   @FindBy(name="password")
   WebElement pass;
   
   @FindBy(xpath="//button[text()=\"Sign In\"]")
   WebElement sign;
   
   public void verifyin(String username,String password)
   {
	   user.sendKeys(username);
	   pass.sendKeys(password);
	   sign.click();
   }
   

}
