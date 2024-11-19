package applicationLayer;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class Flightreg 
{
	WebDriver driver;
	public Flightreg(WebDriver driver)
	{
		this.driver=driver;
	}
	
	@FindBy(name="name")
	WebElement n;
	
	@FindBy(xpath="//button[text()=\"Insert Order\"]")
	WebElement button;
	
	// method 
	
	
	public boolean verifyreg(String name) throws InterruptedException
	{
		String date="16-December-2028";
		String[] temp=date.split("-");
		String d=temp[0];
		String m=temp[1];
		String y=temp[2];
		
//		if(driver.findElement(By.id("search-date")).isDisplayed()) {
//		driver.findElement(By.id("search-date")).click();
//		}
//		else {
//	     driver.findElement(By.xpath("(//a[@href='https://flights.qedgetech.com/user/sravankumar.html'])[2]")).click();		
//		}
		
		driver.findElement(By.id("search-date")).click();
		String a=driver.findElement(By.xpath("//span[@class=\"ui-datepicker-year\"]")).getText();
	       while(!a.equals(y))
	       {
	    	   driver.findElement(By.xpath("//span[text()=\"Next\"]")).click();
	    	   a=driver.findElement(By.xpath("//span[@class=\"ui-datepicker-year\"]")).getText();
	       }
		
	       String b=driver.findElement(By.xpath("//span[@class=\"ui-datepicker-month\"]")).getText();
	       while(!b.equals(m))
	       {
	    	   driver.findElement(By.xpath("//span[text()=\"Next\"]")).click();
	    	   b=driver.findElement(By.xpath("//span[@class=\"ui-datepicker-month\"]")).getText();
	       }
		
		WebElement a1=driver.findElement(By.className("ui-datepicker-calendar"));
		List<WebElement> row = a1.findElements(By.tagName("tr"));
		for(int i=1;i<row.size();i++)
		{
			List<WebElement> col=row.get(i).findElements(By.tagName("td"));
			
			for(WebElement b1:col)
			{
				String d1=b1.getText();
				if(d1.equals(d))
				{
					b1.click();
					break;
				}
			}
		}
		
		WebElement h=driver.findElement(By.xpath("//select[@class=\"form-control col-md-3 search_fileds  sf2\"]"));
		Select sc= new Select(h);
		sc.selectByVisibleText("Hyderabad");
		
		WebElement h1=driver.findElement(By.xpath("//select[@class=\"form-control col-md-3 search_fileds  sf3\"]"));
		Select sc1= new Select(h1);
		sc1.selectByVisibleText("Chennai");
		
		
		n.sendKeys(name);
		button.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@href='https://flights.qedgetech.com/user/sravankumar.html'])[2]")).click();		
		return true;
		
	}

}
