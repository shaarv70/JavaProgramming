package CodingPractice;
import java.util.Map;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class FindFirstNonRepeatedCharacter {

	public static void main(String[] args) 
	{
	
		String  g="tenalitenrama like ";
		
		char[] a= g.toCharArray();
		
		Map<Character,Integer> mymap= new LinkedHashMap<Character,Integer>(g.length());
		for(char f:a)
		{
			mymap.put(f, mymap.containsKey(f)?mymap.get(f)+1:1);
		}
		
		for (Entry<Character,Integer> myentry:mymap.entrySet())
		{
			if(myentry.getValue()==1)
			{
				System.out.println(myentry.getKey());
				break;
			}
		
		   
		
		
		}
		
		
		
		

	}

}
