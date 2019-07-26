package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FeedsPage extends ObjectPage {

	
	@FindBy(xpath="//XCUIElementTypeTextView")
	WebElement postTextBox;
	

	@FindBy(xpath="//XCUIElementTypeButton[@name=\"Post\"]")
	WebElement PostButton;
	
	@FindBy(xpath="//XCUIElementTypeButton[@name=\"new arrow\"]")
	WebElement ArrowLink;
	

	@FindBy(xpath="//XCUIElementTypeStaticText[@name=\"Edit Post\"]")
	WebElement EditPost;
	

	@FindBy(xpath="//XCUIElementTypeTextView[@value=\"Test post for Feeds Automation Regression\"]")
	WebElement postEditTextBox;
	

	@FindBy(xpath="//XCUIElementTypeButton[@name=\"Update\"]")
	WebElement PostUpdateButton;
	

	
	
	

	public FeedsPage(WebDriver webdriver) {
		super(webdriver);
		// TODO Auto-generated constructor stub
	}
	
	public WebElement postTextBox()
	{
		return postTextBox;
	}
	public WebElement PostButton()
	{
		return PostButton;
	}
	public WebElement ArrowLink()
	{
		return ArrowLink;
	}
	public WebElement EditPost()
	{
		return EditPost;
	}
	public WebElement postEditTextBox()
	{
		return postEditTextBox;
	}
	public WebElement PostUpdateButton()
	{
		return PostUpdateButton;
	}
	
	
	
	
	
	
}
