package Day3_session5;

import io.appium.java_client.android.AndroidDriver;

import java.io.IOException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class driver_ebayapp {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub		
		
		ebay_template c1=new ebay_template();
		c1.Start_Server();
		c1.Launch_app();
		
		String Exp_Result="247,844";
		System.out.println("Expected Result is "+Exp_Result);
		
		String Actual_Result = c1.Searchitem();		
		
		if(Actual_Result.equals(Exp_Result))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
		
		
		c1.Stop_Server();		
				
		

	}

}
