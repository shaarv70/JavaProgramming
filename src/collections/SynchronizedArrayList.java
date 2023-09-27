package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/*Since array list are not synchronized (thread safe (because it supports multithreading), so to make 
 them synchronized we need to perform certain task
 */
public class SynchronizedArrayList 

{

	public static void main(String[] args)
	{
	     //1. Collections.synchronizedList
		List<String> mylist=Collections.synchronizedList(new ArrayList<String>());//this will generate the synchronized arraylist
		mylist.add("Java");
		mylist.add("Python");
		mylist.add("Ruby");
		
		//add, remove - we dont need any explicit synchronization
		//to fetch/ traverse the values from the list- we have to use explicit synchronization
		synchronized (mylist){
			Iterator<String> it= mylist.iterator();
			while (it.hasNext())
			{
				System.out.println(it.next());
			}
		}
		
		//2 CopyOnWriteArrayList- its a class/ Threadsafe and synchronized already
		CopyOnWriteArrayList <String> mlist= new CopyOnWriteArrayList<String>();
         mlist.add("Tom");
         mlist.add("tony");
         mlist.add("Arvind");//we dont need explicit synchronization for add/remove/traverse
		
		Iterator <String> ti= mlist.iterator();
		while (ti.hasNext())
		{
			System.out.println(ti.next());
		}
	}
		
		
		
		
	}


