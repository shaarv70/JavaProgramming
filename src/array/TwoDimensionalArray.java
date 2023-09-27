package array;

public class TwoDimensionalArray {

	public static void main(String[] args) 
	{
	    
		//Approach 1:
		int a[][]=new int[3][2];
		
		//approach2:
		int [][]c= new int[2][4];
		
		//approach 3:
		
		int []b[]=new int[2][4];
		
		
		a[0][0]=100;
		a[0][1]=200;
		a[1][0]=400;
		a[1][1]=600;
		a[2][0]=900;
		a[2][1]=800;
		
		int k[][]= {{100,200},{200,300}};
		int y[][]= {{100,200},
			        {200,300}};
		
		//get number of rows
		
		System.out.println(k.length);
		
		//get number of columns
		
		System.out.println(a[0].length);
		
		//read specefic value of array
		
		System.out.println(k[1][1]);
		
		//read data from array using classic for loop
		
		for (int i=0;i<k.length;i++) 
		{
			for (int j=0;j<a[i].length;j++)
			{
				System.out.print(k[i][j]+" ");
			}
		
			System.out.println();
		
		}
			
		
		//read data from using adcanced for loop
		
		for(int x[]:k)       //this line will fetch 1st row data initially, and will store those values in 1d array
		{
			for(int v:x)
		
			{
		        System.out.print(v+" ");
			}
		System.out.println();
		}
		
		
		
		}

	}

