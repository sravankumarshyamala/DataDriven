package driverFactory;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import applicationLayer.Stocksupplier;
import config.stockbase;
import utilities.ExcelFileUtil;

public class stockAppTest extends stockbase 

{
	
	
	String Input=".//FileInput/sravan.xlsx";
	String Output="./FileOutput/stockResults.xlsx";
	String TC_Sheet="supplier";
     @Test
	public void test() throws IOException, InterruptedException
	{
    	 ExcelFileUtil xl= new ExcelFileUtil(Input);
 		int rc=xl.rowCount(TC_Sheet);
 		System.out.println(rc);
 		for(int i=1;i<=rc;i++)
 		{
 	 		System.out.println("11111111");

 			String suppliername=xl.getcelldata(TC_Sheet, i, 0);
 			String address=xl.getcelldata(TC_Sheet, i, 1);
 		    String City =xl.getcelldata(TC_Sheet, i, 2);
 		    String Country =xl.getcelldata(TC_Sheet, i, 3);
 			String ContactPerson= xl.getcelldata(TC_Sheet, i, 4);
 			String Phonenumber = xl.getcelldata(TC_Sheet, i, 5);
 			String email= xl.getcelldata(TC_Sheet, i, 6);
 		    String Mobilenumber=xl.getcelldata(TC_Sheet, i, 7);
 			String notes = xl.getcelldata(TC_Sheet, i, 8);
		
 			Stocksupplier suppl=PageFactory.initElements(driver, Stocksupplier.class);
		boolean res =suppl.supplier(suppliername, address, City, Country, ContactPerson, Phonenumber, email, Mobilenumber, notes);
			if(res)
			{
				xl.setcelldata(TC_Sheet, i, 9, "pass", Output);
			}
			else
			{
				xl.setcelldata(TC_Sheet, i, 9, "fail", Output);
			}
		}
}
}


