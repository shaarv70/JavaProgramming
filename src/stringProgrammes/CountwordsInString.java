package stringProgrammes;

import java.util.Scanner;

public class CountwordsInString {

	public static void main(String[] args) 
	{
	    // First approach
		Scanner sc= new Scanner(System.in);
		String name = sc.nextLine();
	/*	int i=0;
		int count=1;//always count must be starting from 1
		while (name!=null && i<name.length())
		{
			if(name.charAt(i)==' '&& name.charAt(i+1)!=' ')
			{
				count++;
			}
		  i++;
		
		}
	
		System.out.println(count);*/
	
	//Second approach
		
		String a[]=name.split(" ");
	    System.out.println(a.length);
	     
	
	
	
	
	
	}

}
