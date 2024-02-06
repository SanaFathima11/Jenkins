package automationCore;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass 
{
	public WebDriver driver;
	@SuppressWarnings("deprecation")
	public WebDriver browserInitialisation(String browserName) throws Exception
	{
		if(browserName.equalsIgnoreCase("Chrome"))
		{
			driver =new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("Edge"))
		{
			driver =new EdgeDriver();
		}
		else if(browserName.equalsIgnoreCase("Firefox"))
		{
			driver =new FirefoxDriver();
		}
		else 
		{
		throw new Exception("Invalid name Exception");	
		}
		driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
		return driver;
}
}