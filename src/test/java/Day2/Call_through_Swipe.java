package Day2;

import io.appium.java_client.android.AndroidDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Call_through_Swipe {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub

		DesiredCapabilities capabilities= new DesiredCapabilities();
		
		capabilities.setCapability("deviceName","GT-I9300I");
		capabilities.setCapability("platformName","Android");
		capabilities.setCapability("platformVersion","4.4.4");		
		
		capabilities.setCapability("appPackage","com.android.contacts");
		capabilities.setCapability("appActivity","com.android.contacts.activities.DialtactsActivity");
		
		
		AndroidDriver driver= new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		
		Thread.sleep(3000);
		
		driver.findElementByXPath("//*[@index='3'][@class='android.app.ActionBar$Tab']").click();
		Thread.sleep(3000);
		
		Dimension size = driver.manage().window().getSize();
		System.out.println(size);
		
		//vercal swipe
		int Starty=(int)(size.height*0.90);
		int Endy=(int)(size.height*0.05); 
		
		int Startx=(int)(size.width*0.50);
		
		WebElement ele_cont = driver.findElementByClassName("android.widget.TextView");
		
		do
		{
			List<WebElement> ele_item1 = driver.findElementsByXPath("//*[@text='Office2'][@class='android.widget.TextView']");
			int size2 = ele_item1.size();
			System.out.println(size2);
			Thread.sleep(3000);
			
			
			if(size2>0)
			{
				//horizontal swipe
				System.out.println("Swipe horizontaly");
				int Startx1=(int)(size.width*0.10);
				int Endx1=(int)(size.width*0.90);
				
				WebElement ele_item3 = driver.findElementByXPath("//*[@text='Office2'][@class='android.widget.TextView']");
				int Starty1 = ele_item3.getLocation().getY();
				//horizontal swipe
				driver.swipe(Startx1, Starty1, Endx1, Starty1, 1000);
				Thread.sleep(2000);				
				break;
			}
			
			
			//vertcal swipe
			driver.swipe(Startx, Starty, Startx, Endy, 1000);
			Thread.sleep(2000);			
			
		} while(ele_cont.isDisplayed()==true);
		
		Thread.sleep(5000);	
		
		String Actual_Result = driver.findElementById("com.android.phone:id/callStateLabel").getText();
		System.out.println("Actual Result is "+Actual_Result);
		
		if(Actual_Result.equals("Dialling"))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
		
		
		
		
		
		
		
		
		
	}

}
