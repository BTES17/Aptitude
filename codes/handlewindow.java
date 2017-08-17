package Frames;



import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

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
		driver1.get("https://www.facebook.com");
		String handle_fb =driver1.getWindowHandle();
		//System.out.println(handle_fb);
		
		Actions a= new Actions(driver1);
		WebElement eb= driver1.findElement(By.id("u_0_q"));
		//eb.click();
		 System.out.println(handle_fb);
		WebElement e= driver1.findElement(By.linkText("Forgotten account?"));
         a.sendKeys(Keys.SHIFT).click(e).build().perform();
        
        Set<String> handles =driver1.getWindowHandles();
       

for(String ab:handles)
{
	 System.out.println(handles.size());
	handle_fb=ab;
	
}
		
		
		
		 driver1.switchTo().window(handle_fb);
		 System.out.println(handle_fb);
		 Thread.sleep(100);
		 WebElement em= driver1.findElement(By.id("email"));
		em.sendKeys("ramanrty@gmail.com");
		
		

	}

}
