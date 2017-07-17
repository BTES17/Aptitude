
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;


import com.google.common.base.Function;

public class LocatorIdentifier {
	
	
	
	

	static WebDriver driver;
	static void setup()
	{
		
		/*--------System is a class has a property object to define
		 *  the configuration of the working environment. It can 
		 * store the info of the current user, file path name and 
		 * current Java runtime version. 
		 * The User. directory means the current working directory.
		 *  */
		String directory= System.getProperty("user.dir")+"\\src\\chromedriver.exe";
	       /* The Chromedriver.exe file key and value have to be store in System class using setProperty method*/
        System.setProperty("webdriver.chrome.driver", directory);
       
	}
	
	
	static void open_fb()
	{
		 /*--- which means that the object (driver) is of type
		  *  WebDriver but points to 
		  * the memory allocation to all data and methods
		  *  in ChromeDriver
		  */
		 driver = new ChromeDriver();
		 
		 /*----the get method of the chrome driver class will help
		  * to get the passed URL on the chrome browser
		  * -*/
	     driver.get("http://facebook.com/");
	}
	
 static void ID ()
 {
	 /*-- Webelement is an interface that contain the 
		 * declaration of all the methods to
		 *interact with the elements of the webpage
		 * on the browser. 
		 * 
		 * chromeDriver class override the methods of the
		 *  WebElement Interface
		 */
		
		/*-- the By class has  static methods that helps return the 
		 * object of By class type.  The findelement() method of the 
		 * WebDriver class help to find the webelemnt of object type By
		 * on the webpage and return the copy of that element in a return type 
		 * WebElement.
		 * 
		 */
	 WebElement element_email= driver.findElement(By.id("email")); // id method take the value of the id attribute of 
	 //a webElement which is to be located
	 /*-- sendkeys and other methhods of Webelement Interface 
	  * send the input to the element.
	  */
     element_email.sendKeys("ABC");
 }
 static void name ()
 {
	 WebElement element_email= driver.findElement(By.name("email")); // name method take the value of the name attribute
	 // of a webElement which is to be located.
     element_email.sendKeys("ABC");
 }
 static void XPATH ()
 {
	 WebElement element_email= driver.findElement(By.xpath(".//input[@id='email'][@name='email']")); 
	 // xpath method take absolute or relative path of the webelement which is to be located.
     element_email.sendKeys("ABC");
 }
 static void CSSSelector ()
 {
	 WebElement element_email= driver.findElement(By.cssSelector("input[id='email' name='email']"));
	 // cssselector method take tagname and the attributes of the webelement which is to be located.
     element_email.sendKeys("ABC");
 }
 
	
static void Classname ()
 {
List<WebElement> elements= driver.findElements(By.tagName("label"));
for(WebElement e: elements)
{
	//System.out.println(e.getText());
	//System.out.println(elements.indexOf(e));
}
String abc=driver.findElements(By.tagName("label")).get(0).getText();
System.out.println(abc);
 }
 
	static void link ()
 {
	 WebElement element_email= driver.findElement(By.linkText("Forgotten account?"));
     element_email.click();
	 
 }
 static void partialink ()
 {
	 WebElement element_email= driver.findElement(By.partialLinkText("Forgo"));
     element_email.click();
 }
 static void tagname ()
 {
	 WebElement element_email= driver.findElements(By.tagName("input")).get(1);
     element_email.sendKeys("ABC");
 }
	public static void main(String[] args) throws IOException {
		
		setup();
		open_fb();
		 XPATH();
       
        
        
        
        
        
      
	}

}
