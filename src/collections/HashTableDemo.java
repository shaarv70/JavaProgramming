package collections;

import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


public class HashTableDemo {

	public static void main(String[] args) 
	{
	   Hashtable table = new Hashtable();
     
	   table .put(101,"Rohan");
       table.put(102, "aarti");
       table.put("Cat", 678);
       table.put(107, "Chanchal");
       table.put(false, "ramanm");
       //table.put(null, null);       not accepted
       System.out.println(table);
       
       Hashtable<Integer,String> table1 = new Hashtable(16,0.95f);//initial capacity, load factor
        table1.put(120, "Chintu");
        table1.put(133, "lallan");
        table1.put(564, "Orange");
     //   table.putAll(table1);
        System.out.println(table);
        
        //fetching a value 
        
        System.out.println(table.get(101));
       
        //Removing a value 
        
        table.remove("Cat");
        System.out.println(table ); 
        
        //Check particular key or value  is present
        
        table.containsKey(false);//true
       System.out.println(table1.containsValue(678));//false
       
       System.out.println(table.isEmpty());//false
       
       //keyset
       System.out.println(table.keySet());
      
       for (Object c:table.keySet())
       {
    	   System.out.println(table.get(c));
       }
       
       //values//Map.entry can be used only in that place where we have declared the hashmap as generic
       System.out.println(table.values());
       
       //Entry specefic methods
       
  /*     for (Map.Entry tr:table1.entrySet())
       {
    	   System.out.println(tr.getKey()+" "+tr.getValue());
       }*/
       
       //using iterator 
       
       Set s = new HashSet(table.entrySet()); 
       
       Iterator t= s.iterator();
       while (t.hasNext())
       {
    	   Map.Entry k=(Entry) t.next();
    	   System.out.println(k.getKey()+"  "+k.getValue());
       }
	}

}
