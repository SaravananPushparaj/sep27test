package Day3_session2;

public class driver_Calci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calci c1= new Calci();
		
		int Add_Result = c1.Add(30, 20);
		System.out.println(Add_Result);
		
		int sub_res = c1.Sub(30, 20);
		System.out.println(sub_res);
		
		int mul_res = Calci.Mul(30, 20);
		System.out.println(mul_res);
		

	}

}
