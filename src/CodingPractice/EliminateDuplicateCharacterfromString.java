package CodingPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import javax.print.attribute.HashAttributeSet;

public class EliminateDuplicateCharacterfromString {

	public static void main(String[] args) {
		
		
		String s="Banagalore";
		StringBuilder sf= new StringBuilder();
		Set<Character> myset= new HashSet<>();
	   char[] c=s.toCharArray();
	
	   for (int i=0;i<c.length;i++)
	   {
		   int num=0;
		   
		   if(myset.contains(c[i]))
		   {
			   continue;
		   }
		   else
		   {
		   for(int j=i+1;j<c.length;j++)
			   
		   {
			   if(c[i]==c[j])
			   {
				   num=1;
				    myset.add(c[i]);
				   break;
			   }
		   }
	      
	         if(num==0)
	         {
	        	 sf.append(c[i]);
	         }
		   }
	   
	   }
	   System.out.println(sf.toString());
	   
	}}

