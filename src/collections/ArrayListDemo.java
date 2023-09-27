package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ArrayListDemo {

	public static void main(String[] args) 
	{
		ArrayList<String> al=new ArrayList<String>();//using generic
		al.add("Rohan");
		al.add("Chinky");
		al.add("Manoj");
		al.add("Raanku");
		al.add("Rohan");

		List l= new ArrayList();//another way of declaration

		//declaration
		ArrayList mylist=new ArrayList();
		//ArrayList <String>mylist=new ArrayList<String>();  // only strings
		//List mylist=new ArrayList();


		//adding data elements into arraylist
		mylist.add(100);
		mylist.add(10.5);
		mylist.add("welcome");
		mylist.add(true);
		mylist.add(100);
		mylist.add(null);
		mylist.add(null);

		//size of arraylist
		System.out.println(mylist.size());//7

		System.out.println(mylist);  //[100, 10.5, welcome, true, 100, null, null]

		//adding one array list to another arraylist

		al.addAll(1, mylist);// this will add the second collection from the index specified in first collection
		System.out.println(al);

		//clone a array list

		ArrayList <String> clonelist= (ArrayList<String>) al.clone();
		System.out.println(clonelist);

		//index of

		System.out.println(al.indexOf("Manoj")>0);//true

		//last index of 

		System.out.println(al.lastIndexOf("Rohan"));

		//remove value from arraylist
		mylist.remove(3);
		System.out.println("After removing element:"+mylist);  //[100, 10.5, welcome, 100, null, null]

		//removeif 
		ArrayList<Integer> m= new ArrayList(Arrays.asList(100,245,389,400,789,564));
		m.removeIf(num ->num%2!=0);
		System.out.println(m);

		//singleton
		//al.retainAll(Collections.singleton("Rohan"));//it will only print duplicate Rohan 
		//System.out.println(al);

		//Create a sublist from a list

		ArrayList<String> sub= new ArrayList<String>( al.subList(1,4));
		System.out.println(sub);

		Object p[]= sub.toArray();
		System.out.println(Arrays.toString(p));

		//inserting new element in the middle of the list
		mylist.add(2,"java");

		System.out.println("after insertion:"+mylist);  //[100, 10.5, java, welcome, 100, null, null]


		//getting the value from index
		System.out.println(mylist.get(3));

		//read all the data from arraylist

		for(Object x:mylist)
		{
			System.out.println(x);
		}

		mylist.clear(); //clears the data from arraylist
		System.out.println("After clearing"+ mylist);  // []


		//Second approach for iteration

		//   al.stream().forEach(ele -> System.out.println(ele));    // here we can use any variable name instead of ele 

		//third  Iterator approach

		Iterator h=al.iterator();// iterator() will generate the addresses for every element and store in h 

		while(h.hasNext())     // this will check whether address present or not 
		{
			System.out.println(h.next()); // it will fetch the values at that address and go to the next value    
		}

		//Remove duplicate elements in arraylist
		ArrayList<Integer> ul= new ArrayList<Integer>(Arrays.asList(10,10,10,20,20,20,28,38,78,38,98,97,98,97,99,95,93));

		//1.Approach using hashset
		LinkedHashSet<Integer> myset= new LinkedHashSet<Integer>(ul);
		ArrayList<Integer> uf= new ArrayList<Integer>(myset);
		System.out.println(uf);

		//2. Approach using stream()

		List<Integer> markslist=ul.stream().distinct().collect(Collectors.toList());
		System.out.println(markslist);

		
		//Compare arraylist
		
		//1. using sort & equals
		
		ArrayList<String> l1= new ArrayList<String>(Arrays.asList("A","B","C","D","F"));
		ArrayList<String> l2= new ArrayList<String>(Arrays.asList("A","B","C","D","E"));
		ArrayList<String> l3= new ArrayList<String>(Arrays.asList("B","A","C","D","F"));
		
		Collections.sort(l1);//sorting is must
		Collections.sort(l2);
		
		l1.equals(l2);//false
		l1.equals(l3);//false
		
		Collections.sort(l3);
		System.out.println(l1.equals(l3));//true
		
		//2. Find out missing element
           
		//l1.addAll(l2);
	//    l1.removeAll(l2);
		   
        System.out.println(l1);//[F]

	     //3. Common elemnets
        
      //  l1.retainAll(l2);//duplicate
        System.out.println(l1);
        
        
        //4.swap number in arraylist
        Collections.swap(l1, 1, 2);
        System.out.println(l1);
	
	}


}


