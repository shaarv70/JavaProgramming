package CodingPractice;

import java.util.Arrays;

public class MoveNegativeNumbertoStartofArray {

	public static void main(String[] args) {
		
		int[] a= {-1,-20,30,40,50,-8};
		
		int[] arr= new int[a.length];
		int index=0;
		
		for (int i=0;i<a.length;i++)
		{
			if(a[i]<0)
				
			{
				  arr[index]=a[i];
                  index++;
			}
	}
		for (int i=0;i<a.length;i++)
		{
			
			if(a[i]>0)
			{
				arr[index]=a[i];
				index++;
				
				
			}
			
		}

		System.out.println(Arrays.toString(arr));
		
		
	}

}
