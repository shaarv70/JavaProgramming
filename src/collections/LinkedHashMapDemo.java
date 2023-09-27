package collections;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class LinkedHashMapDemo {

	//Note:It will maintain the insertion order, and follow doubly linklist data structure
	public static void main(String[] args) 
	{
		LinkedHashMap<Integer,String> hm=new LinkedHashMap<Integer, String>();
		hm.put(101,"John");
		hm.put(102,"Scott");
		hm.put(103,"John");
		
		System.out.println(hm);

	}

}
