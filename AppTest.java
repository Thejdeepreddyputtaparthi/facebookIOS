package testScripts;


import org.testng.annotations.Test;

import pageObjects.LoginPage;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;


public class AppTest extends FrameworkTest {

	
	
@Test 
public void myFirstTest() throws InterruptedException   {
	  
	
	   driver.navigate().to("https://www.facebook.com");
	  
	   LoginPage loginPage = new LoginPage(driver);
	   
	   loginPage.SignIn.click();
	   
	   driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		  
	   Thread.sleep(2000);
	   
	   //Invalid DATA
	   
       loginPage.UserName.sendKeys("thejtest123@gmail.com");
	   
	   driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		  
	   Thread.sleep(2000);
	   
	   loginPage.Password.sendKeys("thejreddy");
	   
	   driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	   
	   loginPage.SignIn.click();
	   
	   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);  
	      
	   Thread.sleep(15000);  
	   
	   Assert.assertTrue(!loginPage.Password.isDisplayed(),"User can sign in to Facebook");
	   
	   
	   //Valid Data
	   
	   
	   loginPage.UserName.sendKeys("thej123test@gmail.com");
	   
	   driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		  
	   Thread.sleep(2000);
	   
	   loginPage.Password.sendKeys("1903thej");
	   
	   driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	   
	   loginPage.SignIn.click();
	   
	   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);  
	      
	   Thread.sleep(15000);  
	   
	   Assert.assertTrue(!loginPage.Password.isDisplayed(),"User can sign in to Facebook");
		   
		   
		   
		   
	      
   }
  
  
  
}