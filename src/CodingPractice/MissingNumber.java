package CodingPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MissingNumber {

	public static void main(String[] args) {
		
		Integer a[]= {2,4,1,5,7,8,0};
		
		ArrayList<Integer> k= new ArrayList<Integer>(Arrays.asList(a));
	    
		Collections.sort(k);
		System.out.println(k);
		
		int max= Collections.max(k);
		int min= Collections.min(k);
		
		for (int i=min;i<=max;i++)
		{
			if (!k.contains(i))
			{
				System.out.println("Missing Number is:"+i );
			}
			
		}
		
	

	}

}
