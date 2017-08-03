package Utility;




import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;



public class Log4j {
	
	final static Logger logger = Logger.getLogger(Log4j.class);
	
	public static void main(String[] args) {
	//BasicConfigurator.configure();
	DOMConfigurator.configure("NewlogFile.xml");
       
     MyLog("I am virus ");
	}
	
	static public void MyLog(String Message)
	{
		logger.error(Message);
	}
	static public void Testcasestart(String Message)
	{
		logger.info(Message);
	}
	static public void TestcaseEnd(String Message)
	{
		logger.info(Message);
	}
	static public void Browser(String Message)
	{
		logger.info(Message);
	}
	
	
}

