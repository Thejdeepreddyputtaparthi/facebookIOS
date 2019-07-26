package testScripts;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.remote.MobileCapabilityType;
public class FrameworkTest {
	

public static URL url;
public static DesiredCapabilities capabilities;
public static IOSDriver<IOSElement> driver;


@BeforeSuite
public void setupAppium() throws MalformedURLException {

  final String URL_STRING = "http://127.0.0.1:4723/wd/hub";
  url = new URL(URL_STRING);
  

  capabilities = new DesiredCapabilities();
  capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone Simulator");
  capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "iOS");
  capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11.0");
  capabilities.setCapability(MobileCapabilityType.NO_RESET, true);
  capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "XCUITest");
  capabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "80");


  driver = new IOSDriver<IOSElement>(url, capabilities);
  driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
  
//  driver.resetApp();
  
   }

}