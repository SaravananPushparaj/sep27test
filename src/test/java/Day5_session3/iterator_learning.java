package Day5_session3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class iterator_learning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		List<String> arr= new ArrayList<String>();
		
		arr.add("mango");
		arr.add("orange");
		arr.add("grapes");
		arr.add("apple");
		arr.add("mango");
		
		//for each
//		for(String ele:arr)
//		{
//			System.out.println(ele);
//		}
		
		//normal for loop
		
//		for(int i=0;i<arr.size();i++)
//		{
//			System.out.println(arr.get(i));
//		}
		
		
		Iterator<String> itr = arr.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());		
			
			
		}

	}

}
