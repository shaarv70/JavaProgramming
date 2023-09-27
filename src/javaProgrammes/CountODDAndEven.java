package javaProgrammes;

import java.util.Scanner;

public class CountODDAndEven {

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner (System.in);
		int num= sc.nextInt();
		int sepnum=0;
		int even=0;
		int odd=0;
		
		while (num!=0)
		{
			sepnum= num%10;
			if (sepnum%2==0)
			{
				even++;
			}
		
			else 
			{
				odd++;
			}
		
		    num=num/10;
		
		}

		  System.out.println("Number of odd digits are :"+odd);
		  System.out.println("Number of even digits are :"+even);
	}

}
