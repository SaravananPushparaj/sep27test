package Day3_session3;

public class driver_Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Simple_Calculator c1= new Simple_Calculator();
		System.out.println(c1.Add(10, 20));
		System.out.println(c1.Sub(10, 20));
		System.out.println(c1.Ktog(2));
		
		
		
		Scientific_Calculator c2= new Scientific_Calculator();
		System.out.println(c2.Add(10, 20));
		System.out.println(c2.Sub(10, 20));
		System.out.println(c2.pow(2, 3));
		
	}

}
