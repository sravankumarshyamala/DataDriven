package driverFactory;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import applicationLayer.Flightreg;
import config.Flightbase;
import utilities.ExcelFileUtil;

public class FlightAppTest extends Flightbase

{
	String Input="./FileInput/Flight.xlsx";
	String Output="./FileOutput/Flightresult.xlsx";
	String tc_sheet="Data";
	
	
	@Test
	public void starttest() throws IOException, InterruptedException
	{
		ExcelFileUtil xl= new ExcelFileUtil(Input);
		int rc=xl.rowCount(tc_sheet);
		
		for(int i=1;i<=rc;i++)
		{
			String name=xl.getcelldata(tc_sheet, i, 0);
			Flightreg  reg=PageFactory.initElements(driver, Flightreg.class);
			boolean res =reg.verifyreg(name);
			System.out.println(res);
		if(res)
		{
			xl.setcelldata(tc_sheet, i, 1, "pass", Output);
		}
		else
		{
			xl.setcelldata(tc_sheet, i, 1, "fail", Output);
		}
		}
	}
}