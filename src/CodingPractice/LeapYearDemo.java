package CodingPractice;

public class LeapYearDemo {

	public static void main(String[] args) {
		
//Leap year is the year having 366 days
//Logic: year divisble by 400 or year divisible by 4  and should not be divisible by 100 is called leap year		
		
  
		int year= 2028;
		
		if(year%100!=0)
		{
			
			if((year%400==0) || (year%4==0))
			{
				System.out.println("Leap year");
			}
			
			else
				System.out.println("Not a leap year");
		}
		
		else
			System.out.println("Not a leap year");
		
		
		
		
		
	}

}
