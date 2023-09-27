package CodingPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

import array.Array;

public class Intersectionof2Arrays {

	public static void main(String[] args) {
		
		//Intersection means common elements in two array
		
		int a[]= {1,2,3,4};
		int b[]= {5,4,7,3,1};
		
	
	/*	HashSet<Integer> set1= new HashSet<>(Arrays.stream(a).boxed().collect(Collectors.toSet()));
		HashSet<Integer> set2= new HashSet<>(Arrays.stream(b).boxed().collect(Collectors.toSet()));
		
		ArrayList<Integer> mylist= new ArrayList<>();
	     set1.retainAll(set2);
	     System.out.println(set1);
		
		//normal approach
	    
	     for (int c:a)
	     {
	    	 
	    	 for (int j=0;j<b.length;j++)
	    	 {
	    		 
	    		 if (c==b[j])
	    		 {
	    			mylist.add(c);
	    			
	    		 }
	    	 }
	    	 
	     }
	     
	     
	    
	     System.out.println(mylist);*/
	     
	     //3rd approach
	     Set<Integer> myset= new HashSet<>();
	     for (int v:a)
	     {
	    	 myset.add(v);
	    	 
	     }
	     
	     
	     
	     for (int l:b)
	     {
	    	 
	    	 if(myset.contains(l))
	    	 {
	    		 System.out.println(l);
	    	 }
	    	 
	     }
	     
		
		
	}

	

}
