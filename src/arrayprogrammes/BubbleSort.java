package arrayprogrammes;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) 
	{
	    
		int s[]= {13,2,10,4,9};
		
		for (int i=0;i<s.length-1;i++ )// Each time inner for loop will sent a new array after sorting the 
			//last element(bubble element) and this sorted array will go again in inner for loop
		
		{
			for (int j=0;j<s.length-1;j++)//This loop will sort the last element(bde element ko sbse last me rkhega har iteration ke baad)
			{
				if (s[j]>s[j+1])
				{
					int temp=0;
					temp=s[j];
					s[j]=s[j+1];
					s[j+1]=temp;
				}
			        
			}
			
				
			
		}
		
			System.out.println(Arrays.toString(s));
	}

}
