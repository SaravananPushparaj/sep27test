package Day2;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Sendsms_normal_forloop {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		
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
				
				String Exp_Result="9900488411";
				System.out.println("Expected Result is "+Exp_Result);


		//click on the edit
//		driver.findElementByName("Compose Button").click();		
//		Thread.sleep(3000);
//		//Enter the number, msg and click send
//		driver.findElementById("com.android.mms:id/recipients_editor_to").sendKeys(Exp_Result);
//		driver.findElementById("com.android.mms:id/edit_text_bottom").sendKeys("Hi May batch");
//
//		driver.findElementById("com.android.mms:id/send_button").click();
//
//		Thread.sleep(3000);
//			
//		//click on Back
//		driver.sendKeyEvent(AndroidKeyCode.BACK);

				Thread.sleep(3000);

				List<WebElement> msg_cont = driver.findElementsById("com.android.mms:id/from");
				int size = msg_cont.size();
				System.out.println(size);
				
				int flag=0;//mismatch
				
				for(int i=0;i<size;i++)
				{
					System.out.println(msg_cont.get(i).getText());
					
					if((msg_cont.get(i).getText()).equals(Exp_Result))
					{
						flag=1;//matching
						break;
					}
					else
					{
						flag=0;
					}					
					
					
				}//end of for loop
				
				
				if(flag==1)
				{
					System.out.println("Pass");
				}
				else if(flag==0)
				{
					System.out.println("Fail");
				}
				
				
				

		
		
		
		
		

	}

}
