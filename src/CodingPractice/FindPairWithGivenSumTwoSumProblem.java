package CodingPractice;

public class FindPairWithGivenSumTwoSumProblem {

	public static void main(String[] args) {
		
		
		int a[] = {10,20,30,40,50,25,10,25};
		int sum=50;
		
		
		for(int i=0;i<a.length;i++) {
			
			int sum1=0;
			
			for (int j=i+1;j<a.length;j++)
			{
				
				sum1=a[i]+a[j];
				
				if(sum1==50)
				{
					
					System.out.println(a[i]+":"+a[j]);
				}
				
				
			}
		}

	}

}
