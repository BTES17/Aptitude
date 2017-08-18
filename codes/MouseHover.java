package Actions;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MouseHover {
	
	public static WebDriver driver;
	  public static final int WAIT_TIME = 60;
    public static void main(String[] args) throws InterruptedException {

    	 String url= System.getProperty("user.dir")+"\\src\\chromedriver.exe";
 		 
		    System.setProperty("webdriver.chrome.driver",url); 
		   
		    driver=new ChromeDriver(); 
		    MouseHoverMethod();
		  // DragAndDrop();
		  //  Facebookdragdrop();
		  //  DragAndDrop2();
		  }
    
    public static void MouseHoverMethod()
    {
    	driver.get("http://the-internet.herokuapp.com/hovers");
	    
        WebElement   element = driver.findElement(By.xpath(".//*[@id='content']/div/div[1]/img"));
Point p=element.getLocation();
System.out.println(p.x);
        Actions action = new Actions(driver);
         
        action.moveToElement(element).build().perform();
        driver.manage().timeouts().implicitlyWait(WAIT_TIME, TimeUnit.SECONDS);
        WebElement element1 = driver.findElement(By.xpath(".//*[@id='content']/div/div[2]/img"));

        Actions action1 = new Actions(driver);
         
        action1.moveToElement(element1).build().perform();
        driver.manage().timeouts().implicitlyWait(WAIT_TIME, TimeUnit.SECONDS);
        WebElement element2 = driver.findElement(By.xpath(".//*[@id='content']/div/div[3]/img"));

        Actions action2 = new Actions(driver);
         
        action2.moveToElement(element2).build().perform();
    }
    	 
    	public static void DragAndDrop()
    	{
    	 
    		String URL = "http://www.dhtmlx.com/docs/products/dhtmlxTree/index.shtml";
    		 
    		driver.get(URL);
    		 
    		// It is always advisable to Maximize the window before performing DragNDrop action
    		 
    		driver.manage().window().maximize();
    		 
    		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
    		 
    		WebElement From = driver.findElement(By.xpath(".//*[@id='treebox1']/div/table/tbody/tr[2]/td[2]/table/tbody/tr[2]/td[2]/table/tbody/tr[1]/td[4]/span"));
    		 
    		WebElement To = driver.findElement(By.xpath(".//*[@id='treebox2']/div/table/tbody/tr[3]/td[2]/table/tbody/tr[1]/td[4]/span"));
    		 
    		Actions builder = new Actions(driver);
    		 
    		Action dragAndDrop = builder.clickAndHold(From)
    		 
    		.moveToElement(To)
    		 
    		.release(To)
    		 
    		.build();
    		 
    		dragAndDrop.perform();
    		 
    		}
    		 
    		public static void Facebookdragdrop()
    		{
    			 String URL = "https://www.facebook.com";
        		 
    	   		  driver.get(URL);
    	          driver.manage().window().maximize();
    	    
    	   		  driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
    	    
    	   		  WebElement From = driver.findElement(By.id("email"));
    	   		 From.sendKeys("abc");
    	   		
    	   		 
    	   	 WebElement To = driver.findElement(By.id("u_0_1"));
    	    
    		}
    	public static void DragAndDrop2() throws InterruptedException
    	{
    	 
    		 String URL = "http://the-internet.herokuapp.com/drag_and_drop";
    		 
   		  driver.get(URL);
          driver.manage().window().maximize();
    
   		  driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
    
   		  WebElement From = driver.findElement(By.xpath(".//*[@id='column-a']"));
   				  WebElement To = driver.findElement(By.xpath(".//*[@id='column-b']"));
    
   			System.out.println(From.getText());
   			System.out.println(To.getText());
   			Point x=To.getLocation();
   			System.out.println(x);
   				 
   				Actions action = new Actions(driver);
				action.dragAndDropBy(From, x.getX()+10,x.getY()+10).build().perform();
				/*Action dragAndDrop = action.clickAndHold(From)
			    		 
			    		.moveToElement(To)
			    		 
			    		.release(To)
			    		 
			    		.build();
			    		 
			    		dragAndDrop.perform();*/
			    		/*try{
			    		Actions builder = new Actions(driver);  
			    		Action drag = builder.clickAndHold(From).build();
			    		drag.perform();

			    		Action move = builder.moveByOffset(x.getX()+100,x.getY()+100).build();  
			    		move.perform();  
			    		TimeUnit.SECONDS.sleep(500);  
			    		Actions release = builder.clickAndHold(To).release();  
			    		release.perform(); }
			    		catch (Exception e)
			    		{
			    			System.out.println(e);
			    		}*/
				System.out.println("Done");
   			 // driver.close();
    		}
    		 
    	
    	 
}
