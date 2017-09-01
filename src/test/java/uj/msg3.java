package uj;

import io.appium.java_client.android.AndroidDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

public class msg3 {

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
		
		String Exp_Result="9980098306";
		System.out.println("Expected Result is "+Exp_Result);
				
//		driver.findElementByName("Compose Button").click();
//		
//		driver.findElementById("com.android.mms:id/recipients_editor_to").sendKeys("9980098306");
//		driver.findElementById("com.android.mms:id/edit_text_bottom").sendKeys("test msg");
//		
//		driver.findElementById("com.android.mms:id/send_button").click();
//		
//		Thread.sleep(5000);
//		
//		driver.sendKeyEvent(AndroidKeyCode.BACK);
//		
//		Thread.sleep(3000);
		
		List<WebElement> msg_cont = driver.findElementsById("com.android.mms:id/from");
		int size = msg_cont.size();
		System.out.println(size);
		
		int flag=0;//mismatch
		
		for(int i=0;i<size;i++)
		{
			System.out.println(msg_cont.get(i).getText());
			
			if((msg_cont.get(i).getText()).contains(Exp_Result))
			{
				flag=1;
				break;
			}
			else
			{
				flag=0;
			}
						
		}
		
		
		if(flag==1)
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
		
		
		
		
		
		
		
		

	}

}
