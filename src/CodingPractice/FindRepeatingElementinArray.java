package CodingPractice;

import java.util.HashSet;
import java.util.Set;

public class FindRepeatingElementinArray {

	public static void main(String[] args) 
	{
	   int a[]= {4,2,3,5,1,2,4,5};
	   
      Set<Integer> myset=new HashSet<>();
      
	   for(int g:a)
	   {
		   
		   if(myset.add(g))
		   {
			   continue;
			   
		   }
		   
		   else
		   {
			   System.out.println(g);
		   }
		   
		   
		   
	   }
	   
	   
	   
	}

}
