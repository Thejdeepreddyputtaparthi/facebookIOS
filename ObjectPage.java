package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import io.appium.java_client.ios.IOSDriver;

public class ObjectPage {

	
	WebDriver driver;
	public ObjectPage(WebDriver webdriver)
	{
		this.driver=driver;
		PageFactory.initElements(webdriver,this);
		
		
	}
	
}