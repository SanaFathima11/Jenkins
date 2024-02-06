package utilities;

import org.openqa.selenium.WebElement;

public class PageUtility 
{
	public static void clickOnElement(WebElement element)
	{
		element.click();
	}
	
	public static void enterText(WebElement element, String value)
	{
		element.sendKeys(value);   //to give the username field from test data
	}
}