package Demo4;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

public class send_sms {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		
		DesiredCapabilities capabilities= new DesiredCapabilities();		
		
		//device details
		capabilities.setCapability("deviceName","GT-I9300I");
		capabilities.setCapability("platformName","Android");
		capabilities.setCapability("platformVersion","4.4.4");
		
		//app details
		capabilities.setCapability("appPackage","com.android.mms");
		capabilities.setCapability("appActivity","com.android.mms.ui.ConversationComposer");
				
		//Appium server details
		AndroidDriver driver= new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
				
		//wait
		Thread.sleep(6000);
		String Exp_Result="9980641155";
		System.out.println("Exp Result is "+Exp_Result);
		
		driver.findElementByName("Compose Button").click();
		Thread.sleep(3000);
		
		driver.findElementById("com.android.mms:id/recipients_editor_to").sendKeys("9980641155");
		driver.findElementById("com.android.mms:id/edit_text_bottom").sendKeys("Hello");
		driver.findElementById("com.android.mms:id/send_button").click();
		
		Thread.sleep(3000);
		driver.sendKeyEvent(AndroidKeyCode.BACK);
		
		
		String Actual_Result = driver.findElementById("com.android.mms:id/from").getText();
		System.out.println("Actual Result is "+Actual_Result);
		
		if(Actual_Result.equals(Exp_Result))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}

	}

}
