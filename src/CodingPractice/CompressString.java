package CodingPractice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class CompressString {

	public static void main(String[] args) {
		
		String s="aaabbbccdd"; // O/p must be a3b3c2d2
		
		char[] p=s.toCharArray();
		Map<Character,Integer> mymap= new HashMap<Character,Integer>();	
		for (char c:p) {
    
            mymap.put(c,mymap.containsKey(c)?mymap.get(c)+1:1);
    
          }
		StringBuilder sf= new StringBuilder();
		
	    for (Map.Entry<Character,Integer> myentry:mymap.entrySet())
	    {
	   	
	    	sf.append(myentry.getKey());
	    	sf.append(myentry.getValue());
	    }
	    
	    System.out.println(sf.toString());
		
		
	}

}
