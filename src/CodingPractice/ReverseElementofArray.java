package CodingPractice;

import java.util.Arrays;
import java.util.Collections;

public class ReverseElementofArray {

	public static void main(String[] args) {
		
		
	/*	Integer[]  a= {2,1,4,5,6};
		
		Arrays.sort(a);
		
       Arrays.sort(a,Collections.reverseOrder());
       System.out.println(Arrays.toString(a));*/
	
	    
       //2approach
       
		int[]  a= {2,1,4,5,6};
       int max=0;
       int min=0;
       int temp=0;
       
       for (int i=0;i<a.length;i++)
       {
    	   for (int j=i+1;j<a.length;j++)
    	   {
    		   if(a[i]>a[j])
    		   {
    			
    			   temp=a[i];
    			   a[i]=a[j];
    			   a[j]=temp;
    			   
    		}
    		  }
    	    }
       
       System.out.println(Arrays.toString(a));
        
       int[] c= new int[a.length];
       int index=0;
	for (int k=a.length-1;k>=0;k--)
	{
		c[index]=a[k];
		index++;
	}
	
	
	System.out.println(Arrays.toString(c));
	
	}

}
