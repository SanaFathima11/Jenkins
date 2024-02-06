package TestCases;

import org.testng.annotations.Test;
import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import automationCore.BaseClass;
import pageClasses.QA_Legend_LoginPage;

public class QALegendTestCases extends BaseClass

{
public WebDriver driver; //selenium and browser connection mediator
FileInputStream fis;   //to get the location ---declare
Properties prop;  // to pick the data
QA_Legend_LoginPage loginpage;
QA_Legend_Homepage homepage;

@BeforeMethod
@Parameters({"Browser"})  //to pass the value of brower from tesrtng
public void initialization(String browser) throws Exception
{
	
driver = browserInitialisation(browser); 
fis = new FileInputStream("C:\\Users\\sanaa\\eclipse-workspace\\QA_Legend\\src\\main\\java\\testdata\\testdata.properties");
prop = new Properties();
loginpage = new QA_Legend_LoginPage(driver); // to load the page.
prop.load(fis); // to load the memory
driver.get(prop.getProperty("url")); // to fetch the url from testdata.properties

}
@Test
public void loginCRM()
{
	
	loginpage.enterUsername(prop.getProperty("username"));
	loginpage.enterPassword(prop.getProperty("password"));
	loginpage.clickLoginButton();	
}





































}