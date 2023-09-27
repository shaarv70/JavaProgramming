package CodingPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;


public class CheckWhetherElementpresentin3Arrayispresentinatlease2array {

	public static void main(String[] args) {
		
		 int[] a= {1,2,3,9,8,7};
		 int[] b= {4,1,2,10,15,9};
		 int[] c= {5,1,2,4,10,};
		 
		 Set<Integer> myset= new HashSet<>();

		 for(int d:a)
		 {
			 myset.add(d);
			 
		 }
		 
		 for (int k:b)
		 {
			 myset.add(k);
		 }
		 
		 for(int l:c)
			 
		 {
			 myset.add(l);
		 }
		 List<Integer> mylist= new ArrayList<>(myset);
		 List<Integer> mylist1= new ArrayList<>(Arrays.stream(a).boxed().collect(Collectors.toList()));
		 List<Integer> mylist2= new ArrayList<>(Arrays.stream(b).boxed().collect(Collectors.toList()));
		 List<Integer> mylist3= new ArrayList<>(Arrays.stream(c).boxed().collect(Collectors.toList()));
		 
		 for(int u:mylist)
		 {
			 
			 if((mylist1.contains(u)&& mylist2.contains(u) || 
					 (mylist2.contains(u)&& mylist3.contains(u)||(mylist1.contains(u)&& mylist3.contains(u)))))
				 
			 {
	                 
	                  
	                	  System.out.println(u);
	                  
			 
			 }
		 
		 
	}

}}
