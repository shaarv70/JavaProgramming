package javaProgrammes;

import java.util.Scanner;

public class SumDigitInNumber {

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner (System.in);
		int num= sc.nextInt();
		int sum=0;
		int sepnum=0;
		while(num!=0)
		{
			sepnum= num%10;
			sum=sum+sepnum;
			num=num/10;
		}

		System.out.println("sum is :"+sum);
	}

}
