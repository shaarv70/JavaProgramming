package CodingPractice;

public class FindSecondLargest {

	public static void main(String[] args) {
	
		int a[]= {2,4,3,6,1};
		
		int firstlargest=a[0];
		int secondLargest=a[0];
		for (int i=0;i<a.length;i++)
		{
			if(a[i]>firstlargest)
			{
				firstlargest=a[i];
			}
		}
		
		System.out.println(firstlargest);
		
		for (int i=0;i<a.length;i++)
		{
			if(a[i]>secondLargest && a[i]!=firstlargest)
			{
				secondLargest=a[i];
				
			}
		}

		System.out.println(secondLargest);
		
	}

}
