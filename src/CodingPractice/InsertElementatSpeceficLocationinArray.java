package CodingPractice;

import java.util.Arrays;
import java.util.Scanner;

public class InsertElementatSpeceficLocationinArray {
	
	
	public static void main(String Args[])
	{
		
		int []a=new int[5];
		
		
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the location at you want to insert ");
	int location=sc.nextInt();
	System.out.println("Enter the value you want to insert");
	int value=sc.nextInt();
	System.out.println("Enter elements you want to insert in array");	
		for (int i=0;i<a.length-1;i++)
		{
			
			a[i]=sc.nextInt();
		}
		
		System.out.println("Before inserting "+Arrays.toString(a));
		
		for (int j=a.length-1;j>=location;j--)
		{
			
			a[j]=a[j-1];
		   
		}
		
	    a[location]=value;
		
		
		System.out.println("After inserting "+Arrays.toString(a));
		
	}

}
