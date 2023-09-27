package CodingPractice;

public class CountNumberofEvenandOddDigitsinNumber {

	public static void main(String[] args) {
	
		int num=306805;
		
		int  evencount=0;
		int oddcount=0;
		int ex=0;
		while(num>0)
		{
			ex=num%10;
			
			if(ex%2==0)
			{
				evencount++;
			}
			
			else 
			{
				oddcount++;
			}
			
			num=num/10;
			
		}
		
		System.out.println(evencount);
		System.out.println(oddcount);

		
		
	}

}
