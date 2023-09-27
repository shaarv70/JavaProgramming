package CodingPractice;

import java.util.Arrays;
import java.util.Scanner;

public class ReadnbynMatrixfromuser {

	public static void main(String[] args) {
		
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the number of rows");
		int rows=sc.nextInt();
		
		System.out.println("tnter the number of columns");
		int columns=sc.nextInt();
		
		int [][]a=new int [rows][columns];
		for (int i=0;i<rows;i++)
		{
			for (int j=0;j<columns;j++)
			{
				a[i][j]=sc.nextInt();
				
			}
			
		}

		
	for (int i=0;i<rows;i++)
	{
		for(int j=0;j<columns;j++)
		{
			System.out.print(a[i][j]+"\t");
		}
	    System.out.println();
	
	
	}
	
	
	}

}
