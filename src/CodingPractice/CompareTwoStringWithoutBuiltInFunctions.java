package CodingPractice;

public class CompareTwoStringWithoutBuiltInFunctions {

	public static void main(String[] args) {
		
		String s1="Sanddep";
		String s2="Sandzep";
		int result=s1.compareTo(s2); /*it will return positive value when first string is greater 
		                             than second sring and vice versa & it will return zero if both string are equal
		 							and here the value is equal to the character ki value ka difference*/
	                               
	    System.out.println(result);      
		
		boolean iscompare=false;
		
		if (s1.length()==s2.length())
		{			
		for (int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)!=s2.charAt(i))
			{
				iscompare=false;
				break;
			}
			
			iscompare=true;
			
		}
		 System.out.println("Both the Strings are equal:"+iscompare);
		}
		
		else System.out.println("Strings are not equal");

	  
	}

}
