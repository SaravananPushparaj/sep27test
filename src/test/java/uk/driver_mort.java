package uk;

import org.testng.annotations.Test;

public class driver_mort extends Base_class_mort  {

		@Test	
		public void EMI() throws InterruptedException
		{
			String Exp_Result="222.44";
			System.out.println("Expected Result is "+Exp_Result);
			
			driver.findElementById("com.boondoggle.mortcalc:id/var_amount").sendKeys("10000");
			driver.findElementById("com.boondoggle.mortcalc:id/var_years").sendKeys("5");
			driver.findElementById("com.boondoggle.mortcalc:id/var_interest").sendKeys("12");
			
			driver.findElementById("com.boondoggle.mortcalc:id/buttoncalc").click();
			Thread.sleep(2000);
			
			String Output = driver.findElementById("com.boondoggle.mortcalc:id/var_mortgage").getText();
			String Actual_Result = Output.replace("$", "");
			
			
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


