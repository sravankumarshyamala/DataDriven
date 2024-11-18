package driverFactory;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import applicationLayer.Addemployee;
import config.Base;
import utilities.ExcelFileUtil;

public class AppTest extends Base

{
	static String Input="./FileInput/empdata.xlsx";
	String Output="./FileOutput/DataDrivenResults.xlsx";
	String TC_Sheet="Addemp";
	@Test
	public void test() throws IOException
	{
		ExcelFileUtil xl= new ExcelFileUtil(Input);
		int rc=xl.rowCount(TC_Sheet);
		for(int i=1;i<=rc;i++)
		{
			String firstname=xl.getcelldata(TC_Sheet, i, 0);
			String middlename=xl.getcelldata(TC_Sheet, i, 1);
			String lastname=xl.getcelldata(TC_Sheet, i, 2);
			
			Addemployee emp=PageFactory.initElements(driver, Addemployee.class);
			boolean res= emp.verifyemp(firstname, middlename, lastname);
			if(res)
			{
				xl.setcelldata(TC_Sheet, i, 3, "pass", Output);
			}
			else
			{
				xl.setcelldata(TC_Sheet, i, 3, "fail", Output);
			}
			
		}
	}
	
	

}