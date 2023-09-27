package CodingPractice;

import java.util.Collections;

public class MaximumDifferencebwElementinArray {

	public static void main(String[] args) {
		
	
		int a[]= {1,4,5,2,3,6,3,9,4,5,6};
		int largest=a[0];
		int smallest=a[0];
		int currentsmall=a[0];
		
		for (int i=1;i<a.length;i++)
		{
			if(a[i]>largest)
			{
				largest=a[i];     //largest   -5,6,9
			}
			
			else
			{   currentsmall=a[i];       
				
			}
		    
		   if(smallest>currentsmall)
			{
				smallest=currentsmall;
			}
		}
		
		System.out.println(largest);
		System.out.println(smallest);
        System.out.println("Max difference:"+(largest-smallest));
	
	}}

