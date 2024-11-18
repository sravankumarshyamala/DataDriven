package applicationLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
//import org.testng.Reporter;

public class Addemployee 
{
 WebDriver driver;
 public Addemployee(WebDriver driver)
 
 {
	this.driver=driver;
 }

	@FindBy(xpath="//b[text()=\"PIM\"]")
	WebElement pim;
	
	@FindBy(id="btnAdd")
	WebElement add;
	
	@FindBy(name="firstName")
	WebElement fname;
	
	@FindBy(name="middleName")
	WebElement mname;
	
	@FindBy(name="lastName")
	WebElement lname;
	
	@FindBy(id="employeeId")
	WebElement empid;
	
	@FindBy(id="btnSave")
	WebElement save;
	
	@FindBy(id="personal_txtEmployeeId")
	WebElement personalid;
	
	public boolean verifyemp(String firstname, String middlename, String lastname)
	{
		Actions ac= new Actions(driver);
		ac.moveToElement(pim).click().build().perform();
		
		ac.moveToElement(add).click().build().perform();
		
		fname.sendKeys(firstname);
		mname.sendKeys(middlename);
		lname.sendKeys(lastname);
		
		String a=empid.getAttribute("value");
		save.click();
		String b=personalid.getAttribute("value");
		if(b.equals(a))
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
		
	  return true;
		
	}
	

}
