package CodingPractice;

public class FindFirstandLastDigitofNumberandtheirSum {

	public static void main(String[] args) {
		
		
		int c=12349;
		int sum=0;
		int last=c%10;   //% this will fetch the last digit

		 while(c>10)
		{
			  c=c/10 ;  //this will return the remaining number except last digit of number or quotient
			 
			 
		}
		 
             
		 sum=c+last;
		 System.out.println(sum);
	}

}
