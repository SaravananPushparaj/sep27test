package uj;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

public class msg1 {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		
		DesiredCapabilities capabilities= new DesiredCapabilities();
		
		capabilities.setCapability("deviceName","GT-I9300I");
		capabilities.setCapability("platformName","Android");
		capabilities.setCapability("platformVersion","4.4.4");
		
		capabilities.setCapability("appPackage","com.android.mms");
		capabilities.setCapability("appActivity","com.android.mms.ui.ConversationComposer");
		
		
		AndroidDriver driver= new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		
		
		Thread.sleep(5000);
				
		driver.findElementByName("Compose Button").click();
		
		driver.findElementById("com.android.mms:id/recipients_editor_to").sendKeys("9980098306");
		driver.findElementById("com.android.mms:id/edit_text_bottom").sendKeys("test msg");
		
		driver.findElementById("com.android.mms:id/send_button").click();
		
		Thread.sleep(5000);
		
		driver.sendKeyEvent(AndroidKeyCode.BACK);
		
		Thread.sleep(3000);
		
		String Actual_Result = driver.findElementById("com.android.mms:id/from").getText();
		System.out.println("Actual Result is  "+Actual_Result);
		
		String Final = Actual_Result.substring(3, 13);
		System.out.println(Final);
		
		if(Final.equals("9980098306"))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
		
		

	}

}
