package CodingPractice;

import java.util.Arrays;

public class SquareSortedArrayofPositiveAndNegativeNumbers {

	public static void main(String[] args) {
		
		
		int a[]= {-6,-1,2,4,5,7};

       Arrays.sort(a);
       int arr[]=new int[a.length];
       
       
       
       for (int i=0;i<a.length;i++)
       {
    	   
    	   arr[i]= a[i]*a[i];
    	   
    	   
        }
       
       Arrays.sort(arr);
	    System.out.println(Arrays.toString(arr));
	
	
	}

}
