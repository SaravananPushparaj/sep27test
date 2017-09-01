package uj;

import java.net.MalformedURLException;
import java.net.URL;

import io.appium.java_client.android.AndroidDriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

public class T1 {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		
		DesiredCapabilities capabilities= new DesiredCapabilities();
		
		capabilities.setCapability("deviceName","GT-I9300I");
		capabilities.setCapability("platformName","Android");
		capabilities.setCapability("platformVersion","4.4.4");
		
		capabilities.setCapability("appPackage","flipboard.app");
		capabilities.setCapability("appActivity","flipboard.activities.LaunchActivity");
		
		
		AndroidDriver driver= new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		
		
		Thread.sleep(18000);
		
		
		Dimension size = driver.manage().window().getSize();
		System.out.println("Size is "+size);
		
		int Startx=(int)(size.width *0.90);
		int Endx=(int)(size.width *0.10);
		
		int Starty=(int)(size.height *0.50);
		
		
		
		driver.swipe(Startx, Starty, Endx, Starty, 1000);
		Thread.sleep(4000);
		
		driver.swipe(Startx, Starty, Endx, Starty, 1000);
		Thread.sleep(4000);
		
		driver.swipe(Startx, Starty, Endx, Starty, 1000);
		Thread.sleep(4000);
		
		driver.swipe(Startx, Starty, Endx, Starty, 1000);
		Thread.sleep(4000);
		
		 String Actual_Result = driver.findElementById("flipboard.app:id/board_item_title").getText();
		 System.out.println(Actual_Result);
		 
		 if(Actual_Result.equals("Business"))
		 {
			 System.out.println("Pass");
		 }
		 else
		 {
			 System.out.println("Fail");
		 }
		 
		 System.out.println("Right to left swipe is completed");
		 Thread.sleep(4000);
		 //******************************************************
		 
		 int Startx1=(int)(size.width *0.10);
		 int Endx1=(int)(size.width *0.90);
			
		  int Starty1=(int)(size.height *0.50);
			
			
			for(int i=1;i<=4;i++)
			{
			driver.swipe(Startx1, Starty1, Endx1, Starty1, 1000);
			Thread.sleep(4000);
			}
		
			System.out.println("Left to Right swipe is completed");
	}

}
