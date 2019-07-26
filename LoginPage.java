package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends ObjectPage{
		
	

	@FindBy(id="email")
	public WebElement UserName;
	

	@FindBy(id="pass")
	public WebElement Password;
	
	@FindBy(id="loginbutton")
	public WebElement SignIn;
	
	
	
	
	
	
	public LoginPage(WebDriver webdriver) {
		super(webdriver);
		// TODO Auto-generated constructor stub
	}
	
	public WebElement UserName()
	{
		return UserName;
	}
	public WebElement Password()
	{
		return Password;
	}
	public WebElement SignIn()
	{
		return SignIn;
	}
	
	
	
	
	
	
	
}
