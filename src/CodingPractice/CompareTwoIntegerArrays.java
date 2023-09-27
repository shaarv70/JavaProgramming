package CodingPractice;

import java.util.Arrays;

public class CompareTwoIntegerArrays {

	public static void main(String[] args) {
		
		
    int a[]= {1,3,4,2,6};
    int b[]= {1,3,4,2,6};
    
    System.out.println(Arrays.equals(a, b));
    boolean isequal=true;
    
    if(a.length!=b.length)
    {
    	System.out.println("Not equal");
    }
    
   for (int i=0;i<a.length;i++)
   {
	   
	      if(a[i]!=b[i])
	      {
	    	 
	    	  isequal=false;
	    	  break;
	      }
	  
   }
		 
     if(isequal) {
	System.out.println("arrays are equal");
    }
    else
    System.out.println("not equal");

}
	}
