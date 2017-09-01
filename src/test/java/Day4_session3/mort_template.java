package Day4_session3;

public class mort_template extends Base_Class_mort {
	
	
	
	public String CalculteEMI(String Amount,String Tenure, String Interest) throws InterruptedException
	{
		driver.findElementById("com.boondoggle.mortcalc:id/var_amount").sendKeys(Amount);
		driver.findElementById("com.boondoggle.mortcalc:id/var_years").sendKeys(Tenure);
		driver.findElementById("com.boondoggle.mortcalc:id/var_interest").sendKeys(Interest);
		
		driver.findElementById("com.boondoggle.mortcalc:id/buttoncalc").click();
		Thread.sleep(3000);
		
		String Output = driver.findElementById("com.boondoggle.mortcalc:id/var_mortgage").getText();
		String Result = Output.replace("$", "");
		
		return Result;
		
		
		
	}
	

}
