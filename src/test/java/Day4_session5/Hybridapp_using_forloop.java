package Day4_session5;

import io.appium.java_client.android.AndroidDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Hybridapp_using_forloop {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		
		DesiredCapabilities capabilities= new DesiredCapabilities();
		
		capabilities.setCapability("deviceName","GT-I9300I");
		capabilities.setCapability("platformName","Android");
		capabilities.setCapability("platformVersion","4.4.4");		
		
		capabilities.setCapability("appPackage","com.emn8.mobilem8.nativeapp.bk");
		capabilities.setCapability("appActivity","com.emn8.mobilem8.nativeapp.bk.BKNativeMobileApp");
		
		
		AndroidDriver driver= new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		
		Thread.sleep(22000);
		
		Set<String> contextHandles = driver.getContextHandles();
		System.out.println(contextHandles.size());
		
		//first page
		for(String contextname:contextHandles)
		{
			System.out.println("---First page------");
			System.out.println(contextname);
			System.out.println("-------------");
			if(contextname.contains("NATIVE"))			{
				
				driver.context(contextname);
				
			}
		}
		
		WebDriverWait wait= new WebDriverWait(driver, 45);
		WebElement ele_Voucher = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@index='9'][@class='android.view.View'][@content-desc='VOUCHERS']")));
		System.out.println("Voucher is found "+ele_Voucher.isDisplayed());
		
		ele_Voucher.click();
		
		//*******************************************************
		Thread.sleep(7000);
		//Seacond page
				for(String contextname:contextHandles)
				{
					System.out.println("---Second page------");
					System.out.println(contextname);
					System.out.println("-------------");
					if(contextname.contains("NATIVE"))			{
						
						driver.context(contextname);
						
					}
				}
				
				WebDriverWait wait2= new WebDriverWait(driver, 45);
				WebElement ele_Redeem = wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@index='17'][@class='android.view.View'][@content-desc='REDEEM']")));
				System.out.println("Redeem is found "+ele_Redeem.isDisplayed());
				
				ele_Redeem.click();
				
				//***********************************************************
		//Third page
				Thread.sleep(7000);
				for(String contextname:contextHandles)
				{
					System.out.println("---Third page page------");
					System.out.println(contextname);
					System.out.println("-------------");
					if(contextname.contains("WEBVIEW"))			{
						
						driver.context(contextname);
						
					}
				}
				
				WebDriverWait wait3= new WebDriverWait(driver, 45);
				WebElement ele_uname = wait3.until(ExpectedConditions.visibilityOfElementLocated(By.name("email")));
				System.out.println("ele_uname is found "+ele_uname.isDisplayed());
				
				ele_uname.sendKeys("sar@gmail.com");
				
				WebElement ele_pwd = driver.findElementByName("password");
				ele_pwd.click();
				Thread.sleep(3000);
				ele_pwd.sendKeys("123");
				
				//************************************
				for(String contextname:contextHandles)
				{
					System.out.println("---Third page page------");
					System.out.println(contextname);
					System.out.println("-------------");
					if(contextname.contains("NATIVE"))			{
						
						driver.context(contextname);
						
					}
				}
				
				WebDriverWait wait4= new WebDriverWait(driver, 45);
				WebElement ele_signin = wait4.until(ExpectedConditions.visibilityOfElementLocated(By.name("SIGN IN")));
				System.out.println("ele_signin is found "+ele_signin.isDisplayed());
					
		
		
		

	}

}
