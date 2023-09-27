package CodingPractice;

import java.util.Arrays;
import java.util.Scanner;

public class SortNamesinArray {

	public static void main(String[] args) {
		
		//1 approach
		String[] a= {"Mango","Banana","Pears"};
          Arrays.sort(a);
		System.out.println(Arrays.toString(a));
         
		
		
		//2 approach
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		String[] s= new String[n];
		Scanner sc1= new Scanner(System.in);
		 String temp=null;
		 for (int i=0;i<n;i++)
		 {
			 s[i]=sc1.nextLine();
			 
	     }
		 
		 for (int j=0;j<n;j++)
		 {
			 
			 for (int k=j+1;k<n;k++)
			 {
				 if(s[j].compareTo(s[k])>0)
				 {
					 temp=s[j];
					 s[j]=s[k];
					 s[k]=temp;
					 
				 }
			 }
		 }
		
		
		System.out.println("After Sorting"+Arrays.toString(s));

	}

}
