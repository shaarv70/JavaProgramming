package CodingPractice;

public class PrintnumberwithoutusingLoop {

	public static void main(String[] args) {
		
		
		
		printNumber(1);
		

	}

	public static void printNumber(int num) {
		
		
		
		if(num<=20)
		{
			System.out.println(num);
		    num++;
			printNumber(num);
		}
		
	}

	
}
