package CodingPractice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class MergeArraysWithoutRepetation {

	public static void main(String[] args) {
		
	     
		int[] a= {1,2,4,5,6,7};
		int[] b= {1,3,4,5,6,3,8};
	    int c[]=new int[a.length+b.length];
		
	 	int index=0;
	 	Set<Integer> myset= new HashSet<>();
	 	
	 	for (int i=0;i<a.length;i++)
	 		
	 	{
	 		if(myset.add(a[i]))
	 			
	 		{
	 			c[index++]=a[i];     //124567
	 		}
	 	}             
    	
	 	
	 	
	 	System.out.println(index);
	 	for (int i=0;i<b.length;i++)
	 	{
	 		int num=0;
	 		for (int j=i;j<c.length;j++)
	 		{
	 			if(b[i]==c[j])
	 			{
	 				num=1;
	 				break;
	 			}
	 			
	 		}
	 		
	 		if(num==0)
	 		{
	 			c[index]=b[i];
	 	        index++;
	 		}
	 	
	 	}
		
		System.out.println(Arrays.toString(c));

		

	}

}
