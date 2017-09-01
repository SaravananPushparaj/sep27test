package Day4_session5;

import io.appium.java_client.android.AndroidDriver;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class hybrid_app_maps {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		
		//File app= new File("D:\\Testing\\Burger_King\\bk-mobile-native.apk");
		DesiredCapabilities capabilities= new DesiredCapabilities();
		
//		capabilities.setCapability("deviceName","GT-I9300I");
//		capabilities.setCapability("platformName","Android");
//		capabilities.setCapability("platformVersion","4.4.4");
		
		capabilities.setCapability("deviceName","SM-G350E");
		capabilities.setCapability("platformName","Android");
		capabilities.setCapability("platformVersion","4.4.2");
		
		//capabilities.setCapability("app",app.getAbsolutePath());
		
		capabilities.setCapability("appPackage","com.emn8.mobilem8.nativeapp.bk");
		capabilities.setCapability("appActivity","com.emn8.mobilem8.nativeapp.bk.BKNativeMobileApp");
		
		
		AndroidDriver driver= new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		
		Thread.sleep(22000);
		
		Set<String> contextHandles = driver.getContextHandles();
		System.out.println(contextHandles.size());
		
		//maps
		Map<String,String> hashMap= new HashMap<String,String>();
		//*************************************************
		
		//first page
		for(String contextname:contextHandles)
		{
			if(contextname.contains("NATIVE"))
			{
				hashMap.put("native", contextname);		
				
			}
			else if(contextname.contains("WEBVIEW"))
			{
				hashMap.put("webview", contextname);
			}		
			
		}
		
		//*********************************************
		//first page
		driver.context(hashMap.get("webview"));
		
		
		WebDriverWait wait= new WebDriverWait(driver, 45);
		WebElement ele_Voucher = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class=' x-button menu-button x-button-normal']")));
		System.out.println("Voucher is found "+ele_Voucher.isDisplayed());
		
		ele_Voucher.click();
//		
//		//*******************************************************
//		Thread.sleep(7000);
//		
//				driver.context(hashMap.get("native"));
//				
//				WebDriverWait wait2= new WebDriverWait(driver, 45);
//				WebElement ele_Redeem = wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@index='17'][@class='android.view.View'][@content-desc='REDEEM']")));
//				System.out.println("Redeem is found "+ele_Redeem.isDisplayed());
//				
//				ele_Redeem.click();
//				
//				//***********************************************************
//		//Third page
//				Thread.sleep(7000);
//				driver.context(hashMap.get("webview"));
//				
//				WebDriverWait wait3= new WebDriverWait(driver, 45);
//				WebElement ele_uname = wait3.until(ExpectedConditions.visibilityOfElementLocated(By.name("email")));
//				System.out.println("ele_uname is found "+ele_uname.isDisplayed());
//				
//				ele_uname.sendKeys("sar@gmail.com");
//				
//				WebElement ele_pwd = driver.findElementByName("password");
//				ele_pwd.click();
//				Thread.sleep(3000);
//				ele_pwd.sendKeys("123");
//				
//				//************************************
//				driver.context(hashMap.get("native"));
//				
//				WebDriverWait wait4= new WebDriverWait(driver, 45);
//				WebElement ele_signin = wait4.until(ExpectedConditions.visibilityOfElementLocated(By.name("SIGN IN")));
//				System.out.println("ele_signin is found "+ele_signin.isDisplayed());
//					
//		
		
		

	}

}
