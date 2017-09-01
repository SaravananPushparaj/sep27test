package Demo3;

import java.net.MalformedURLException;
import java.net.URL;

import io.appium.java_client.android.AndroidDriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Testcase1 {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		
		//Launch app
		//class              ref_var=Object
		DesiredCapabilities capabilities=new DesiredCapabilities();
		
		//Device details
		capabilities.setCapability("deviceName","GT-I9300I");
		capabilities.setCapability("platformName","Android");
		capabilities.setCapability("platformVersion","4.4.4");
		
		//app details
		capabilities.setCapability("appPackage","flipboard.app");
		capabilities.setCapability("appActivity","flipboard.activities.LaunchActivity");	
				
		//Appium server details
		
		AndroidDriver driver= new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		
		//wait
		Thread.sleep(18000);
				
		//Swipe four times -- from Right to left
		Dimension size = driver.manage().window().getSize();
		System.out.println(size);
		
		int Startx=(int)(size.width*0.90);
		System.out.println("Startx is "+Startx);
		
		int Endx=(int)(size.width*0.10);
		System.out.println("Endx is "+Endx);
		
		int Starty=(int)(size.height*0.50);
		System.out.println("Starty is "+Starty);
		
		
		driver.swipe(Startx, Starty, Endx, Starty, 1000);
		Thread.sleep(4000);
		
		driver.swipe(Startx, Starty, Endx, Starty, 1000);
		Thread.sleep(4000);
		
		driver.swipe(Startx, Starty, Endx, Starty, 1000);
		Thread.sleep(4000);
		
		driver.swipe(Startx, Starty, Endx, Starty, 1000);
		Thread.sleep(4000);
		
		//Get the output
		
		String Actual_Result = driver.findElementById("flipboard.app:id/board_item_title").getText();
		System.out.println("Actual Result is "+Actual_Result);
		Thread.sleep(4000);
		
		//Validate
		if(Actual_Result.equals("Business"))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
		
		Thread.sleep(4000);
		System.out.println("Right to left swipw is completed");
		//*************************************
		
		//Swipe from left to right four times
		Thread.sleep(4000);
		int Startx1=(int)(size.width*0.10);
		System.out.println("Startx1 is "+Startx1);
		
		int Endx1=(int)(size.width*0.90);
		System.out.println("Endx1 is "+Endx1);
		
		int Starty1=(int)(size.height*0.50);
		System.out.println("Starty1 is "+Starty1);	
		
		for(int i=1;i<=4;i++)
		{
		driver.swipe(Startx1, Starty1, Endx1, Starty1, 1000);
		Thread.sleep(4000);
		
		}
		
		Thread.sleep(4000);
		System.out.println("Left to right swipe is completed");

	}

}
