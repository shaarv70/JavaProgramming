package CodingPractice;

import java.util.Scanner;

public class HappyNumber {
	
	
	public static boolean happy(int num) {
	while (num>9)
	{   
		int sum=0;
	  	int last=0;
			
			while (num>0)
			{
				last=num%10;
				sum=sum+ (last*last);
				num=num/10;
				
			}
			
		num=sum;  
		
	}
	return num==1||num==7;
	}
	public static void main(String[] args) {
		int count=0;
		for (int i=1;i<=100;i++)
		{
			
			if(happy(i))
			{
				System.out.print(i+"\t");
				count++;
			}
		}
		System.out.println("\n"+"The number of happy numbers from 1 to 100: is"+count);
	}

}
