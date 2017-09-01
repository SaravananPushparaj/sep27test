package uj;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

public class drag_drop {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		
		DesiredCapabilities capabilities= new DesiredCapabilities();
		
		capabilities.setCapability("deviceName","GT-I9300I");
		capabilities.setCapability("platformName","Android");
		capabilities.setCapability("platformVersion","4.4.4");
		
		capabilities.setCapability("appPackage","com.mobeta.android.demodslv");
		capabilities.setCapability("appActivity","com.mobeta.android.demodslv.Launcher");
		
		
		AndroidDriver driver= new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		
		
		Thread.sleep(5000);
		
		//driver.findElementById("com.mobeta.android.demodslv:id/activity_title").click();
		
		WebElement ele_Basic = driver.findElementById("com.mobeta.android.demodslv:id/activity_title");
		System.out.println(ele_Basic);
		ele_Basic.click();
		
		List<WebElement> ele_cont= driver.findElementsById("com.mobeta.android.demodslv:id/drag_handle");
		int size = ele_cont.size();
		System.out.println(size);
		
		TouchAction action= new TouchAction(driver);
		action.longPress(ele_cont.get(0)).moveTo(ele_cont.get(5)).release().perform();
		
		Thread.sleep(8000);
		
		action.longPress(ele_cont.get(6)).moveTo(ele_cont.get(1)).release().perform();
		
		
		
		

	}

}
