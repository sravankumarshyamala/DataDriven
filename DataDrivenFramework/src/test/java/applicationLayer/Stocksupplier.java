package applicationLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Stocksupplier 

{
	@FindBy(xpath="(//a[text()=\"Suppliers\"])[2]")
	WebElement supp;
	
	@FindBy(xpath="(//span[@data-caption=\"Add\"])[1]")
	WebElement add;
	
	 @FindBy(name="x_Supplier_Name")
	 WebElement sname;
	 
	 @FindBy(name="x_Address")
	 WebElement addr;
	 
	 @FindBy(name="x_City")
	 WebElement cname;
	 
	 @FindBy(name="x_Country")
	 WebElement couname;
	 
	 
	 @FindBy(name="x_Contact_Person")
	 WebElement cperson;
	 
	 @FindBy(name="x_Phone_Number")
	 WebElement pnumber;
	 
	 @FindBy(name="x__Email")
	 WebElement em;
	 
	 @FindBy(name="x_Mobile_Number")
	 WebElement mnumber;
	 
	 @FindBy(name="x_Notes")
	 WebElement note;
	 
	 @FindBy(name="btnAction")
	 WebElement addicon;
	 
	 
	 @FindBy(xpath="//button[text()=\"OK!\"]")
	 WebElement  ok1;
	 
	 @FindBy(xpath="(//button[text()=\"OK\"])[6]")
	 WebElement sucok;
	 
	 
	 
	 public boolean supplier(String suppliername, String address, String City,String Country, String ContactPerson,String Phonenumber,String email,String Mobilenumber, String notes) throws InterruptedException
	 {
		 supp.click();
		 add.click();
		 sname.sendKeys(suppliername);
		 addr.sendKeys(address);
		 cname.sendKeys(City);
		 couname.sendKeys(Country);
		 cperson.sendKeys(ContactPerson);
		 pnumber.sendKeys(Phonenumber);
		 em.sendKeys(email);
		 Thread.sleep(3000);

		 mnumber.sendKeys(Mobilenumber);
		 Thread.sleep(3000);

		 note.sendKeys(notes);
		 addicon.click();
		 Thread.sleep(3000);

		 ok1.click();
		 Thread.sleep(3000);

		 sucok.click();
		 Thread.sleep(3000);
		return true;
		 
	 }
	 
	 
	 

}
