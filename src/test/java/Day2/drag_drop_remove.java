package Day2;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import io.appium.java_client.android.AndroidDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

public class drag_drop_remove {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		
		DesiredCapabilities capabilities= new DesiredCapabilities();
		
		capabilities.setCapability("deviceName","GT-I9300I");
		capabilities.setCapability("platformName","Android");
		capabilities.setCapability("platformVersion","4.4.4");		
		
		capabilities.setCapability("appPackage","com.mobeta.android.demodslv");
		capabilities.setCapability("appActivity","com.mobeta.android.demodslv.Launcher");
		
		
		AndroidDriver driver= new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		
		Thread.sleep(3000);
		
		driver.findElementByXPath("//*[@index='0'][@text='CursorAdapter'][@class='android.widget.TextView']").click();
		Thread.sleep(2000);
		
		List<WebElement> ele_txtcont = driver.findElementsById("com.mobeta.android.demodslv:id/text");
		int size = ele_txtcont.size();
		
		
		List<WebElement> ele_remcont = driver.findElementsById("com.mobeta.android.demodslv:id/click_remove");
		int size2 = ele_remcont.size();
		Thread.sleep(3000);
		
		for(int i=0;i<size;i++)
		{
			
			if((ele_txtcont.get(i).getText()).equals("Michael Brecker"))
			{
				ele_remcont.get(i).click();
				break;
				
			}
			
			
		}
		
		Thread.sleep(3000);
		//************************************************************
		
		List<WebElement> ele_txtcont2 = driver.findElementsById("com.mobeta.android.demodslv:id/text");
		int size3 = ele_txtcont2.size();
		Thread.sleep(3000);
		
		int flag=0;//Micheal breacker is avialable 
		
		for(WebElement element:ele_txtcont2)
		{
			if(!(element.getText()).equals("Michael Brecker"))
			{
				flag=1;
			}
			else
			{
				flag=0;
				break;
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
