package CodingPractice;

public class PrintElementsatEvenPosition {

	public static void main(String[] args) {
		
		int[] a= {1,10,2,20,30,40};
		
		
		for (int i=1;i<a.length;i++)
		{
			
			
			if(i%2==0)
			{
				
				System.out.println(a[i]);
			}
		}
		
		

	}

}
