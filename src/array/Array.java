package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Array {
	public static void main(String[] args) 
	{
		//Array is homogeneous, contains only one type of values, their values can be modified
		//	initialization

		//Approach1: 
		int a[]= new int[5];	//here we are fixing the size before only 

		//Approach2:"

		int c[]= {400,200,500,700};
		int d[]= {400,200,500,700};

		// Approach 3:
		int[] h =new int[4];

		//size or length of an array
		System.out.println(c.length);

		//get single value of array 
		System.out.println(c[2]);

		//get all value of array-shortcut
		System.out.println(Arrays.toString(c));

		/*get all values through normal loop
		for(int i=0;i<c.length;i++)
		{
			System.out.print(c[i]+"\t");
		}*/

		//get all values from advanced for loop
		/*	for(int f:c)
		{
			System.out.println(f);
		}*/

		//for sorting in array
		Arrays.sort(c);   
		System.out.println(Arrays.toString(c));
		
		//for srting array in dscesding order
		Integer k[]= {100,500,900,1200,500};
		Arrays.sort(k,Collections.reverseOrder());
		System.out.println(Arrays.toString(k));
		
		int e[]= {400,200,500,700};
		int f[]= {400,200,500,700};
		//Comparing two arrays

		boolean g= Arrays.equals(e, f);
		System.out.println(Arrays.mismatch(c, d));
		System.out.println(g);
        
		//converting int array to set, list  using stream (if we are using small int then this stream method will be used)
        /*Normally if we want to convert integer array into set or List then we have to create array of Integer class type   */  
        
		
		   //converting array to arraylist
		   String v[]= {"dog","cat","Elephant","snail"};
	        System.out.println(Arrays.toString(a));	
	        ArrayList<String> al= new ArrayList<String>(Arrays.asList(v));
	        System.out.println(al);
		
	      //converting array to set using asList
	        
	      String[] o= {"dog","cat","Elephant","snail"};
	      HashSet j= new HashSet(Arrays.asList(o));
          j.add(null);
          j.add("Chandu");
          System.out.println(j);

         int  q[]= {1,2,34,6};
          Set myset = new HashSet(Arrays.stream(q).boxed().collect(Collectors.toSet()));
          System.out.println(myset);
          
     //     List mklist= new ArrayList(Arrays.asList(q));//This method will give address only because we are not using Integer clas type array here.
          //If we use stream() then this will give the values
          
          List mklist= new ArrayList(Arrays.stream(q).boxed().collect(Collectors.toList()));
         
          
          
          System.out.println(mklist);   
          
          
	}
}
