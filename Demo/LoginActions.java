package Actoins;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import PageObject.Loginobject;
import Utility.Log4j;
import Utility.Util;
import poi.HlsReader;

public class LoginActions {
	static WebDriver d;
	static HlsReader datatable;
public	static void ExceuteLoginScenario()
	{
	System.out.println("GHSC");
	//String testcase = "TC_3";
	datatable = new HlsReader("C:\\Navdeep\\supreet.xls");
	
	Log4j.Testcasestart("START");
		
			for(int r=2 ;r< datatable.getRowCount("homepage"); r++){
				
				if(datatable.getCellData("homepage", "Status", r).equals("ON"))
				{
					if(datatable.getCellData("homepage", "Browser", r).equals("Google"))
					{
						System.setProperty("webdriver.chrome.driver", "");
						 d= new ChromeDriver();
						 Log4j.Browser("browser launch successfully");
					}
					else if(datatable.getCellData("homepage", "Browser", r).equals("Mozilla")){
						System.setProperty("webdriver.gecko.driver", "C:\\Navdeep\\geckodriver.exe");
						 d= new FirefoxDriver();
						 Log4j.Browser("browser launch successfully");
					}
					Util.setup(r,d);
					testcase(r,d);
					//Util.explicitwaits(d,e);
					Log4j.TestcaseEnd("END");
					
				}
				
				
			}}

static void testcase(int r,WebDriver d){
	
	
	Loginobject.emailtextfield(d).sendKeys(datatable.getCellData("homepage", "Username", r));
	
}



}
