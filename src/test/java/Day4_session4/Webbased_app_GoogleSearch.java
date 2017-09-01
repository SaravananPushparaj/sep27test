package Day4_session4;

import java.net.MalformedURLException;
import java.net.URL;

import io.appium.java_client.android.AndroidDriver;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Webbased_app_GoogleSearch {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		
		
		DesiredCapabilities capabilities = new DesiredCapabilities();
		
		capabilities.setCapability("deviceName","SM-G350E");
		capabilities.setCapability("platformName","Android");
		capabilities.setCapability("platformVersion","4.4.2");		
		
		capabilities.setCapability(CapabilityType.BROWSER_NAME, "Chrome");
		
		AndroidDriver driver= new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		
		driver.get("http://www.google.co.in");
		Thread.sleep(10000);
		
		driver.findElementByName("q").sendKeys("Sachin");
		driver.findElementByClassName("_Mle").click();
		
		Thread.sleep(12000);
		
		String Actual_Result = driver.findElementByXPath("//div[contains(text(),'cricketer')]").getText();
		System.out.println("Actual Result is "+Actual_Result);
		
		
		
		
		
		

	}

}
