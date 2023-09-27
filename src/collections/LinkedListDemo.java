package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) 
	{
	   LinkedList mylist= new LinkedList();
	   
	   mylist.add(23); // this will add the object to end of the list
	   mylist.add(1, "element");
	   mylist.add(null);
	   mylist.add(98);
	   
	   //mylist.add(all)- this will add objecvts of another collection to the end of this list
	   System.out.println(mylist);
	   //mylist.remove();// removes the first element
	 //  System.out.println(mylist);
	  // mylist.remove(1);//remove element at this index
	   //System.out.println(mylist);
	   
	   //get element from list
	   
	   System.out.println(mylist.get(2));
	   
	   //changing  value of existing element
	   
	   mylist.set(2, "Rohan");
	   System.out.println(mylist);
	   
	   
	   //Stack- First in Last Out
	   //Queue- First in First Out
	   
	   mylist.addFirst("rohanj");//adding element to first 
	   mylist.addLast(null);

	   mylist.getFirst();//return first element 
	   mylist.getLast();//return last selement
	   
	   //iterating in ascending order 
	   for (Object e:mylist)
	   {
          System.out.println(e);		   
	}
	   
	   //iterating in descending order
       LinkedList mylist2= new LinkedList();
	   
	   mylist2.add(23); // this will add the object to end of the list
	   mylist2.add(1, "element");
	   mylist2.add(null);
	   mylist2.add(98);
	   
	   Iterator it= mylist2.descendingIterator();
	   while (it.hasNext())
	   {
		   System.out.println(it.next());
	   }

	   LinkedList mylist1=new LinkedList();
	   mylist1.add(null);
	   mylist1.add(456);
	   mylist1.add("Element");
	   
	   
	   mylist.addAll(mylist1);
	   System.out.println(mylist);
	   
	   mylist.removeAll(mylist1);
	   System.out.println(mylist);
	   
	   //sort
	 //  System.out.println(Collections.sort());This will sort the collection   

	
	//shuffling
	   
	 //  System.out.println(Collections.shuffle());here it will take argument as a collection of generic type 
	   
	   //converting array to arraylist
	   String a[]= {"dog","cat","Elephant","snail"};
        System.out.println(Arrays.toString(a));	
        ArrayList<String> al= new ArrayList<String>(Arrays.asList(a));
        System.out.println(al);
	
	}}
