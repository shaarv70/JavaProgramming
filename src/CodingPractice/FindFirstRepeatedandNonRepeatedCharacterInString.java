package CodingPractice;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class FindFirstRepeatedandNonRepeatedCharacterInString {

	public static void main(String[] args) {
		
		String s="GeeksforGeeks";
	    char ch[]=s.toCharArray();
		Map<Character,Integer> mymap=new TreeMap<Character,Integer>();
	
	    for (char c:ch)
	    {
	    	
	    	mymap.put(c, mymap.containsKey(c)?mymap.get(c)+1:1);
	
        }
	    
	    System.out.println(mymap);
	   for (Entry<Character,Integer> myentry:mymap.entrySet())
	   {
		   if(myentry.getValue()==1)
		   {
			   System.out.println("First non repeated character is "+myentry.getKey());
			   break;
		   }
	   }
	       for (Entry<Character,Integer> myentry:mymap.entrySet())
		   {
			   if(myentry.getValue()>1)
			   {
				   System.out.println("First repeated character is "+myentry.getKey());
				  break;
			   }
	   

	}

}}
