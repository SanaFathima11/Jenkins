package pageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.PageUtility;

public class QA_Legend_LoginPage
{
	WebDriver driver;
	
@FindBy(name = "email")
WebElement usernameField;
@FindBy(name = "password")
WebElement passwordField;
@FindBy(xpath = "//button[text()='Sign in']")
WebElement loginButton;






public QA_Legend_LoginPage(WebDriver driver)   // 
{
	this.driver=driver ;
	PageFactory.initElements(driver, this);  //to initialise the driver
}











public void enterUsername(String username)
{
	PageUtility.enterText(usernameField, username);  
	
	
}
public void enterPassword(String password)
{
	PageUtility.enterText(passwordField, password);
}
public void clickLoginButton()
{
	PageUtility.clickOnElement(loginButton);
}

}



