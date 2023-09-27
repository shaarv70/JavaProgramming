package CodingPractice;

public class NumberPrimeorNot {

	public static void main(String[] args) {
	
		int a=7;
		
		boolean isprime=false;
		for(int i=2;i<=a/2;i++)
		{
			
			if(a%i==0)
			{
				
				isprime=true;
				
			}
		}

		if(isprime==true)
		{
			System.out.println("Number is not prime");
		}
		
		else
			System.out.println("Number is prime");
		
	}

}
