import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;

public class Get_tested {

	private IOSDriver wd;
	
	
	@BeforeTest
	public void SetCapability() throws MalformedURLException
	{
		DesiredCapabilities capabilities = new DesiredCapabilities();	

		//local simulator capabilities
		capabilities.setCapability("platformName","iOS");
		capabilities.setCapability("platformVersion","9.3");
		capabilities.setCapability("deviceName","iPhone 5s");
		capabilities.setCapability("autoAcceptAlerts", true);
		capabilities.setCapability("app", "/Users/misiek/Library/Developer/Xcode/DerivedData/snowflake-hchuoihtrlyazzffhpmkgxniqxoa/Build/Products/Debug-iphonesimulator/biemSimulator.app");
		capabilities.setCapability("newCommandTimeout", 7200);
		wd = new IOSDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
		wd.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
//		capabilities.setCapability("appiumVersion", "1.5.3");
//		capabilities.setCapability("deviceName","iPhone 5s");
//		capabilities.setCapability("deviceOrientation", "portrait");
//		capabilities.setCapability("platformVersion","9.2");
//		capabilities.setCapability("platformName", "iOS");
//		capabilities.setCapability("browserName", "");
//		capabilities.setCapability("app","sauce-storage:biemsim.zip");
//		capabilities.setCapability("autoAcceptAlerts", true);
//		capabilities.setCapability("name", "Get tested test");

//		wd = new IOSDriver(new URL("http://marcinw:5e05cdfe-7ddf-4f20-b7d6-3f018929ba19@ondemand.saucelabs.com:80/wd/hub"), capabilities);
//		wd.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	}
	
	@Test
	public void get_tested_test() throws InterruptedException
	{
		//logowanie start
		
		wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAElement[2]")).click();
		((IOSElement) wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[2]/UIAScrollView[1]/UIATextField[1]"))).setValue("testmail1@gmail.com");
		((IOSElement) wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[2]/UIAScrollView[1]/UIASecureTextField[1]"))).setValue("osim8888");
		wd.hideKeyboard("Return");
		wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[2]/UIAScrollView[1]/UIASwitch[1]")).click();
		wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[2]/UIAScrollView[1]/UIAElement[1]")).click();
		System.out.println("Login success");
		//logowanie koniec

		wd.findElement(By.id("GET TESTED")).click();
		wd.findElement(By.id(" Get Started")).click();
		wd.findElement(By.id("I want to get tested")).click();
		wd.findElement(By.id("Next")).click();
		wd.findElement(By.id("No Symptoms")).click();
		wd.findElement(By.id("Next")).click();
		wd.findElement(By.id("")).click();
		
//		wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAElement[5]")).click();
//		wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAElement[6]")).click();
//		wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[2]/UIAElement[1]")).click();
//		wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAElement[2]")).click();
//		wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[2]/UIAElement[1]")).click();
//		wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAElement[2]")).click();
//		wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[2]/UIAElement[1]")).click();
//		wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAElement[2]")).click();
//		wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[2]/UIAElement[1]")).click();
//		wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAElement[2]")).click();
//		wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[2]/UIAElement[2]")).click();
//		wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAElement[2]")).click();
//		wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[2]/UIAElement[2]")).click();
//		wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAElement[2]")).click();
//		wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAElement[2]")).click();
//		wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAElement[2]")).click();
//		wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAElement[2]")).click();
//		wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[2]/UIAElement[1]")).click();
//		wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAElement[2]")).click();
//		wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAElement[2]")).click();
//		wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[2]/UIAElement[1]")).click();
//		wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[2]/UIAScrollView[1]/UIAElement[1]")).click();
//		wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[2]/UIAElement[1]")).click();
//		wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[2]/UIAElement[2]")).click();
//		wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAElement[2]")).click();
//		wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAElement[2]")).click();
//		wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[2]/UIAScrollView[1]/UIAElement[104]")).click();
//		wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[2]/UIAScrollView[2]/UIAElement[2]")).click();
//		wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[2]/UIAElement[1]")).click();
//		wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAElement[2]")).click();
//		wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAElement[2]")).click();
//		((IOSElement) wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[2]/UIAScrollView[1]/UIATextField[3]"))).setValue("4242424242424242");
//		wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[2]/UIAScrollView[1]/UIATextField[4]")).sendKeys("1218");
//		wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[2]/UIAScrollView[1]/UIATextField[5]")).sendKeys("741");
//		wd.swipe(155, 315, 155, 125, 1);
//		wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[2]/UIAScrollView[1]/UIAElement[3]")).click();
//		wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[2]/UIAElement[1]")).click();
//		System.out.println("Get tested success");
		wd.quit(); // Always quit, if you don't, next test session will fail
	}
}