package Day2;

import io.appium.java_client.android.AndroidDriver;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

public class is_app_installed {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		
		File app= new File("D:\\Testing\\Drag_drop\\com.mobeta.android.demodslv.apk");
		
		DesiredCapabilities capabilities= new DesiredCapabilities();
		
		capabilities.setCapability("deviceName","GT-I9300I");
		capabilities.setCapability("platformName","Android");
		capabilities.setCapability("platformVersion","4.4.4");	
		
		capabilities.setCapability("app", app.getAbsolutePath());		
		
		AndroidDriver driver= new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		
		Thread.sleep(8000);
		
		if(driver.isAppInstalled("com.mobeta.android.demodslv"))
		{
			System.out.println("Successfully Installed the APP");
			Thread.sleep(8000);
			
			driver.removeApp("com.mobeta.android.demodslv");
			System.out.println("Removed the app");
			Thread.sleep(8000);
			
			
			driver.installApp("D:\\Testing\\Drag_drop\\com.mobeta.android.demodslv.apk");
			System.out.println("Re installed the app");
			Thread.sleep(8000);
		}
		else
		{
			System.out.println("NOT installed");
		}

	}

}
