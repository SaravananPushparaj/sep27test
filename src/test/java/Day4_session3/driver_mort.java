package Day4_session3;

import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;

public class driver_mort {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		
		mort_template c1= new mort_template();
		
		c1.Start_Server();
		c1.Launch_App();
		
		ExcelReadWrite xl= new ExcelReadWrite("D:\\EMI_Data1.xls");
		HSSFSheet Sheet1 = xl.Setsheet("Sheet1");
		int RowCount = xl.getrowcount(Sheet1);
		System.out.println("Row Count is  "+RowCount);
		
		for(int i=1;i<=2;i++)
		{
			String Amount = xl.Readvalue(Sheet1, i, "Amount");
			String Interest = xl.Readvalue(Sheet1, i, "Interest");
			String Tenure = xl.Readvalue(Sheet1, i, "Tenure").replace(".0", "");
			String Exp_Result = xl.Readvalue(Sheet1, i, "Exp_Result");
			
			String Actual_Res = c1.CalculteEMI(Amount, Tenure, Interest);			
			xl.writecell(Sheet1, i, "Actual_Result", Actual_Res);
			
			if(Actual_Res.equals(Exp_Result))
			{
				xl.writecell(Sheet1, i, "Status", "Pass");
			}
			else
			{
				xl.writecell(Sheet1, i, "Status", "Fail");
			}
					
			
		}//end of for loop
		
		
		xl.save_excel("D:\\EMI_Data1.xls");
		
		c1.Stop_Server();
		

	}

}
