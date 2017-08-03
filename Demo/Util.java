package Utility;




import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import poi.HlsReader;

public class Util {

	static HlsReader datatable;
 public static void setup(int r, WebDriver d)
{datatable = new HlsReader("C:\\Navdeep\\supreet.xls");
	

	d.get(datatable.getCellData("homepage", "URL", r));
}
 
 
 public static void implictwaits(WebDriver d)
 {
 	

 	d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
 }
 
 public static void explicitwaits(WebDriver d, WebElement e)
 {
 	

 	new WebDriverWait(d,50).until(ExpectedConditions.presenceOfElementLocated(By.id(e.getAttribute("identifierId"))));
 }
}