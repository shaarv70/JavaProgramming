package javaProgrammes;

public class FindLargestof3Numbers {

	public static void main(String[] args) 
	{
	      //1 approach is that bu using if statements
		
		//2 approach  by using ternary operator
		
		int a=10;
		int b=45;
		int c= 9;
		int largest= a>b?a:b;
		largest= largest>c?largest:c;
		System.out.println(largest);

	}

}
