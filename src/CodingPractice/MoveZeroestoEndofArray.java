package CodingPractice;

import java.util.Arrays;

public class MoveZeroestoEndofArray {

	public static void main(String[] args) {
		
		
		int a[]= {10,0,0,20,40,50,60};
		int[] arr= new int[a.length];
		int index=0;
		for (int i=0;i<a.length;i++)//1
		{
			
			if(a[i]!=0)
			{
				
				arr[index]=a[i];     
				index++;				
			}
	     
		}

		for (int i=0;i<a.length;i++)
		{
			if(a[i]==0)
				
			{
				 arr[index]=a[i];
				 index++;
				
				
			}
		}
		
		System.out.println(Arrays.toString(arr));
		
}}
