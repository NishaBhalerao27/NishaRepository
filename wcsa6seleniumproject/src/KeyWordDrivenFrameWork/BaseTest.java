package KeyWordDrivenFrameWork;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest {

	private static final String PROP_PATH = null;
	static WebDriver driver;
	public void openBrowser() throws IOException
	{
		// Read the data from property file to get the Browservalue and url
	   Flib flib = new Flib();
	   String browserValue = flib.readPropertyDat(PROP_PATH,"Browser");
	   String url = flib.readPropertyDat(PROP_PATH,"Url");
	 
	   if(browserValue.equalsIgnoreCase("chrome"))
	   {
		   driver=new ChromeDriver();
	   }
	   else if(browserValue.equalsIgnoreCase("firefox"))
	   {
		   driver=new FirefoxDriver();
	   }
	   
	   else if(browserValue.equalsIgnoreCase("Edge"))
	   {
		   driver=new EdgeDriver();
	   }
	   else
	   {
		   System.out.println("enter the valid Browser Value!!!");
	   }
	   
	   //maximize the browser
	   driver.manage().window().maximize();
	   // apply implicit wait
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	  //launch the WebApplication
	   driver.get(url);
	   
	}
	
	public void closeBrowser()
	{
		driver.quit();
	}
	


}
