package PageObject;


	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


	public class Loginobject {

	
	public static WebElement emailtextfield(WebDriver d)
	{
	
		return d.findElement(By.id("identifierId"));
		
	}
	public static WebElement passwrodtextfield(WebDriver d)
	{
	
		return d.findElement(By.id(""));
		
	}
	public static WebElement nextbutton(WebDriver d)
	{
	
		return d.findElement(By.id(""));
		
	}
	public static WebElement Loginbutton(WebDriver d)
	{
	
		return d.findElement(By.id(""));
		
	}
	}



