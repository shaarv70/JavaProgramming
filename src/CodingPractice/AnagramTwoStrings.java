package CodingPractice;

import java.util.Arrays;

public class AnagramTwoStrings {

/*An anagram of a string is another string that contains the same characters,
	only the order of characters can be different. For example, “abcd” and “dabc” are an anagram of each other	*/
	public static void main(String[] args) {
		
		String s1="naman";
		String s2="manai";
		
		char[] a = s1.toCharArray();
		char[] b= s2.toCharArray();
		
		Arrays.sort(a);
		Arrays.sort(b);
		
		boolean finals=Arrays.equals(a, b);
	     if (finals==true)
	     {
	    	 System.out.println("Strings are anagram");
	     }
	     else
	    	 System.out.println("Strings are not anagaram");
	}

}
