package CodingPractice;


import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateFromString {

	public static void main(String[] args) {
	
		String s="Geeks for Geeks";
		
		StringBuilder sf= new StringBuilder();
	/*	Set<Character> myset= new HashSet<Character>();
		StringBuffer sf= new StringBuffer();
	
		
		char []a=s.toCharArray();
		for (Character f:a)
		{
			if(myset.add(f))
			{
				sf.append(f);
			}
		}
		
		System.out.println(sf.toString());
*/
	//Approach2
		
		for (int i=0;i<s.length();i++)
		{
			int j;
			for ( j=0;j<i;j++)
			{
				if(s.charAt(i)==s.charAt(j))
				{
					break;
				}
			}
			
			if(i==j)
			{
				sf.append(s.charAt(i));
			}
			
			
		}
	
	
	System.out.println(sf.toString());
	
	
	
	
	
	}

}
