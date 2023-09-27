package CodingPractice;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringwithoutRepetition {

	public static void main(String[] args) {
	
		
		String a="abcda";
		
		
		String longest="";
	    
		Set<Character> myset=new HashSet<>();
		
		
		for (int i=0;i<a.length();i++)
		{
			
			String current="";
			for (int j=i;j<a.length();j++)
			{
				char ch= a.charAt(j);
				if(myset.contains(ch))
				{
					myset.clear();
				   	
				    break;
				}
			
				 current+=ch;
			   myset.add(ch);
			   
			  
			}  
			
		
			   if(current.length()>=longest.length())
			   {
				   longest=current;
				   System.out.println(longest);
			   }
			   
			  
			  }
			
		
		}
   
	}


