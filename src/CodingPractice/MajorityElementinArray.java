package CodingPractice;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MajorityElementinArray {
	
	//If an element is present more than n/2 times then it is majority element  n=array length

	public static void main(String[] args) {
		
      int a[]= {2,3,4,5,2,3,3,3,3};
		
      Map<Integer,Integer> mymap= new HashMap<Integer,Integer>();
      
      for (int c:a)  
      {
    	  
    	  mymap.put(c, mymap.containsKey(c)?mymap.get(c)+1:1);
    	  
      }
    
      for (Map.Entry<Integer, Integer> mymaps:mymap.entrySet())
      {
    	  if(mymaps.getValue()>(a.length/2))
    	  {
    		 System.out.println(mymaps.getKey());
    	  }
      }
		
		
	}

}
