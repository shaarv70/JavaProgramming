package CodingPractice;

import java.util.Arrays;

public class FibonnaciSeries {

	public static void main(String[] args) {
		
		int num=20; //0,1,1,2,3,5,8,13,21,34
		
		int arr[]=new int[20];
		int index=0;
	
		for(int i=0;i<num;i++)
		{
			if(i==0)
			{
				arr[i]=i;
			}
			
			else if(i==1)
			{
				arr[i]=i;
			}
			
			else
				arr[i]=arr[i-2]+arr[i-1];//
			
		}

		for (int c:arr)
		{
			System.out.print(c+" ");
		}
	}

}
