package CodingPractice;

import java.util.Arrays;

public class LeftRotateArraybyTwoPosition {

	public static void main(String[] args) {
		
		
		int[] a= {10,20,30,40,50};
		int temp1= 10;
		int temp2=20;
		
		if(a.length==1 || a.length<0)
		{
			System.out.println(Arrays.toString(a));
			
		}
		
	else
		{
		     
		for(int i=2;i<a.length;i++)
		{
			a[i-2]=a[i];           //Main code (if we want to roate by 1 then we write a[i-1]=a[i]
			
		}
		
		a[a.length-2]=temp1;
	    a[a.length-1]=temp2;
		
	    System.out.println(Arrays.toString(a));
		}

	}}
