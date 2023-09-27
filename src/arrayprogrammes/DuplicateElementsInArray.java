package arrayprogrammes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DuplicateElementsInArray {

	public static void main(String[] args) 
	{
	    //Approach1:   
		String a[]= {"java","c++","python","java","c++"};
		boolean flag=false;
		
	/*	for (int i=0;i<=a.length;i++)
		{
			for(int j=i+1;j<=a.length-1;j++)
			{
				if (a[i]==a[j])
				{
					System.out.println(a[i]+"\t"+ " is duplicate");
					flag=true;
				}
			}
		}
		if (flag ==false) 
		{
			System.out.println("duplicate element not found");
		}*/

		
	//Approach2: 
		
		HashSet<String> dupl=new HashSet<String>();
		
		for (String l:a)
		{
			if(dupl.add(l)==false)
			{
				System.out.println("Duplicated element is :"+l);
				flag=true;
			}
		}
		
		if (flag==false)
		{
			System.out.println("duplicate element not found");		
			
		}
	
	//Remove duplicate element in array
		
     Integer l[]= {1,1,23,44,2,2,2,3,3,3,45,6};
		
	   ArrayList<Integer> mylist= new ArrayList<Integer>(Arrays.asList(l));
	   HashSet<Integer> myset= new HashSet<Integer>(mylist);
	   System.out.println(myset);
		
		
		
		
	     
	
	
	
	
	
	}
	

}
