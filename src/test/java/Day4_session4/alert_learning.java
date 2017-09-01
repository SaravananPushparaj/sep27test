package Day4_session4;

import io.appium.java_client.android.AndroidDriver;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Alert;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class alert_learning {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub		
		

		DesiredCapabilities capabilities = new DesiredCapabilities();
		
		capabilities.setCapability("deviceName","SM-G350E");
		capabilities.setCapability("platformName","Android");
		capabilities.setCapability("platformVersion","4.4.2");		
		
		capabilities.setCapability(CapabilityType.BROWSER_NAME, "Chrome");
		
		AndroidDriver driver= new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		
		driver.get("http://www.unionbankofindia.co.in/EMICal.aspx");
		
		driver.findElementById("Button1").click();
		Thread.sleep(8000);
		
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
		
		
		

	}

}
