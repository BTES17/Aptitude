package Frames;



import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;



public class MyAlert {
	
	public static WebDriver d1;
	  public static final int WAIT_TIME = 60;
    public static void main(String[] args) throws InterruptedException {

    	 String url= System.getProperty("user.dir")+"\\src\\chromedriver.exe";
 		 
		    System.setProperty("webdriver.chrome.driver",url); 
		   
		    d1=new ChromeDriver(); 
		   // MyAlertAccept();
		   // MyAlertConfirmation();
		    MyAlertpromt() ;
		  }
    
    public static void MyAlertAccept() throws InterruptedException
    {
    	
		d1.navigate().to("http://the-internet.herokuapp.com/javascript_alerts");
		WebElement button=d1.findElement(By.xpath(".//*[@id='content']/div/ul/li[1]/button"));
		 button.click();
		 Alert simpleAlert = d1.switchTo().alert();
			String alertText = simpleAlert.getText();
			System.out.println("MyJSExecutor text is " + alertText);
			simpleAlert.accept();
        
    }
    public static void MyAlertConfirmation() throws InterruptedException
    {
    	
		d1.navigate().to("http://the-internet.herokuapp.com/javascript_alerts");
		WebElement button=d1.findElement(By.xpath(".//*[@id='content']/div/ul/li[2]/button"));
		 button.click();
		 Alert confirmationAlert = d1.switchTo().alert();
			String alertText = confirmationAlert.getText();
			System.out.println("MyJSExecutor text is " + alertText);
			confirmationAlert.dismiss();
        
    }
	
    	 
    public static void MyAlertpromt() throws InterruptedException
    {
    	
		d1.navigate().to("http://the-internet.herokuapp.com/javascript_alerts");
		WebElement button=d1.findElement(By.xpath(".//*[@id='content']/div/ul/li[3]/button"));
		 button.click();
		    Alert promptAlert  = d1.switchTo().alert();
			String alertText = promptAlert .getText();
			System.out.println("MyJSExecutor text is " + alertText);
			//Send some text to the alert
			promptAlert .sendKeys("Accepting the alert");
			 //This sleep is not necessary, just for demonstration
			promptAlert .accept();
        
    }
}
    	 

