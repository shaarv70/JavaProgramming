package CodingPractice;

public class FactorialofNumberUsingRecursion {

	public static void main(String[] args) {
		
		int num=5;
	
		System.out.println(fact(num));
		
		}

	public static int fact(int num) {
		
	    if(num==0)
	    {
	    	return 1;
	    }
	    
	    return (num*fact(--num));	
	}

}
