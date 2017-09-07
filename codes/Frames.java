package Frames;


import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;



public class Frames {
	
	public static WebDriver driver;
	  public static final int WAIT_TIME = 60;
    public static void main(String[] args) {

    	 String url= System.getProperty("user.dir")+"\\src\\chromedriver.exe";
 		 
		    System.setProperty("webdriver.chrome.driver",url); 
		   
		    driver=new ChromeDriver(); 
		//IFrames();
		  IFrame_simple();
		  }
    public static void IFrame_simple()
    {
    	driver.get("http://the-internet.herokuapp.com/iframe");
    	driver.manage().window().maximize();
    	if (driver.getPageSource().contains("Your content goes here."))
    	{
    		
              // driver.findElement(By.id("tinymce")).sendKeys("gvhj");
               System.out.println("Element found1");
    	}
    	else 
    	{
    		System.out.println("Element not found");
    	}
    	
    	driver.switchTo().frame("mce_0_ifr");
    	if (driver.getPageSource().contains("Your content goes here."))
    	{
    		System.out.println("Element found");
    		driver.findElement(By.id("tinymce")).sendKeys("gvhj");
    	}
    	else 
    	{
    		System.out.println("Element not found");
    	}
    }
    public static void IFrames()
    {
    	driver.get("http://the-internet.herokuapp.com/nested_frames");
    	driver.manage().window().maximize();
    	if (driver.getPageSource().contains("LEFT"))
    	{
    		System.out.println("Element found");
    
    	}
    	else 
    	{
    		System.out.println("Element not found");
    	}
    	driver.switchTo().frame("frame-top");
    	driver.switchTo().frame("frame-left");
    	if (driver.getPageSource().contains("LEFT"))
    	{
    		System.out.println("Element found");
    
    	}
    	else 
    	{
    		System.out.println("Element not found");
    	}
    }
    	 
    	
    	 
}
