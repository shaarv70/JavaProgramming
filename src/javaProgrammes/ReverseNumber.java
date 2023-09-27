package javaProgrammes;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner (System.in);
		int num= sc.nextInt();//786
	/*	int numrev=0;
		//Approach 1
		while(num!=0)
		{
			numrev =numrev*10+num%10;   //6
			
		    num= num/10;      //78
		}
    
		System.out.println("Reverse number is :"+numrev);
	*/
	
	    //Approach2:Using stringbuffer
		
		String s=String.valueOf(num); //Converting primitive datatype to non primitive data type
	    
	//	StringBuffer n= new StringBuffer(s);
	//	System.out.println(n.reverse().toString());
		
		//Approach3: Using StringBuilder
		
		StringBuilder k= new StringBuilder(s);
		System.out.println(k.reverse().toString());

	}

}
