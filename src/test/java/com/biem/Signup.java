package test.java.com.biem;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;


public class Signup {

	private IOSDriver wd;
	
	
	@BeforeTest
	public void SetCapability() throws MalformedURLException
	{
		DesiredCapabilities capabilities = new DesiredCapabilities();	

		//local simulator capabilities
		//capabilities.setCapability("platformName","iOS");
		//capabilities.setCapability("platformVersion","9.3");
		//capabilities.setCapability("deviceName","iPhone 5s");
		//capabilities.setCapability("autoAcceptAlerts", true);
		//capabilities.setCapability("app", "/Users/misiek/Library/Developer/Xcode/DerivedData/snowflake-hchuoihtrlyazzffhpmkgxniqxoa/Build/Products/Debug-iphonesimulator/biemSimulator.app");
		//capabilities.setCapability("newCommandTimeout", 7200);
		
		capabilities.setCapability("appiumVersion", "1.5.3");
		capabilities.setCapability("deviceName","iPhone 5s");
		capabilities.setCapability("deviceOrientation", "portrait");
		capabilities.setCapability("platformVersion","9.2");
		capabilities.setCapability("platformName", "iOS");
		capabilities.setCapability("browserName", "");
		capabilities.setCapability("app","sauce-storage:biemsim.zip");
		capabilities.setCapability("autoAcceptAlerts", true);
		capabilities.setCapability("name", "Sign up test");

		wd = new IOSDriver(new URL("http://marcinw:5e05cdfe-7ddf-4f20-b7d6-3f018929ba19@ondemand.saucelabs.com:80/wd/hub"), capabilities);
		wd.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	}
	@Test
	public void signup_test() throws InterruptedException
	{
		wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAElement[3]")).click();
		System.out.println("Sign up button clicked");
		((IOSElement) wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[2]/UIATextField[1]"))).setValue("testname");
		
		System.out.println("Name");
		((IOSElement) wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[2]/UIATextField[2]"))).setValue("testlastname");
		
		System.out.println("Lastname");
		((IOSElement) wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[2]/UIATextField[3]"))).setValue("testmail@gmail.com");
		wd.hideKeyboard();
		System.out.println("E-mail");
		((IOSElement) wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[2]/UIATextField[4]"))).setValue("791641290");
		wd.swipe(158, 313, 158, 178, 1);
		System.out.println("Phonenumber");
		wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[2]/UIASecureTextField[1]")).sendKeys("password");
		wd.hideKeyboard();
		System.out.println("Password");
		wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[2]/UIAElement[1]")).click();
		System.out.println("Birthdate");
		wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAPicker[1]/UIAPickerWheel[1]")).sendKeys("April");
		//wd.swipe(44, 535, 44, 460, 1);
		System.out.println("Day");
		wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAPicker[1]/UIAPickerWheel[2]")).sendKeys("8");
		System.out.println("Month");
		wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAPicker[1]/UIAPickerWheel[3]")).sendKeys("2010");
		System.out.println("Year");
		wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAElement[5]")).click();
		wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[2]/UIAStaticText[4]")).click();
		System.out.println("Gender");
		wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAActionSheet[1]/UIACollectionView[1]/UIACollectionCell[1]/UIAButton[1]")).click();
		System.out.println("Choose gender");
		wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[2]/UIASwitch[1]")).click();
		System.out.println("Remember account");
		wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[2]/UIAElement[2]")).click();
		System.out.println("Create account");
		wd.quit(); // Always quit, if you don't, next test session will fail
	}
}