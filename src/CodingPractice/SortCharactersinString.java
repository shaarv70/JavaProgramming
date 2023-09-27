package CodingPractice;

import java.util.Arrays;

public class SortCharactersinString {

	public static void main(String[] args) {

		String sorting= "javtgrewrwgegeg";
		
		char[] a= sorting.toCharArray();
		
	/*	Arrays.sort(a);
		System.out.println(Arrays.toString(a));

*/	   char temp;
	    
	   for (int i=0;i<sorting.length( );i++)
	   {
	    for (int j=i+1;j<a.length;j++)
	    
	    {
	    	if (a[i]>a[j])
	      {
	              	  
	    	  temp=a[i];
	    	  a[i]=a[j];
	    	  a[j]=temp;        
	    	  
	    }
	    
	}
	    }
	   
	   System.out.println(Arrays.toString(a));
	
	}
	
}
