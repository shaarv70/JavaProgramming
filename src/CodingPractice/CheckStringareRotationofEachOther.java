package CodingPractice;

public class CheckStringareRotationofEachOther {
	
	
	public static void main(String Args[])
	{
		/*Fopr strings rotation we check whether two strings have same number of characters or not */
		
		String s= "abcd";
		String k="cdab";
		
		if (s==null || s.length()<0)
		{
			System.out.println("String is not rotated");
		}
		
		else
		if (s.length()!=k.length())
		{
			System.out.println("String is not rotated");
		}
		
		else {
			      String sf =s+s;  //abcdabcd
			      
			    String t= sf.contains(k)?"String is rotational":"String is not rotational";
			    System.out.println(t);
		}
		
		
		
		
		
		
		
		
		
	}
		
	
	
	

}
