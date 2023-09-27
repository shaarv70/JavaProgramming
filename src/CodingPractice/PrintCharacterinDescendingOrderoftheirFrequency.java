package CodingPractice;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class PrintCharacterinDescendingOrderoftheirFrequency {

	public static void main(String[] args) 
	{
	      String my="banana";
	      
	      Map<Character,Integer> mymap=new HashMap<>();
	      
	      char[] c =my.toCharArray();
	      
	      for (char f:c)
	      {
	    	  mymap.put(f, mymap.containsKey(f)?mymap.get(f)+1:1);
	    	  
	      }
	   
	      // Map's size
	      int size = mymap.size();
	   
	      // While there are elements in the map
	      while (size > 0)
	      {
	   
	          // Finding the maximum value
	          // from the map
	          int currentMax = 0;
	          char character = 0;
	          for (Map.Entry<Character,
	                          Integer> myentry : mymap.entrySet())
	          {
	              if (myentry.getValue() > currentMax )
	              {
	            	  character = myentry.getKey();
	                  currentMax = myentry.getValue();
	              }
	          }
	   
	          // Print the character
	          // alongwith its frequency
	          System.out.print(character + " - " +
	                           currentMax + "\n");
	   
	          // Delete the maximum value
	          mymap.remove(character);
	          
	          size--;
	      }
	  }
         

}
