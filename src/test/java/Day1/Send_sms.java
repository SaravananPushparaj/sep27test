package Day1;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

public class Send_sms {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		
		//Launch app
		
		//Launch app
				//class              ref_variable= Object
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
				Thread.sleep(5000);
				
				String Exp_Result="9980098306";
				System.out.println("Expected Result is "+Exp_Result);
		
		
		//click on the edit
		driver.findElementByName("Compose Button").click();		
		Thread.sleep(3000);
		//Enter the number, msg and click send
		driver.findElementById("com.android.mms:id/recipients_editor_to").sendKeys(Exp_Result);
		driver.findElementById("com.android.mms:id/edit_text_bottom").sendKeys("Hi May batch");
		
		driver.findElementById("com.android.mms:id/send_button").click();
		
		Thread.sleep(3000);
			
		//click on Back
		driver.findElementById("android:id/up").click();
		//driver.sendKeyEvent(AndroidKeyCode.BACK);
		
		Thread.sleep(3000);

		//get the output
		String Actual_Result = driver.findElementById("com.android.mms:id/from").getText();
		System.out.println("Actual Result "+Actual_Result);
		
		//validate
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
