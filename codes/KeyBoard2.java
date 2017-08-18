package Actions;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class KeyBoard2 {
	
	public static WebDriver driver;
	  public static final int WAIT_TIME = 60;
    public static void main(String[] args) {

    	 String url= System.getProperty("user.dir")+"\\src\\chromedriver.exe";
 		 
		    System.setProperty("webdriver.chrome.driver",url); 
		   
		    driver=new ChromeDriver(); 
		     MultipleActions();
		     //KeyPress();
		    
		  }
    
    public static void MultipleActions()
    {
    	driver.get("https://www.facebook.com/");
	    
        WebElement   element = driver.findElement(By.id("email"));

        Actions action = new Actions(driver);
         Action series= action.moveToElement(element).click().keyDown(element, Keys.SHIFT).sendKeys(element,"hello").keyUp(element, Keys.SHIFT).doubleClick(element).contextClick().build();
        series.perform();
    }
    	 
    	public static void KeyPress()
    	{
    	 
    		String URL = "http://the-internet.herokuapp.com/key_presses";
    		 
    		driver.get(URL);
    		 
    		// It is always advisable to Maximize the window before performing DragNDrop action
    		 
    		Actions action = new Actions(driver);
            action.sendKeys(Keys.ENTER);
            action.perform();
            String result= driver.findElement(By.id("result")).getText();
    		System.out.println(result);
    		
    		
    		Action series=action.sendKeys("R").build();
             series.perform();
            result= driver.findElement(By.id("result")).getText();
    		System.out.println(result);
    		 
    	} 	
    	 
}
