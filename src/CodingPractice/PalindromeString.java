package CodingPractice;

public class PalindromeString {

	public static void main(String[] args) {
		
		String s= "naman";
	
		String rev="";		
		for (int i=s.length()-1;i>=0;i--)
		{
			rev= rev+s.charAt(i);
			
		}

		System.out.println(rev);
	
		String ans=rev.equals(s)?"String is palindrome":"string is not palindrome";
		System.out.println(ans);

}}
