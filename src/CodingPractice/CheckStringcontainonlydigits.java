package CodingPractice;

public class CheckStringcontainonlydigits {

	public static void main(String[] args) {
		
	
		
		
		String s="1234";
		System.out.println(s.matches("[0-9]+"));
		boolean isdigit=false;
	  
		for (int i=0;i<s.length();i++)
			
		{
			if(!Character.isDigit(s.charAt(i)))

	         	{      
				isdigit=true;
				       
			     }
		}
		
		if(isdigit)
			
		{
			System.out.println("Not contain");
		}
		
		else 
			System.out.println("Contain digits");
		
		
		
	}}
