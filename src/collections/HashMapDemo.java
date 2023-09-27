package collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {

	//note: for null key hashcode is always 0, so the index will also be 0
	public static void main(String[] args) 
	{
		//HashMap hm=new HashMap();
		//Map hm=new HashMap();

		//key value can be anything but it must be unique  
		HashMap<Comparable, String> map= new HashMap<Comparable, String>();    //Comparable is used to store different types of key
		map.put(110, "Rohan");
		map.put(111, "Ankit");
		map.put("rat", null);
		map.put("rat", "Chinky");
		//map.put(105, 90);

		System.out.println(map.containsKey("rat"));
		System.out.println(map);

		//adding data pairs to hashmap
		HashMap<Integer,String> hm=new HashMap<Integer, String>();
		hm.put(101,"John");
		hm.put(102,"Scott");
		hm.put(103,"John");
		hm.put(104,"Mary");
		hm.put(101,"David");
		//hm.putAll(map);
		System.out.println(hm); //  {101=David, 102=Scott, 103=John, 104=Mary}

		System.out.println(hm.size()); //4

		//remove pair
		hm.remove(103);   // 103 is key

		System.out.println("After removing pair:"+hm); //{101=David, 102=Scott, 104=Mary}

		System.out.println(hm.get(102));   // here 102 is key   scott


		//print only keys from hashmap // it will take all the keys in a set
		System.out.println(hm.keySet());  //[101, 102, 104]

		//return values 
		System.out.println(map.values());
		for (Object a:map.values())
		{
			System.out.println(a);
		}

		//entryset()- ot will return all entry set
		System.out.println(map.entrySet());//[rat=Chinky, 101=Rohan, 102=Ankit]


		//print values from hashmap

		for(Object k:hm.keySet())
		{
			System.out.println(k+"  "+ hm.get(k)); // getting key values by using get(key) method here 

		}



		//Entry  methods//Map.entry can be used only in that place where we have declared the hashmap as generic
		for (Map.Entry entry:hm.entrySet())
		{
			System.out.println(entry.getKey()+"   "+entry.getValue());
		}

		//iterator

		Set s=hm.entrySet();
		Iterator y= s.iterator();
		while (y.hasNext())
		{
			Map.Entry l=(Entry) y.next();
			System.out.println(l.getKey()+"\t"+l.getValue());
		}



		//Iterate through lambda

		hm.forEach((k,v)->System.out.println("Key:"+k+"and value: "+v));//here hashmap  we are using must have one type of key



		hm.clear(); // to clear entire data of hashmap

		System.out.println(hm);   //{}


		//compare hashmaps---------------------------------------------------------------------

		HashMap<Integer,String>  h1= new HashMap<Integer,String>();
		h1.put(1,"A");
		h1.put(2,"B");
		h1.put(3,"C");

		HashMap<Integer,String>  h2= new HashMap<Integer,String>();
		h2.put(3,"C");
		h2.put(1, "A");
		h2.put(2, "B");

		HashMap<Integer,String>  h3= new HashMap<Integer,String>();
		h3.put(3,"C");
		h3.put(1, "A");
		h3.put(2, "B"); 
		h3.put(3, "D");

		HashMap<Integer,String>  h5= new HashMap<Integer,String>();
		h5.put(1,"A");
		h5.put(2,"B");
		h5.put(3,"C");
		h5.put(4,"C");

		//on basis of key-value pair

		System.out.println(h1.equals(h2));//true
		System.out.println(h1.equals(h3));//false

		//on basis of keyset
		System.out.println(h1.keySet().equals(h3.keySet()));//true


		//Find out the extra key

		HashMap<Integer,String>  h4= new HashMap<Integer,String>();
		h4.put(1,"A");
		h4.put(2, "B");
		h4.put(3, "C");
		h4.put(4, "D");

		HashSet<Integer> l1= new HashSet<Integer>(h4.keySet());
		HashSet<Integer> l2= new HashSet<Integer>(h1.keySet());
		l1.addAll(l2);
		l1.removeAll(l2);
		System.out.println(l1);

		//compare maps by values

		//by array list 
		System.out.println(new ArrayList(h1.values()).equals(new ArrayList<String>(h5.values())));//false

		//by set
		System.out.println(h1.values());	//ITS VALUE is also same as new HashSet(h5.values() but still giving false in last line
		System.out.println(new HashSet<String>(h5.values()));
		System.out.println(new HashSet<String>(h1.values()).equals(new HashSet<String>(h5.values())));//true 


		//Convert hashmap into arraylist

		//1 approach
		HashMap<Integer,String> mymap1= new HashMap();
		mymap1.put(100,"200");
		mymap1.put(200, "300"); 
		mymap1.put(500, "789");

		//	List<HashMap<Integer,String>> mylist= new ArrayList();	
		//	mylist.add(0, mymap1);

		//	System.out.println(mylist.get(0));

		//2 approach (naveen)

		//	mymap1.forEach((k,v)->System.out.println("key="+ k +"\t"+ "value"+ v));

		//3 approach

		List <Integer>  mylist2= new ArrayList(mymap1.keySet());
		for (Integer e:mylist2)
		{
			System.out.println(e);
		}

		List <String>  mylist7= new ArrayList(mymap1.values());
		for (String e:mylist7)
		{
			System.out.println(e);
		}






	}

}

