package Frames;



import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.deps.com.thoughtworks.xstream.core.util.WeakCache;

public class handlewindow
{
	
		
		public static WebDriver driver;
		  public static final int WAIT_TIME = 60;
	    public static void main(String[] args) throws InterruptedException {

	    	 String url= System.getProperty("user.dir")+"\\src\\chromedriver.exe";
	 		 
			    System.setProperty("webdriver.chrome.driver",url); 
			   
			    //driver=new ChromeDriver(); 
			    handlewindow();
			   
			  }
	public static void handlewindow() throws InterruptedException 
	{
		
		
		//driver.get("https://accounts.google.com");
		//String handle_google = driver.getWindowHandle();
		//System.out.println(handle_google);
		//List<String> knownHandles = new ArrayList<String>();
		//knownHandles.add(driver.getWindowHandle());
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL + "t");
		
		WebDriver driver1 = new ChromeDriver();
		//WebDriver driver1 = new FirefoxDriver();
		driver1.get("https://www.infibeam.com/Login.action?redirectURL=https%3A%2F%2Fwww.infibeam.com%2F");
		
		driver1.findElement(By.id("google")).click();
		String old= driver1.getWindowHandle();
		
		System.out.println(old);
		try{new WebDriverWait(driver1, 30).until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.id("identifierId")));}
		catch(Exception e){
			System.out.println("Execxption found");
		}
		driver1.findElement(By.id("userHandle")).sendKeys("ghdfgD");;
		//driver1.findElement(By.id("identifierId")).sendKeys("ghdfgD");;
		
		
       Set<String> handles =driver1.getWindowHandles();
     
       System.out.println(handles.size());
      Iterator i= handles.iterator();
      
      String new1=null;
      old=i.next().toString();
      new1=i.next().toString();
      while (i.hasNext())
      {
    	  new1=i.next().toString();
      }
       
System.out.println(new1);

	driver1.switchTo().window(new1);	
		
	driver1.findElement(By.id("identifierId")).sendKeys("ghdfgD");;
		
		
		

	}

}
