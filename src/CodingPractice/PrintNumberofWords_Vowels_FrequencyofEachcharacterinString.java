package CodingPractice;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class PrintNumberofWords_Vowels_FrequencyofEachcharacterinString {

	public static void main(String[] args) {
		
		
       String my="Learn with Krishna Sandeep.";
       
       int wordcount=0;
       int vowelcount=0;
      
       Map<Character,Integer> mymap= new HashMap<Character,Integer>();
     
    	 
    	   for (int i=0;i<my.length();i++)
    	  {
    		   char c= my.charAt(i);
    		   
    		   switch(c)
     		  {
     		  case ' ' :
     		  case '.' :
     		 
     		  wordcount++;
     		    
     		  }
    		   
    		  switch(c)
    		  {
    		  case 'a':
    		  case 'e':
    		  case 'i':
    		  case 'o':
    		  case 'u':
    		  vowelcount++;
    		    
    		  }
    		  
    		  mymap.put(c, mymap.containsKey(c)?mymap.get(c)+1:1); //[l,1]
    	  }
    	  
    	  
     
	       for (Entry<Character,Integer> s:mymap.entrySet()) {
	    	   
	    	   System.out.print(s.getKey()+"\t");
	    	   System.out.println(s.getValue());
	    	   
	       }
	       
	       System.out.println("vowelcount is:"+ vowelcount);
	       System.out.println("Number of words is:"+ wordcount);
	}

}
