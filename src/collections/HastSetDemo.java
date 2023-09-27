package collections;

import java.util.*;

public class HastSetDemo {

	public static void main(String[] args) 
	{
	   
	        //declaration
	 		HashSet myset=new HashSet();
	 		//Set myset=new HashSet();
	 		//HashSet <Integer>myset=new HashSet<Integer>();
	 		
	 		myset.add(100);
	 		myset.add(10.5);
	 		myset.add("welcome");
	 		myset.add(100);
	 		myset.add(null);
	 		myset.add(null);
	 		
	 		System.out.println(myset); //[null, 100, 10.5, welcome]   // insertion order not preserved
	 		
	 		System.out.println(myset.size()); //4
	 		
	 		//remove value from hashset
	 		myset.remove(10.5);  // we have to pass value but not index - index wont support here
	 		System.out.println("after removing:"+ myset); //[null, 100, welcome]
	 		
	 		// insertion is not possible in hashset
	 		
	 		
	 		//get specific value from hashset - not possible
	 		
	 		
	 		for(Object x:myset)
	 		{
	 			System.out.println(x);
	 		}
	 		
	 		// to read the objects of hashset one by one  we can use iterator()
	 		HashSet set=new HashSet();
	 		set.add("Nakul");
	 		set.add(34);
	 		set.add(null);
	 		set.add("Roahn");
	 		
	 		Iterator i= set.iterator();
	 		
	 		while (i.hasNext())
	 		{
	 			System.out.println(i.next());
	 		}
	 	
	 		//Union   intersection   difference
	 		
	 		
	 		HashSet<Integer> set1= new HashSet<Integer>();
	 		set1.add(1);
	 		set1.add(2);
	 		set1.add(3);
	 		set1.add(4);
	 		System.out.println(set1);
	 		
	 		HashSet<Integer> set2= new HashSet<Integer>();
	 		set2.add(3);
	 		set2.add(5);
	 		set2.add(4);
	 		set2.add(9);
	 		System.out.println(set2);
	 		
	 		//union will find out the unique elements from both sets
	 //		set1.addAll(set2);
	 	//	System.out.println(set1);
	 		
	 		//intersection is getting common elements from both set
	 		
	 //	    set1.retainAll(set2);
	 	//    System.out.println(set1);//it will give the common elements of both the sets in set1
	 		
	 		//difference
	 		set1.removeAll(set2); //it will give the difference in values of 2 sets as per set1
	 		System.out.println(set1);
	 		
	 		//subset
	 		
	 		boolean dec=set1.containsAll(set2);
	 		System.out.println(dec);//false
	 		
	 		
	 	}

			   

	}


