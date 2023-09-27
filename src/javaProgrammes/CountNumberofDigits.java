package javaProgrammes;

import java.util.Scanner;

public class CountNumberofDigits {

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner (System.in);
		int num= sc.nextInt();     //837
		 int count=0;
		 int sepnum=0;
		
		while (num!=0)
		{  
			sepnum = num%10;    //   7,3,8 
			count++;        //1,
		   num=num/10;
		}
       System.out.println("Number of digits are :"+count);
	}

}
