package CodingPractice;

import java.util.Arrays;

public class DeleteElementinArray {

	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,5};
		int ele= 2;
	    int fresh[] =new int[a.length-1];
		int length1=a.length-1;
		int index=0;
		for (int i=0;i<a.length;i++)
		{
			if (a[i]!=ele)
			{
				fresh[index]=a[i];
				index++;
			}
		}
		System.out.println(Arrays.toString(fresh));
		}

	}


